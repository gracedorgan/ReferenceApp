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

public class SearchableActivity extends AppCompatActivity {

    DatabaseTable db= new DatabaseTable(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchable);

        this.setDefaultKeyMode(Activity.DEFAULT_KEYS_SEARCH_LOCAL);

        //creates toolbar
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);



//        get the intent sent when user searches from search widget, verify the action and extract what is typed in
        Intent intent = getIntent();
        handleIntent(intent);

        }

    //creates menu

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.overflow, menu);


        SearchView searchView = (SearchView) menu.findItem(R.id.search).getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                //search button is pressed
                String[] colums = new String[]{"QUANTITY"};
                Cursor c=db.getWordMatches(query,colums);
                Log.e("cursor returned",String.valueOf(c));
                doSearch(c);

                Log.e("searchable activity","text submitted");

                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // User changed the text
                Cursor c=db.getWordMatches(newText,null);
                doSearch(c);

                Log.e("searchable activity ", "haha losing will to live");
                return true;
            }
        });

        SearchManager searchManager =
                (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        searchView =
                (SearchView) menu.findItem(R.id.search).getActionView();
        searchView.setSearchableInfo(
                searchManager.getSearchableInfo(getComponentName()));

        return true;

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


            //still need to process Cursor and display results
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


        ListView sl =(ListView)findViewById(android.R.id.list);

        String[] from = new String[] {"QUANTITY", "_id"};
        int[] to = new int[] {android.R.id.text1};
        SimpleCursorAdapter cursorAdapter = new SimpleCursorAdapter(this, android.R.layout.simple_list_item_1, c, from, to);
        sl.setAdapter(cursorAdapter);
        Log.e("doSearch method:", "has been called");

        sl.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> parent, View view,
                                            int position, long id) {
                        // When clicked, show a toast with the TextView text
                        Log.e("doSearch method:", "Answer: " + ((TextView) view).getText());
                    }
                });
    }



    //manages activity bar

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.constants:
                startActivity(new Intent(this, FundamentalPhysicalConstants.class));
                return true;

            case R.id.joes_rules:
                //go to rules
                //startActivity(new Intent(MainActivity.this, ExampleListView.class));
                return true;

            case R.id.home:
                //Go back to the home screen
                startActivity(new Intent(this, MainActivity.class));
                return true;

            case R.id.search:
                //open search
                //startActivity(new Intent(this, SearchableActivity.class));
                return true;

            case R.id.links:
                //go to referencelinks
                startActivity(new Intent(this, ReferenceLinks.class));
                return true;

            case R.id.base_units:
                //go to baseunits
                startActivity(new Intent(this, SIBaseUnits.class));
                return true;


            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }



}
