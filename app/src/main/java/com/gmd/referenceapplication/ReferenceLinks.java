package com.gmd.referenceapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class ReferenceLinks extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_reference_links);


        //creates toolbar
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

//defines textViews and makes them linkable
        TextView t1 = (TextView) findViewById(R.id.link1);
        t1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t2 = (TextView) findViewById(R.id.link2);
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        //can add more in here
//        TextView t2 = (TextView) findViewById(R.id.idhere);
//        t2.setMovementMethod(LinkMovementMethod.getInstance());

    }

    //manages app bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.overflow, menu);
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
                //startActivity(new Intent(this, ExampleListView.class));
                return true;

            case R.id.home:
                //Go back to the home screen
                startActivity(new Intent(this, MainActivity.class));
                return true;

            case R.id.search:
                //open search
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
