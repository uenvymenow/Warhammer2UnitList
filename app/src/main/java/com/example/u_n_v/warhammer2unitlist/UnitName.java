package com.example.u_n_v.warhammer2unitlist;

public class UnitName {

    // Set state of UnitNames class with default variables for each unit stat
    private String mUnitName;

    // Class constructor
    public UnitName(String unitName){
        mUnitName = unitName;
    }

    // Method to retrieve unit Name
    public String getUnitName(){
        return  mUnitName;
    }
}
