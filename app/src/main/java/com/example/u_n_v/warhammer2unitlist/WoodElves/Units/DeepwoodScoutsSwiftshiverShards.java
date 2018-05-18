package com.example.u_n_v.warhammer2unitlist.WoodElves.Units;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.u_n_v.warhammer2unitlist.R;
import com.example.u_n_v.warhammer2unitlist.Stats.StatAdapter;
import com.example.u_n_v.warhammer2unitlist.Stats.UnitStats;

import java.util.ArrayList;

public class DeepwoodScoutsSwiftshiverShards extends AppCompatActivity {

    private ListView unitStats;
    private StatAdapter statAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deepwood_scouts_swiftshiver_shards);

        final ArrayList<UnitStats> woodElfList = new ArrayList<>();
        woodElfList.add(new UnitStats("Deepwood Scouts (Swiftshiver Shards)", "Missile Infantry", "80 - Small", "850", "5280", "15", "68", "38", "18", "22", "26", "7", "22 + Magical Attacks", "135", "37"));

        unitStats = findViewById(R.id.statList);

        statAdapter = new StatAdapter(this, woodElfList);

        unitStats.setAdapter(statAdapter);
    }
}
