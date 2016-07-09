package com.gmd.referenceapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class FundamentalPhysicalConstants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fundamental_physical_constants);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    public void goToCommon(View view){
        startActivity(new Intent(FundamentalPhysicalConstants.this, CommonConstants.class));
    }

    public void goToElectro(View view){
        startActivity(new Intent(FundamentalPhysicalConstants.this, ElectromagneticConstants.class));
    }

    public void goToAtomic(View view){
        startActivity(new Intent(FundamentalPhysicalConstants.this, AtomicNuclearConstants.class));
    }

    public void goToChem(View view){
        startActivity(new Intent(FundamentalPhysicalConstants.this, PhysicoChemicalConstants.class));
    }

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

                return true;

            case R.id.joes_rules:
                //go to rules
                return true;

            case R.id.home:
                startActivity(new Intent(FundamentalPhysicalConstants.this, MainActivity.class));
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

//    listView.setOnItemClickListener(new OnItemClickListener() {
//        @Override
//        public void onItemClick(AdapterView<?> parent, View view,
//        int position, long id) {
//            Toast.makeText(getApplicationContext(),
//                    "Click ListItem Number " + position, Toast.LENGTH_LONG)
//                    .show();
//        }
//    });

}
