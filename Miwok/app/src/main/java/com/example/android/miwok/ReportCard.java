package com.example.android.miwok;

/**
 * Created by carlos abreu on 7/19/17.
 */

public class ReportCard {

    private String MathGrade;
    private String ScienceGrade;
    private String HistoryGrade;
    private String LiteratureGrade;
    private String PhysicsEducationGrade;
    private String SpanishGrade;
    private String ArtsGrade;
    private String BiologyGrade;


    public String getMathGrade() {
        return MathGrade;
    }

    public void setMathGrade(String mathGrade) {
        MathGrade = mathGrade;
    }

    public String getScienceGrade() {
        return ScienceGrade;
    }

    public void setScienceGrade(String scienceGrade) {
        ScienceGrade = scienceGrade;
    }

    public String getHistoryGrade() {
        return HistoryGrade;
    }

    public void setHistoryGrade(String historyGrade) {
        HistoryGrade = historyGrade;
    }

    public String getLiteratureGrade() {
        return LiteratureGrade;
    }

    public void setLiteratureGrade(String literatureGrade) {
        LiteratureGrade = literatureGrade;
    }

    public String getPhysicsEducationGrade() {
        return PhysicsEducationGrade;
    }

    public void setPhysicsEducationGrade(String physicsEducationGrade) {
        PhysicsEducationGrade = physicsEducationGrade;
    }

    public String getSpanishGrade() {
        return SpanishGrade;
    }

    public void setSpanishGrade(String spanishGrade) {
        SpanishGrade = spanishGrade;
    }

    public String getArtsGrade() {
        return ArtsGrade;
    }

    public void setArtsGrade(String artsGrade) {
        ArtsGrade = artsGrade;
    }

    public String getBiologyGrade() {
        return BiologyGrade;
    }

    public void setBiologyGrade(String biologyGrade) {
        BiologyGrade = biologyGrade;
    }


    @Override
    public String toString() {
        //Your code here!  Return a representation of
        String finalNote = "here is the final report for Carlos Abreu, Biology: " + getBiologyGrade() + ",Science: " + getScienceGrade() + ",Literature: " + getLiteratureGrade();
        //the report card rather than the empty string
        return finalNote;
    }



}
