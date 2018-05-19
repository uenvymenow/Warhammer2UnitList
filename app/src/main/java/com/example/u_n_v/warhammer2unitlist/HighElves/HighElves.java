package com.example.u_n_v.warhammer2unitlist.HighElves;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.u_n_v.warhammer2unitlist.HighElves.Units.Prince;
import com.example.u_n_v.warhammer2unitlist.HighElves.Units.Princess;
import com.example.u_n_v.warhammer2unitlist.NameList.NameAdapter;
import com.example.u_n_v.warhammer2unitlist.NameList.UnitName;
import com.example.u_n_v.warhammer2unitlist.R;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.GladeLordF;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.GladeLordM;

import java.util.ArrayList;

public class HighElves extends AppCompatActivity {

    private ListView unit;
    private NameAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_elves);

        // Create an ArrayList of type UnitNames
        final ArrayList<UnitName> highElfNames = new ArrayList<>();
        highElfNames.add(new UnitName(0, 0, 0, 0,"Princess"));
        highElfNames.add(new UnitName(0, 0, 0, 0,"Prince"));


        unit = findViewById(R.id.unitName);

        mAdapter = new NameAdapter(this, highElfNames);

        unit.setAdapter(mAdapter);

        unit.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int item = position;
                if (item == 0) {
                    Intent highElvesStatIntent = new Intent(HighElves.this, Princess.class);
                    startActivity(highElvesStatIntent);
                } else if (item == 1) {
                    Intent highElvesIntent = new Intent(HighElves.this, Prince.class);
                    startActivity(highElvesIntent);
                }
//                Toast.makeText(HighElves.this, item + "", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
