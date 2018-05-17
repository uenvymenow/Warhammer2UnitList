package com.example.u_n_v.warhammer2unitlist.WoodElves;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.u_n_v.warhammer2unitlist.NameList.NameAdapter;
import com.example.u_n_v.warhammer2unitlist.NameList.UnitName;
import com.example.u_n_v.warhammer2unitlist.R;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.AncientTreeman;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.Branchwraith;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.Durthu;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.GladeLordF;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.GladeLordM;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.SpellsingerBeasts;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.SpellsingerLife;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.SpellsingerShadows;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.Waystalker;

import java.util.ArrayList;

public class WoodElves extends AppCompatActivity {

    private ListView unit;
    private NameAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wood_elves);

        // Create an ArrayList of type UnitNames
        final ArrayList<UnitName> woodElfNames = new ArrayList<>();
        woodElfNames.add(new UnitName("Glade Lord (M)"));
        woodElfNames.add(new UnitName("Glade Lord (F)"));
        woodElfNames.add(new UnitName("Ancient Treeman"));
        woodElfNames.add(new UnitName("Durthu"));
        woodElfNames.add(new UnitName("Waystalker"));
        woodElfNames.add(new UnitName("Spellsinger (Shadows)"));
        woodElfNames.add(new UnitName("Spellsinger (Beasts)"));
        woodElfNames.add(new UnitName("Spellsinger (Life)"));
        woodElfNames.add(new UnitName("Branchwraith"));

        unit = findViewById(R.id.unitName);

        mAdapter = new NameAdapter(this, woodElfNames);

        unit.setAdapter(mAdapter);


        unit.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int item = position;
                if (item == 0) {
                    Intent woodElvesStatIntent = new Intent(WoodElves.this, GladeLordM.class);
                    startActivity(woodElvesStatIntent);
                } else if (item == 1) {
                    Intent woodElvesIntent = new Intent(WoodElves.this, GladeLordF.class);
                    startActivity(woodElvesIntent);
                } else if (item == 2) {
                    Intent woodElvesIntent = new Intent(WoodElves.this, AncientTreeman.class);
                    startActivity(woodElvesIntent);
                } else if (item == 3) {
                    Intent woodElvesIntent = new Intent(WoodElves.this, Durthu.class);
                    startActivity(woodElvesIntent);
                } else if (item == 4) {
                    Intent woodElvesIntent = new Intent(WoodElves.this, Waystalker.class);
                    startActivity(woodElvesIntent);
                } else if (item == 5) {
                    Intent woodElvesIntent = new Intent(WoodElves.this, SpellsingerShadows.class);
                    startActivity(woodElvesIntent);
                } else if (item == 6) {
                    Intent woodElvesIntent = new Intent(WoodElves.this, SpellsingerBeasts.class);
                    startActivity(woodElvesIntent);
                } else if (item == 7) {
                    Intent woodElvesIntent = new Intent(WoodElves.this, SpellsingerLife.class);
                    startActivity(woodElvesIntent);
                } else if (item == 8) {
                    Intent woodElvesIntent = new Intent(WoodElves.this, Branchwraith.class);
                    startActivity(woodElvesIntent);
                }
            }
        });
    }
}
