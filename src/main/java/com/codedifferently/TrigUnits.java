package com.codedifferently;

public class TrigUnits {
    private String setMode;

    public TrigUnits(){
        setMode = "Radians"; //default units are radians
    }

    public void switchUnitsMode(){
        if(setMode.equals("Radians"))
            setMode = "Degree";
        else   
            setMode = "Radians";
    }

    public void switchUnitsMode(String sMode){
        setMode = sMode;
    }

    public String getMode(){
        return setMode;
    }
}