package com.gmd.referenceapplication;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.text.TextUtils;
import android.util.Log;

import com.gmd.referenceapplication.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by gmd on 6/8/2016.
 */
public class DatabaseTable {


    public static final String TAG = "ConstantDatabase";

    //the columns included in the table
    public static final String COL_QUANTITY = "QUANTITY";
    public static final String COL_VALUE = "VALUE";
    public static final String COL_UNCERTAINTY = "UNCERTAINTY";
    public static final String COL_UNIT = "UNIT";
    public static final String _id = "_id";
//name, tbale name, version
    private static final String DATABASE_NAME = "CONSTANTS";
    private static final String FTS_VIRTUAL_TABLE = "FTS";
    private static final int DATABASE_VERSION = 1;


    private final DatabaseOpenHelper mDatabaseOpenHelper;
    private final Context mcontext;





    public DatabaseTable(Context context){
        mDatabaseOpenHelper = new DatabaseOpenHelper(context);
        mcontext = context;

    }

    private  class DatabaseOpenHelper extends SQLiteOpenHelper {

        private final Context mHelperContext = mcontext;


       // private final DatabaseOpenHelper hDatabaseOpenHelper =  new DatabaseOpenHelper(mHelperContext);// Stack Overflow error here

        private SQLiteDatabase mDatabase;
        private final MyDataProvider dp = new MyDataProvider(mcontext);


        private static final String FTS_TABLE_CREATE =
                "CREATE VIRTUAL TABLE " + FTS_VIRTUAL_TABLE +
                        " USING fts3 (" +_id+ " INTEGER PRIMARY KEY,"+
                        COL_QUANTITY + " TEXT, " +
                        COL_VALUE + " TEXT," +
                        COL_UNCERTAINTY + " TEXT," +
                        COL_UNIT + " TEXT " + ")";

        public DatabaseOpenHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
            //loadConstants();
            Log.e("Database Operation", "DatabaseOpenHelper constructor called, constants loaded?");



        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            mDatabase = db;
            if (db == null) throw new IllegalArgumentException();

            Log.e("Create Statement", FTS_TABLE_CREATE);
            mDatabase.execSQL(FTS_TABLE_CREATE);
            Log.e("Database Operation", "Constants Table Created ....");
            loadConstants();

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            Log.w(TAG, "Upgrading database from version " + oldVersion + " to "
                    + newVersion + ", which will destroy all old data");
            db.execSQL("DROP TABLE IF EXISTS " + FTS_VIRTUAL_TABLE);
            onCreate(db);
        }

        public SQLiteDatabase getmDatabase(){
            return mDatabase;
        }


//        populating the virtual table with a string reading code


        private void loadConstants() {
            new Thread(new Runnable() {
                public void run() {
                    try {
                        loadConstantss();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }).start();

            Log.e("Loading", "Constants Table Populated ...");
        }

        private void loadConstantss() throws IOException {

            HashMap map = dp.getAllMap();

            Iterator<Map.Entry<String, ListViewItem>> entries = map.entrySet().iterator();
            while (entries.hasNext()) {
                Map.Entry<String, ListViewItem> entry = entries.next();
                Log.d("thing:", entry.getKey());
               addConstant(entry.getKey(), entry.getValue().getValueS(), entry.getValue().getUncertainty(), entry.getValue().getUnit());

            }




//            final Resources resources = mHelperContext.getResources();
//            InputStream inputStream = resources.openRawResource(R.raw.txt);
//            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
//
//            try {
//                String line;
//                while ((line = reader.readLine()) != null) {
//                    String[] strings = TextUtils.split(line, ",");
//                    if (strings.length < 4) continue;
//                    long id = addConstant(strings[0].trim(), strings[1].trim(), strings[2].trim(), strings[3].trim());
//                    if (id < 0) {
//                        Log.e(TAG, "unable to add word: " + strings[0].trim());
//                    }
//                }
//            } finally {
//                reader.close();
//            }
        }

        public long addConstant(String quantity, String value, String uncertainty, String unit) {
            //SQLiteDatabase db = this.getWritableDatabase();
            SQLiteDatabase db = getWritableDatabase();


            ContentValues initialValues = new ContentValues();
            initialValues.put(COL_QUANTITY, quantity);
            initialValues.put(COL_VALUE, value);
            initialValues.put(COL_UNCERTAINTY, uncertainty);
            initialValues.put(COL_UNIT, unit);


            db.insert(FTS_VIRTUAL_TABLE, null, initialValues);
            return db.insert(FTS_VIRTUAL_TABLE, null, initialValues);
        }


        //database openhelper ends

    }




    public Cursor getWordMatches(String query, String[] columns) {
        String selection = COL_QUANTITY + " MATCH ?";
        String[] selectionArgs = new String[] {query+"*"};


        return query(selection, selectionArgs, columns);
    }


    public Cursor query(String selection, String[] selectionArgs, String[] columns) {
        //Log.e("Arguments query", "selection = " + selection + " selectionArgs: "+ selectionArgs.toString() + " columns: "+ columns.toString()  );
        SQLiteQueryBuilder builder = new SQLiteQueryBuilder();
        builder.setTables(FTS_VIRTUAL_TABLE);

        Cursor cursor = builder.query(mDatabaseOpenHelper.getReadableDatabase(),
                columns, selection, selectionArgs, null, null, null);

        if (cursor == null) {
            return null;
        } else if (!cursor.moveToFirst()) {
            cursor.close();
            return null;
        }
        return cursor;
    }

    //get all titles
    public Cursor getAllTitles()
    {
        return mDatabaseOpenHelper.getmDatabase().query(FTS_VIRTUAL_TABLE, new String[] {
                        COL_QUANTITY,
                        COL_UNCERTAINTY,
                        COL_UNIT,
                        COL_VALUE},
                null,
                null,
                null,
                null,
                null);
    }


}
