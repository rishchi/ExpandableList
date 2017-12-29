package com.example.rishabh.quizapp;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Rishabh on 6/18/2017.
 */

public class ExpandableListViewAdapter extends BaseExpandableListAdapter {
    static String [] groupNames={"Math","Science"};
    static String[][] childNames={{"Geometry","Algebra I","Algebra II/Trig","Precalculus"},{"Biology","Chemistry","Physics 1","AP Chemistry"}};
    Context context;
    public ExpandableListViewAdapter(Context context)
    {
        this.context=context;
    }

    @Override
    public int getGroupCount() {
        return groupNames.length;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return childNames[groupPosition].length;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return groupNames[groupPosition];
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return childNames[groupPosition][childPosition];
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
         return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        TextView myParentText= new TextView(context);
        myParentText.setText(groupNames[groupPosition]);
        myParentText.setPadding(100,0,0,0);
        myParentText.setTextSize(35);
        return myParentText;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        final TextView myChildText= new TextView(context);
        myChildText.setText(childNames[groupPosition][childPosition]);
        myChildText.setPadding(200,0,0,0);
        myChildText.setTextSize(20);
        myChildText.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Toast.makeText(context,myChildText.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });;
        return myChildText;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }

    public void childOnClick(int groupPosition, int childPosition, ExpandableListView parent, long id)
    {
        //Intent level2= new Intent(this, Level2.class);
        //startActivity(level2);
    }

}
