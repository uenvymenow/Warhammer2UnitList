package com.example.u_n_v.warhammer2unitlist.HighElves.Units;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.u_n_v.warhammer2unitlist.R;
import com.example.u_n_v.warhammer2unitlist.Stats.StatAdapter;
import com.example.u_n_v.warhammer2unitlist.Stats.UnitStats;

import java.util.ArrayList;

public class Princess extends AppCompatActivity {

    private ListView unitStats;
    private StatAdapter statAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_princess);

        final ArrayList<UnitStats> highElfList = new ArrayList<>();
        highElfList.add(new UnitStats("Princess", "Hybrid Weapon Infantry", "1 - Small", "1255", "4068", "50", "80", "40", "65", "45", "400", "30", "40", "180", "306"));

        unitStats = findViewById(R.id.statList);

        statAdapter = new StatAdapter(this, highElfList);

        unitStats.setAdapter(statAdapter);
    }
}
