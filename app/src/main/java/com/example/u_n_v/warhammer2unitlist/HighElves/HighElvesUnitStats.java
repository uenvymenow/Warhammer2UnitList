package com.example.u_n_v.warhammer2unitlist.HighElves;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.u_n_v.warhammer2unitlist.R;
import com.example.u_n_v.warhammer2unitlist.Stats.StatAdapter;
import com.example.u_n_v.warhammer2unitlist.Stats.UnitStats;

import java.util.ArrayList;

public class HighElvesUnitStats extends AppCompatActivity {

    private ListView unitStats;
    private StatAdapter statAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_elves_unit_stats);

//        final ArrayList<UnitStats> highElfList = new ArrayList<>();
//        highElfList.add(new UnitStats("Glade Lord (M)", "1","1257", "3908", "50", "70", "46", "65", "60", "360", "30", "30 + Magical Attacks", "190", "389"));
//        highElfList.add(new UnitStats("Glade Lord (F)", "1", "1343", "3908", "50", "70", "46", "65", "60", "360", "30", "30 + Magical Attacks", "190", "389"));

//        unitStats = findViewById(R.id.statList);
//
//        statAdapter = new StatAdapter(this, highElfList);
//
//        unitStats.setAdapter(statAdapter);
    }
}
