package com.example.fitbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class WeeklyChallenges extends AppCompatActivity {

    public static final String LOG_TAG = WeeklyChallenges.class.getName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekly_challenges);

        ArrayList<String> list = new ArrayList<>();

        list.add("Day 1");
        list.add("Day 2");
        list.add("Day 3");
        list.add("Day 4");
        list.add("Day 5");
        list.add("Day 6");
        list.add("Day 7");

        ListView itemListView = (ListView)findViewById(R.id.weeklylistView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
        itemListView.setAdapter(adapter);

        itemListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                    startActivity(new Intent(WeeklyChallenges.this, LoggedIn.class));
            }
        });
    }

}
