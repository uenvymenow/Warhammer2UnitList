package com.example.u_n_v.warhammer2unitlist.WoodElves.Units;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.u_n_v.warhammer2unitlist.R;
import com.example.u_n_v.warhammer2unitlist.Stats.StatAdapter;
import com.example.u_n_v.warhammer2unitlist.Stats.UnitStats;

import java.util.ArrayList;

public class GladeRidersHagbaneTips extends AppCompatActivity {

    private ListView unitStats;
    private StatAdapter statAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glade_riders_hagbane_tips);

        final ArrayList<UnitStats> woodElfList = new ArrayList<>();
        woodElfList.add(new UnitStats("Glade Riders (Hagbane Tips)", "Missile Cavalry", "60 - Large", "800", "5280", "15", "58", "94", "28", "24", "27", "24", "20", "150", "23 + Poison"));

        unitStats = findViewById(R.id.statList);

        statAdapter = new StatAdapter(this, woodElfList);

        unitStats.setAdapter(statAdapter);
    }
}
