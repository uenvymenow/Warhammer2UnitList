package com.example.u_n_v.warhammer2unitlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.u_n_v.warhammer2unitlist.HighElves.HighElves;
import com.example.u_n_v.warhammer2unitlist.WoodElves.WoodElves;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find High Elves Text View
        TextView highElves = findViewById(R.id.highElves);
        // Set onClickListener to see if High Elves TextView was clicked
        highElves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent highElvesIntent = new Intent(MainActivity.this, HighElves.class);
                startActivity(highElvesIntent);
            }
        });

        // Find Wood Elves Text View
        TextView woodElves = findViewById(R.id.woodElves);
        // Set onClickListener to see if High Elves TextView was clicked
        woodElves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent woodElvesIntent = new Intent(MainActivity.this, WoodElves.class);
                startActivity(woodElvesIntent);
            }
        });
    }
}
