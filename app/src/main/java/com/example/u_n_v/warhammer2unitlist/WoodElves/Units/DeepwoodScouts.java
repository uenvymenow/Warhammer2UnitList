package com.example.u_n_v.warhammer2unitlist.WoodElves.Units;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.u_n_v.warhammer2unitlist.R;
import com.example.u_n_v.warhammer2unitlist.Stats.StatAdapter;
import com.example.u_n_v.warhammer2unitlist.Stats.UnitStats;

import java.util.ArrayList;

public class DeepwoodScouts extends AppCompatActivity {

    private ListView unitStats;
    private StatAdapter statAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deepwood_scouts);

        final ArrayList<UnitStats> woodElfList = new ArrayList<>();
        woodElfList.add(new UnitStats("Deepwood Scouts", "Missile Infantry", "80 - Small", "700", "5280", "15", "68", "38", "18", "22", "26", "7", "22", "180", "23"));

        unitStats = findViewById(R.id.statList);

        statAdapter = new StatAdapter(this, woodElfList);

        unitStats.setAdapter(statAdapter);
    }
}
