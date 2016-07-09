package com.gmd.referenceapplication;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by gmd on 6/13/2016.
 */
public class MyCustomAdapter extends BaseExpandableListAdapter {

    private Context context;
    private HashMap<String,ListViewItem> constantsHashMap;
    private List<String> constantList;

    public MyCustomAdapter(Context context, HashMap<String, ListViewItem> hashMap, List<String> list){

        constantsHashMap = hashMap;
        this.context = context;
        this.constantList = list;

    }



    public View getChildView(int groupPosition,
                             int childPosition,
                             boolean isLastChild,View convertView, ViewGroup parent)  {
        Spanned childTitle = getChild(groupPosition, childPosition).toSpanned();
        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.child_layout, parent, false);
        }
        TextView childTextView = (TextView) convertView.findViewById(R.id.textViewChild);
        childTextView.setText(childTitle);
        return convertView;


    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }

    @Override
    public int getGroupCount() {
        return this.constantList.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return 1;
    }

    @Override
    public String getGroup(int groupPosition) {
        return constantList.get(groupPosition);
    }

    @Override
    public ListViewItem getChild(int groupPosition, int childPosition) {
        return constantsHashMap.get(this.constantList.get(groupPosition));
                }


    @Override
    public long getGroupId(int groupPosition) {
        return 0;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String groupTitle = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater inflater =
                    (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.parent_layout, parent, false);
        }
        TextView parentTextView = (TextView) convertView.findViewById(R.id.textViewParent);
        parentTextView.setText(groupTitle);
        return convertView;
        }
    }

