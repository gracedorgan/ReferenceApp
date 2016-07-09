package com.gmd.referenceapplication;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.SearchView.OnQueryTextListener;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.support.v7.widget.SearchView;

public class MainActivity extends AppCompatActivity {
    DatabaseTable dbHelper = new DatabaseTable(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);













    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.overflow, menu);


        MenuItem myActionMenuItem = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) menu.findItem(R.id.search).getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                //search button is pressed

//                if( ! searchView.isIconified()) {
//                    searchView.setIconified(true);
//                }
//                myActionMenuItem.collapseActionView();

                Log.e("search","text submitted");

                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // User changed the text
                Cursor c=dbHelper.getWordMatches(newText,null);

                Log.e("search: ", "haha losing will to live");
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





    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.constants:
                startActivity(new Intent(MainActivity.this, FundamentalPhysicalConstants.class));
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
