package com.example.u_n_v.warhammer2unitlist.NameList;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.u_n_v.warhammer2unitlist.R;

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

        // Find the ImageView for the Faction Image 1
        ImageView unitFaction1 = nameListView.findViewById(R.id.raceIcon1);
        // Check whether the array has an image
        if (currentName.faction1HasImage()){
            // If an image is available, display the provide image based on resource id
            unitFaction1.setImageResource(currentName.getFactionImage1());
            // Make the image visible
            unitFaction1.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the imageResource
            unitFaction1.setVisibility(View.GONE);
        }

        // Find the ImageView for the Faction Image 2
        ImageView unitFaction2 = nameListView.findViewById(R.id.raceIcon2);
        // Check whether the array has an image
        if (currentName.faction2HasImage()){
            // If an image is available, display the provide image based on resource id
            unitFaction2.setImageResource(currentName.getFactionImage2());
            // Make the image visible
            unitFaction2.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the imageResource
            unitFaction2.setVisibility(View.INVISIBLE);
        }

        // Find the ImageView for the Faction Image 3
        ImageView unitFaction3 = nameListView.findViewById(R.id.raceIcon3);
        // Check whether the array has an image
        if (currentName.faction3HasImage()){
            // If an image is available, display the provide image based on resource id
            unitFaction3.setImageResource(currentName.getFactionImage3());
            // Make the image visible
            unitFaction3.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the imageResource
            unitFaction3.setVisibility(View.INVISIBLE);
        }

        // Find the ImageView for the Faction Image 4
        ImageView unitFaction4 = nameListView.findViewById(R.id.raceIcon4);
        // Check whether the array has an image
        if (currentName.faction4HasImage()){
            // If an image is available, display the provide image based on resource id
            unitFaction4.setImageResource(currentName.getFactionImage4());
            // Make the image visible
            unitFaction4.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the imageResource
            unitFaction4.setVisibility(View.INVISIBLE);
        }


        // Find the TextView for the Name TextView
        TextView unitName = nameListView.findViewById(R.id.unitName);
        // Set the Unit Name to be in the Name TextView
        unitName.setText(currentName.getUnitName());

        // Returns the nameListView
        return nameListView;
    }
}
