package com.example.u_n_v.warhammer2unitlist;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class StatAdapter extends ArrayAdapter<UnitStats> {

    // Set temporary variables for State
    private Context mContext;
    private List<UnitStats> statList = new ArrayList<>();

    public StatAdapter(@NonNull Context context, @LayoutRes ArrayList<UnitStats> list){
        super(context, 0, list);
        mContext = context;
        statList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View statListView = convertView;
        if (statListView == null) {
            statListView = LayoutInflater.from(getContext()).inflate(R.layout.stat_view, parent, false);
        }

        UnitStats currentStat = getItem(position);

        // Find the TextView for the Name TextView
        TextView unitName = statListView.findViewById(R.id.unitName);
        // Set the Unit Name to be in the Name TextView
        unitName.setText(currentStat.getUnitName());

        // Unit Count
        TextView unitCount = statListView.findViewById(R.id.unitCount);
        unitCount.setText(currentStat.getUnitCount());

        // Unit Health
        TextView unitHealth = statListView.findViewById(R.id.unitHealth);
        unitHealth.setText(currentStat.getUnitHealth());

        // Unit Armour
        TextView unitArmour = statListView.findViewById(R.id.unitArmour);
        unitArmour.setText(currentStat.getUnitArmour());

        // Unit Leadership
        TextView unitLeadership = statListView.findViewById(R.id.unitLeadership);
        unitLeadership.setText(currentStat.getUnitLeadership());

        // Unit Speed
        TextView unitSpeed = statListView.findViewById(R.id.unitSpeed);
        unitSpeed.setText(currentStat.getUnitSpeed());

        // Unit Melee Attack
        TextView unitMeleeAttack = statListView.findViewById(R.id.unitMeleeAtk);
        unitMeleeAttack.setText(currentStat.getUnitMeleeAtk());

        // Unit Melee Defense
        TextView unitMeleeDefense = statListView.findViewById(R.id.unitMeleeDef);
        unitMeleeDefense.setText(currentStat.getUnitMeleeDef());

        // Unit Weapon Strength
        TextView unitWeaponStrength = statListView.findViewById(R.id.unitWeaponStr);
        unitWeaponStrength.setText(currentStat.getUnitWeaponStr());

        // Unit Charge Bonus
        TextView unitChargeBonus = statListView.findViewById(R.id.unitChargeBonus);
        unitChargeBonus.setText(currentStat.getUnitChargeBonus());

        // Unit Ammunition
        TextView unitAmmunition = statListView.findViewById(R.id.unitAmmunition);
        unitAmmunition.setText(currentStat.getUnitAmmunition());

        // Unit Range
        TextView unitRange = statListView.findViewById(R.id.unitRange);
        unitRange.setText(currentStat.getUnitRange());

        // Unit Missile Damage
        TextView unitMissileDamage = statListView.findViewById(R.id.unitMissileDmg);
        unitMissileDamage.setText(currentStat.getUnitMissileDmg());

        // Returns the statListView
        return statListView;
    }
}
