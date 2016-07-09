package com.gmd.referenceapplication;

import android.app.Activity;
import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class SearchableActivity extends AppCompatActivity {

    DatabaseTable db= new DatabaseTable(this);

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchable);

        this.setDefaultKeyMode(Activity.DEFAULT_KEYS_SEARCH_LOCAL);

        //creates toolbar
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        mListView = (ListView)findViewById(R.id.list);

        Log.d("Search", "Getting in here");
//        get the intent sent when user searches from search widget, verify the action and extract what is typed in
        Intent intent = getIntent();
        handleIntent(intent);
    }





    public void onNewIntent(Intent intent) {
        setIntent(intent);
        handleIntent(intent);
    }

    private void handleIntent(Intent intent) {

        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);
            Cursor c = db.getWordMatches(query, null);
            doSearch(c);
            Log.e("Search Operation", "Database searched");
        }
    }

    public void onListItemClick(ListView l,
                                View v, int position, long id) {
        // call detail activity for clicked entry
    }



    private void doSearch(Cursor query) {
        // get a Cursor, prepare the ListAdapter
        // and set it
        Cursor c = query;
        startManagingCursor(c);


        String[] from = new String[] {"QUANTITY", "_id"};
        int[] to = new int[] {android.R.id.text1};
        SimpleCursorAdapter cursorAdapter = new SimpleCursorAdapter(this, android.R.layout.simple_list_item_1, c, from, to);
        mListView.setAdapter(cursorAdapter);
        Log.e("doSearch method:", "has been called");

        mListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> parent, View view,
                                            int position, long id) {
                        // When clicked, show a toast with the TextView text
                        Log.e("doSearch method:", "Answer: " + ((TextView) view).getText());
                    }
                });
    }
}
