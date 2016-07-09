package com.gmd.referenceapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayCommonConstants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_common_constant);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        ListViewItem constant_data[] = new ListViewItem[]
                {
                        new ListViewItem(R.drawable.star, "Atomic Mass Constant", "1.660 539 040 e-27", "kg", "  "),
                        new ListViewItem(R.drawable.star, "Avogadro Constant", "6.022 140 857 e23"," mol^-1", "  "),
                        new ListViewItem(R.drawable.star, "Boltzmann Constant", "1.380 648 52 e-23", "K^-1", "  "),
                        new ListViewItem(R.drawable.star, "Conductance Quantum", "7.748 091 7310 e-5", "s", "  "),
                        new ListViewItem(R.drawable.star, "Electric Constant", "8.854 187 817... e-12", "F m^-1", "  "),

                        new ListViewItem(R.drawable.star, "Electron mass", "9.109 383 56 e-31", "kg", "  "),
                        new ListViewItem(R.drawable.star, "Electron volt", "1.602 176 6208 e-19"," J", "  "),
                        new ListViewItem(R.drawable.star, "Elementary charge ", "1.602 176 6208 e-19", "C", "  "),
                        new ListViewItem(R.drawable.star, "Faraday constant ", "96 485.332 89 e-5", "C mol^-1", "  "),
                        new ListViewItem(R.drawable.star, "Fine-structure constant ", "7.297 352 5664 e-3", "  ", "  "),

                        new ListViewItem(R.drawable.star, "Inverse fine-structure constant", "137.035 999 139", "  ", "  "),
                        new ListViewItem(R.drawable.star, "magnetic constantt", "4pi e-7 = 12.566 370 614... e-7"," N A^-2", "  "),
                        new ListViewItem(R.drawable.star, "magnetic flux quantum", "2.067 833 831 e-15", "Wb", "  "),
                        new ListViewItem(R.drawable.star, "molar gas constant", "8.314 4598", "J mol^-1 K^-1", "  "),
                        new ListViewItem(R.drawable.star, "Newtonian constant of gravitation ", "6.674 08 e-11", "m^3 kg^-1 s^-2", "  "),

                        new ListViewItem(R.drawable.star, "Planck constant", "6.626 070 040 e-34", "J s", "  "),
                        new ListViewItem(R.drawable.star, "Planck constant over 2 pi", "1.054 571 800 e-34"," J s", "  "),
                        new ListViewItem(R.drawable.star, "proton mass", "1.672 621 898 e-27", "kg", "  "),
                        new ListViewItem(R.drawable.star, "proton-electron mass ratio", "1836.152 673 89", "  ", "  "),
                        new ListViewItem(R.drawable.star, "Rydberg constant", "10 973 731.568 508", "m^-1", "  "),

                        new ListViewItem(R.drawable.star, "speed of light in vacuum", "299 792 458", "m s^-1", "  "),
                        new ListViewItem(R.drawable.star, "Stefan-Boltzmann constant", "5.670 367 e-8", "W m^-2 K^-4", "  ")
                };

        ListViewItemAdapter adapter = new ListViewItemAdapter(this,
                R.layout.listview_item_row, constant_data);


        ListView listView1 = (ListView)findViewById(R.id.listview);



        listView1.setAdapter(adapter);


        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id){
                TextView txtview =(TextView)view.findViewById(R.id.txtTitle);
                TextView txtunit = (TextView)view.findViewById(R.id.txtUnit);

                String item = txtview.getText().toString() + "  " + txtunit.getText().toString();

                //String item = ((TextView)view).getText().toString();

                Toast.makeText(getBaseContext(), item, Toast.LENGTH_LONG).show();


            }

        });

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
                startActivity(new Intent(DisplayCommonConstants.this, FundamentalPhysicalConstants.class));
                return true;

            case R.id.joes_rules:
                //go to rules
                return true;

            case R.id.home:
                startActivity(new Intent(DisplayCommonConstants.this, MainActivity.class));
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
