package com.example.u_n_v.warhammer2unitlist;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.NameList;

import java.util.ArrayList;
import java.util.List;

public class NameAdapter extends ArrayAdapter<UnitName> {

    // Set temporary variables for State
    private Context mContext;
    private List<UnitName> nameList = new ArrayList<>();

    public NameAdapter(@NonNull Context context, @LayoutRes ArrayList<UnitName> list){
        super(context, 0, list);
        mContext = context;
        nameList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View nameListView = convertView;
        if (nameListView == null) {
            nameListView = LayoutInflater.from(getContext()).inflate(R.layout.name_list, parent, false);
        }
        
        UnitName currentName = getItem(position);
        
        // Find the TextView for the Name TextView
        TextView unitName = nameListView.findViewById(R.id.unitName);

        // Set the Unit Name to be in the Name TextView
        unitName.setText(currentName.getUnitName());

        // Returns the nameListView
        return nameListView;
    }
}
