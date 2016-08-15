package com.example.android.reportcard;

import javax.security.auth.Subject;

/**
 * Created by uzuri17 on 8/14/2016.
 */
public class ReportCard {

    //Get Subject
    private String mSubject;
    //Get Letter Grade
    private Character mCharacter;
    //Get Numerical Grade
    private int mGrade;
    //new report card object
    public ReportCard(String Subject, Character Character, int Grade) {

        mSubject = Subject;
        mCharacter = Character;
        mGrade = Grade;
    }
    //Find class subject
    public String getSubject() {
        return mSubject;
    }
    //Find letter grade
    public Character getCharacter() {
        return mCharacter;
    }
    //Get numerical grade
    public int getGrade() {
        return mGrade;
    }
    public void setGrade(int newGrade){
        newGrade = mGrade;
    }
    public String toString() {
        return "Class: " + mSubject + " Grade: " + mCharacter + " / " + mGrade ;
    }


}
