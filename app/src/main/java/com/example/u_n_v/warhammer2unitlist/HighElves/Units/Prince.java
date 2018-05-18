package com.example.u_n_v.warhammer2unitlist.HighElves.Units;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.u_n_v.warhammer2unitlist.R;
import com.example.u_n_v.warhammer2unitlist.Stats.StatAdapter;
import com.example.u_n_v.warhammer2unitlist.Stats.UnitStats;

import java.util.ArrayList;

public class Prince extends AppCompatActivity {

    private ListView unitStats;
    private StatAdapter statAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prince);

        final ArrayList<UnitStats> highElfList = new ArrayList<>();
        highElfList.add(new UnitStats("Prince", "Sword Infantry", "1 - Small", "1334", "4068", "80 + Shielded", "80", "36", "60", "60", "400", "30", "N/A", "N/A", "N/A"));

        unitStats = findViewById(R.id.statList);

        statAdapter = new StatAdapter(this, highElfList);

        unitStats.setAdapter(statAdapter);
    }
}
