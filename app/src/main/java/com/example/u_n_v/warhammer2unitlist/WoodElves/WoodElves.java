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
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.DeepwoodScouts;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.DeepwoodScoutsSwiftshiverShards;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.Dryads;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.Durthu;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.EternalGuard;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.EternalGuardShields;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.ForestDragon;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.GladeGuard;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.GladeGuardHagbaneTips;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.GladeGuardStarfireShafts;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.GladeLordF;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.GladeLordM;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.GladeRiders;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.GladeRidersHagbaneTips;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.GreatEagle;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.HawkRiders;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.Orion;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.SistersOfTheThorn;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.SpellsingerBeasts;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.SpellsingerLife;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.SpellsingerShadows;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.TreeKin;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.Treeman;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.Wardancers;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.WardancersAsraiSpears;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.Waystalker;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.Waywatchers;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.WildRiders;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.WildRidersShields;
import com.example.u_n_v.warhammer2unitlist.WoodElves.Units.WildwoodRangers;

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
        woodElfNames.add(new UnitName("Eternal Guard"));
        woodElfNames.add(new UnitName("Dryads"));
        woodElfNames.add(new UnitName("Eternal Guard (Shields)"));
        woodElfNames.add(new UnitName("Wardancers"));
        woodElfNames.add(new UnitName("Wardancers (Asrai Spears)"));
        woodElfNames.add(new UnitName("Wildwood Rangers"));
        woodElfNames.add(new UnitName("Glade Guard"));
        woodElfNames.add(new UnitName("Glade Guard (Hagbane Tips)"));
        woodElfNames.add(new UnitName("Glade Guard (Starfire Shafts)"));
        woodElfNames.add(new UnitName("Deepwood Scouts"));
        woodElfNames.add(new UnitName("Deepwood Scouts (Swiftshiver Shards)"));
        woodElfNames.add(new UnitName("Waywatchers"));
        woodElfNames.add(new UnitName("Wild Riders"));
        woodElfNames.add(new UnitName("Wild Riders (Shields)"));
        woodElfNames.add(new UnitName("Glade Riders"));
        woodElfNames.add(new UnitName("Glade Riders (Hagbane Tips)"));
        woodElfNames.add(new UnitName("Hawk Riders"));
        woodElfNames.add(new UnitName("Sisters of the Thorn"));
        woodElfNames.add(new UnitName("Great Eagle"));
        woodElfNames.add(new UnitName("Tree Kin"));
        woodElfNames.add(new UnitName("Treeman"));
        woodElfNames.add(new UnitName("Forest Dragon"));
        woodElfNames.add(new UnitName("Orion"));

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
                } else if (item == 9) {
                    Intent woodElvesIntent = new Intent(WoodElves.this, EternalGuard.class);
                    startActivity(woodElvesIntent);
                } else if (item == 10) {
                    Intent woodElvesIntent = new Intent(WoodElves.this, Dryads.class);
                    startActivity(woodElvesIntent);
                } else if (item == 11) {
                    Intent woodElvesIntent = new Intent(WoodElves.this, EternalGuardShields.class);
                    startActivity(woodElvesIntent);
                } else if (item == 12) {
                    Intent woodElvesIntent = new Intent(WoodElves.this, Wardancers.class);
                    startActivity(woodElvesIntent);
                } else if (item == 13) {
                    Intent woodElvesIntent = new Intent(WoodElves.this, WardancersAsraiSpears.class);
                    startActivity(woodElvesIntent);
                } else if (item == 14) {
                    Intent woodElvesIntent = new Intent(WoodElves.this, WildwoodRangers.class);
                    startActivity(woodElvesIntent);
                } else if (item == 15) {
                    Intent woodElvesIntent = new Intent(WoodElves.this, GladeGuard.class);
                    startActivity(woodElvesIntent);
                } else if (item == 16) {
                    Intent woodElvesIntent = new Intent(WoodElves.this, GladeGuardHagbaneTips.class);
                    startActivity(woodElvesIntent);
                } else if (item == 17) {
                    Intent woodElvesIntent = new Intent(WoodElves.this, GladeGuardStarfireShafts.class);
                    startActivity(woodElvesIntent);
                } else if (item == 18) {
                    Intent woodElvesIntent = new Intent(WoodElves.this, DeepwoodScouts.class);
                    startActivity(woodElvesIntent);
                } else if (item == 19) {
                    Intent woodElvesIntent = new Intent(WoodElves.this, DeepwoodScoutsSwiftshiverShards.class);
                    startActivity(woodElvesIntent);
                } else if (item == 20) {
                    Intent woodElvesIntent = new Intent(WoodElves.this, Waywatchers.class);
                    startActivity(woodElvesIntent);
                } else if (item == 21) {
                    Intent woodElvesIntent = new Intent(WoodElves.this, WildRiders.class);
                    startActivity(woodElvesIntent);
                } else if (item == 22) {
                    Intent woodElvesIntent = new Intent(WoodElves.this, WildRidersShields.class);
                    startActivity(woodElvesIntent);
                } else if (item == 23) {
                    Intent woodElvesIntent = new Intent(WoodElves.this, GladeRiders.class);
                    startActivity(woodElvesIntent);
                } else if (item == 24) {
                    Intent woodElvesIntent = new Intent(WoodElves.this, GladeRidersHagbaneTips.class);
                    startActivity(woodElvesIntent);
                } else if (item == 25) {
                    Intent woodElvesIntent = new Intent(WoodElves.this, HawkRiders.class);
                    startActivity(woodElvesIntent);
                } else if (item == 26) {
                    Intent woodElvesIntent = new Intent(WoodElves.this, SistersOfTheThorn.class);
                    startActivity(woodElvesIntent);
                } else if (item == 27) {
                    Intent woodElvesIntent = new Intent(WoodElves.this, GreatEagle.class);
                    startActivity(woodElvesIntent);
                } else if (item == 28) {
                    Intent woodElvesIntent = new Intent(WoodElves.this, TreeKin.class);
                    startActivity(woodElvesIntent);
                } else if (item == 29) {
                    Intent woodElvesIntent = new Intent(WoodElves.this, Treeman.class);
                    startActivity(woodElvesIntent);
                } else if (item == 30) {
                    Intent woodElvesIntent = new Intent(WoodElves.this, ForestDragon.class);
                    startActivity(woodElvesIntent);
                } else if (item == 31) {
                    Intent woodElvesIntent = new Intent(WoodElves.this, Orion.class);
                    startActivity(woodElvesIntent);
                }
            }
        });
    }
}
