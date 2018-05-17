package com.example.u_n_v.warhammer2unitlist.Stats;

public class UnitStats {
    // Set state of UnitStats class with default variables for each unit stat
    private String mUnitName;
    private String mUnitType;
    private String mUnitCount;
    private String mUnitCost;
    private String mUnitHealth;
    private String mUnitArmour;
    private String mUnitLeadership;
    private String mUnitSpeed;
    private String mUnitMeleeAtk;
    private String mUnityMeleeDef;
    private String mUnitWeaponStr;
    private String mUnitChargeBonus;
    private String mUnitAmmunition;
    private String mUnitRange;
    private String mUnitMissileDmg;

    // Class constructor
    public UnitStats(String unitName, String unitType, String unitCount, String unitCost, String unitHealth, String unitArmour,
                     String unitLeadership, String unitSpeed, String unitMeleeAtk, String unitMeleeDef,
                     String unitWeaponStr, String unitChargeBonus, String unitAmmunition,
                     String unitRange, String unitMissileDmg){
        mUnitName = unitName;
        mUnitType = unitType;
        mUnitCount = unitCount;
        mUnitCost = unitCost;
        mUnitHealth = unitHealth;
        mUnitArmour = unitArmour;
        mUnitLeadership = unitLeadership;
        mUnitSpeed = unitSpeed;
        mUnitMeleeAtk = unitMeleeAtk;
        mUnityMeleeDef = unitMeleeDef;
        mUnitWeaponStr = unitWeaponStr;
        mUnitChargeBonus = unitChargeBonus;
        mUnitAmmunition = unitAmmunition;
        mUnitRange = unitRange;
        mUnitMissileDmg = unitMissileDmg;
    }

    // Method to retrieve unit Name
    public String getUnitName(){ return  mUnitName; }

    public String getUnitType() { return mUnitType; }

    // Method to retrieve unit Count
    public String getUnitCount(){
        return mUnitCount;
    }

    // Method to retrieve unit cost
    public String getUnitCost(){
        return mUnitCost;
    }

    // Method to retrieve unit Health
    public String getUnitHealth(){
        return mUnitHealth;
    }

    // Method to retrieve unit Armour
    public String getUnitArmour(){
        return mUnitArmour;
    }

    // Method to retrieve unit Leadership
    public String getUnitLeadership(){
        return mUnitLeadership;
    }

    // Method to retrieve unit Speed
    public String getUnitSpeed(){
        return mUnitSpeed;
    }

    // Method to retrieve unit Melee Attack
    public String getUnitMeleeAtk(){
        return mUnitMeleeAtk;
    }

    // Method to retrieve unit Melee Defense
    public String getUnitMeleeDef(){
        return mUnityMeleeDef;
    }

    // Method to retrieve unit Weapon Strength
    public String getUnitWeaponStr(){
        return mUnitWeaponStr;
    }

    // Method to retrieve unit Charge Bonus
    public String getUnitChargeBonus(){
        return mUnitChargeBonus;
    }

    // Method to retrieve unit Ammunition
    public String getUnitAmmunition(){
        return mUnitAmmunition;
    }

    // Method to retrieve unit Range
    public String getUnitRange(){
        return mUnitRange;
    }

    // Method to retrieve unit Missile Damage
    public String getUnitMissileDmg() {
        return mUnitMissileDmg;
    }
}
