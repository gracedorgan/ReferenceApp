package com.gmd.referenceapplication;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.gmd.referenceapplication.ListViewItem;
import com.gmd.referenceapplication.R;

/**
 * Created by gmd on 6/9/2016.
 */
public class ListViewItemAdapter extends ArrayAdapter<ListViewItem> {

    Context context;
    int layoutResourceId;
    ListViewItem data[]= null;

    public  ListViewItemAdapter(Context context, int layoutResourceId, ListViewItem[] data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        WeatherHolder holder = null;

        if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            holder = new WeatherHolder();
            holder.imgIcon = (ImageView)row.findViewById(R.id.imgIcon);
            holder.txtTitle = (TextView)row.findViewById(R.id.txtTitle);
            holder.txtValue = (TextView)row.findViewById(R.id.txtValue);
            holder.txtUnit = (TextView)row.findViewById(R.id.txtUnit);

            row.setTag(holder);
        }
        else
        {
            holder = (WeatherHolder)row.getTag();
        }

        ListViewItem weather = data[position];
        holder.txtTitle.setText(weather.title);
        holder.txtValue.setText(weather.value);
        holder.txtUnit.setText(weather.unit);
        holder.imgIcon.setImageResource(weather.icon);

        return row;
    }

    static class WeatherHolder
    {
        ImageView imgIcon;
        TextView txtTitle;
        TextView txtValue;
        TextView txtUnit;
    }


}
