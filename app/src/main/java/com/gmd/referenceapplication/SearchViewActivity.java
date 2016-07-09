package com.gmd.referenceapplication;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.widget.CursorAdapter;
import android.support.v4.widget.SimpleCursorAdapter;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by Grace on 7/9/2016.
 */
public class SearchViewActivity extends AppCompatActivity {

    SimpleCursorAdapter cursorAdapter;
    DatabaseTable dbHelper = new DatabaseTable(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        cursorAdapter = new SimpleCursorAdapter(this, android.R.layout.simple_list_item_1, null,
                new String[]{DatabaseTable.COL_QUANTITY}, new int[]{android.R.id.text1});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.overflow, menu);


        MenuItem myActionMenuItem = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) menu.findItem(R.id.search).getActionView();
        searchView.setSuggestionsAdapter(cursorAdapter);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                Intent intent = new Intent(SearchViewActivity.this, SearchableActivity.class);
                intent.setAction(Intent.ACTION_SEARCH);
                intent.putExtra(SearchManager.QUERY, query);
                startActivity(intent);

                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // User changed the text
                Cursor c = dbHelper.getWordMatches(newText,null);
                cursorAdapter.swapCursor(c);
                return true;
            }
        });

        SearchManager searchManager =
                (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        searchView =
                (SearchView) menu.findItem(R.id.search).getActionView();

        SearchableInfo searchableInfo = searchManager.getSearchableInfo(getComponentName());
        searchView.setSearchableInfo(searchableInfo);


        return true;
    }

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
                return true;

            case R.id.search:
                //open search
                startActivity(new Intent(this, SearchableActivity.class));
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
