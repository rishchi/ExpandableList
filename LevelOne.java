package com.example.rishabh.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

public class LevelOne extends AppCompatActivity {

    ExpandableListView expandableListView;
    ExpandableListViewAdapter expandableListViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_one);

        expandableListView= (ExpandableListView) findViewById(R.id.ExpandableListView);
        ExpandableListViewAdapter adapter= new ExpandableListViewAdapter(LevelOne.this);

        expandableListView.setAdapter(adapter);

    }
}
