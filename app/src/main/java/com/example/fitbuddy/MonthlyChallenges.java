package com.example.fitbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MonthlyChallenges extends AppCompatActivity {

    public static final String LOG_TAG = WeeklyChallenges.class.getName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monthly_challenges);

        ArrayList<String> list = new ArrayList<>();

        list.add("Day 1");
        list.add("Day 2");
        list.add("Day 3");
        list.add("Day 4");
        list.add("Day 5");
        list.add("Day 6");
        list.add("Day 7");
        list.add("Day 8");
        list.add("Day 9");
        list.add("Day 10");
        list.add("Day 11");
        list.add("Day 12");
        list.add("Day 13");
        list.add("Day 14");
        list.add("Day 15");
        list.add("Day 16");
        list.add("Day 17");
        list.add("Day 18");
        list.add("Day 19");
        list.add("Day 20");
        list.add("Day 21");
        list.add("Day 22");
        list.add("Day 23");
        list.add("Day 24");
        list.add("Day 25");
        list.add("Day 26");
        list.add("Day 27");
        list.add("Day 28");
        list.add("Day 29");
        list.add("Day 30");

        ListView itemListView
                = (ListView)findViewById(R.id.monthlylistView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        itemListView.setAdapter(adapter);

    }
}
