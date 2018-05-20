package com.example.u_n_v.warhammer2unitlist.NameList;


public class UnitName {

    // Set state of UnitNames class with default variables for each unit stat
    private int mUnitIcon;
    private int mFactionImage1;
    private int mFactionImage2;
    private int mFactionImage3;
    private int mFactionImage4;
    private String mUnitName;
    private static final int NO_IMAGE_PROVIDED = -1;

    public UnitName(String unitName){
        mUnitName = unitName;
    }

    // Class constructor
    public UnitName(int unitIcon, String unitName){
        mUnitIcon = unitIcon;
        mUnitName = unitName;
    }

    // Class constructor
    public UnitName(int unitIcon, int factionImage1, String unitName){
        mUnitIcon = unitIcon;
        mFactionImage1 = factionImage1;
        mUnitName = unitName;
    }

    // Class constructor
    public UnitName(int unitIcon, int factionImage1, int factionImage2, String unitName){
        mFactionImage1 = factionImage1;
        mFactionImage2 = factionImage2;
        mUnitName = unitName;
    }

    // Class constructor
    public UnitName(int unitIcon, int factionImage1, int factionImage2, int factionImage3, String unitName){
        mFactionImage1 = factionImage1;
        mFactionImage2 = factionImage2;
        mFactionImage3 = factionImage3;
        mUnitName = unitName;
    }

    // Class constructor
    public UnitName(int unitIcon, int factionImage1, int factionImage2, int factionImage3, int factionImage4, String unitName){
        mFactionImage1 = factionImage1;
        mFactionImage2 = factionImage2;
        mFactionImage3 = factionImage3;
        mFactionImage4 = factionImage4;
        mUnitName = unitName;
    }

    // Method to retrieve Unit Icon
    public int getUnitIcon(){
        return  mUnitIcon;
    }
    // Method to retrieve the Faction 1 Image and verify if image is available
    public boolean unitIconHasImage(){ return mFactionImage1 != NO_IMAGE_PROVIDED; }

    // Method to retrieve Optional Image 1
    public int getFactionImage1(){
        return  mFactionImage1;
    }
    // Method to retrieve the Faction 1 Image and verify if image is available
    public boolean faction1HasImage(){ return mFactionImage1 != NO_IMAGE_PROVIDED; }

    // Method to retrieve Optional Image 2
    public int getFactionImage2(){
        return  mFactionImage2;
    }
    // Method to retrieve the Faction 2 Image and verify if image is available
    public boolean faction2HasImage(){ return mFactionImage2 != NO_IMAGE_PROVIDED; }

    // Method to retrieve Optional Image 3
    public int getFactionImage3(){
        return  mFactionImage3;
    }
    // Method to retrieve the Faction 3 Image and verify if image is available
    public boolean faction3HasImage(){ return mFactionImage3 != NO_IMAGE_PROVIDED; }


    // Method to retrieve Optional Image 4
    public int getFactionImage4(){
        return  mFactionImage4;
    }
    // Method to retrieve the Faction 4 Image and verify if image is available
    public boolean faction4HasImage(){ return mFactionImage4 != NO_IMAGE_PROVIDED; }

    // Method to retrieve unit Name
    public String getUnitName(){
        return  mUnitName;
    }



}
