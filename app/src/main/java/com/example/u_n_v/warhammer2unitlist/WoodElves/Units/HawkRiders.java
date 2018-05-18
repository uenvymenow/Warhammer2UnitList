package com.example.u_n_v.warhammer2unitlist.WoodElves.Units;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.u_n_v.warhammer2unitlist.R;
import com.example.u_n_v.warhammer2unitlist.Stats.StatAdapter;
import com.example.u_n_v.warhammer2unitlist.Stats.UnitStats;

import java.util.ArrayList;

public class HawkRiders extends AppCompatActivity {

    private ListView unitStats;
    private StatAdapter statAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hawk_riders);

        final ArrayList<UnitStats> woodElfList = new ArrayList<>();
        woodElfList.add(new UnitStats("Hawk Riders", "Flying Missile Cavalry", "24 - Large", "950", "4560", "15", "60", "110", "25", "18", "45 + Armour Piercing", "42", "22", "140", "43"));

        unitStats = findViewById(R.id.statList);

        statAdapter = new StatAdapter(this, woodElfList);

        unitStats.setAdapter(statAdapter);
    }
}
