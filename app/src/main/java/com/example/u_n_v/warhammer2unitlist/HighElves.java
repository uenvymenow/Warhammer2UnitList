package com.example.u_n_v.warhammer2unitlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

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

        highElfNames.add(new UnitName("Glade Lord (M)"));
        highElfNames.add(new UnitName("Glade Lord (F)"));

        unit = findViewById(R.id.unitName);

        mAdapter = new NameAdapter(this, highElfNames);

        unit.setAdapter(mAdapter);

        unit.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int item = position;
                if (item == 0) {
                    Intent highElvesStatIntent = new Intent(HighElves.this, HighElvesUnitStats.class);
                    startActivity(highElvesStatIntent);
                } // else if ((item + 1) == 1){
//                    Intent highElvesIntent = new Intent(HighElves.this, HighElvesUnitStats.class);
//                    startActivity(highElvesIntent);
//                }
//                Toast.makeText(HighElves.this, item + "", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
