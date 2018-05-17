package com.example.u_n_v.warhammer2unitlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class HighElves extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_elves);

        // Create an ArrayList of type UnitNames
        ArrayList<UnitName> highElfNames = new ArrayList<>();

        highElfNames.add(new UnitName("Glade Lord"));

        // Find UnitName TextView
        final TextView unitName = findViewById(R.id.unitName);

        if (unitName.getText().equals("Glade Lord")){
            unitName.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent highElvesIntent = new Intent(HighElves.this, HighElvesUnitStats.class);
                    startActivity(highElvesIntent);
                }
            });
        }


    }
}
