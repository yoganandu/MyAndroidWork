package com.nandroid.taxcalculator.model;

/**
 * Created by yoganandu on 28/06/2014.
 */
public class PersonalDetails {
    private String mTitle;
    private String mFirstName;
    private String mLastName;
    private boolean mGenereIsFemale;
    private boolean mIsSeniorCitizen;
    private boolean mIsLivingInMetro;
    private boolean mIsMonthlyIncome;

    public String getTitle(){
        return mTitle;
    }
    void setTitle(String title){
        mTitle = title;
    }
    public String getFirstName(){
        return mFirstName;
    }
    public void setmFirstName(String firstName){
        mFirstName = firstName;
    }
    public String getLastName(){
        return mLastName;
    }
    public void setmLastName(String lastName){
        mLastName = lastName;
    }

    public boolean isFemale(){
        return mGenereIsFemale;
    }
    public void setFemaleGenereStatus(boolean isFemale){
        mGenereIsFemale = isFemale;
    }
    public boolean isSeniorCitizen(){
        return mIsSeniorCitizen;
    }
    public void setSeniorCitizenStatus(boolean isSeniorCitizen){
        mIsSeniorCitizen = isSeniorCitizen;
    }
    public boolean isLivingInMetro(){
        return mIsLivingInMetro;
    }
    public void setCityStatus(boolean isLivingInMetro){
        mIsLivingInMetro = isLivingInMetro;
    }
}
