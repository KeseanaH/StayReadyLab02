package com.codedifferently;

public class Display {
    private double currentValue;
    private DisplayMode displayMode;
    private Memory memory;
    private CoreFeatures coreFeatures;
    private TrigFunctions trigFunctions;
    private TrigUnits trigUnits;

    public void setDisplayValue(double value){
        currentValue = value;
    }

    public double getDisplayValue(){
        return currentValue;
    }

    public double clearDisplayValue(){
        currentValue = 0.0;
        return currentValue;
    }

    public DisplayMode getDisplay(){
        return displayMode;
    }

    public Memory getMemory(){
        return memory;
    }

    public CoreFeatures getCoreFeatures(){
        return coreFeatures;
    }

    public TrigFunctions getTrigFunctions(){
        return trigFunctions; 
    }

    public TrigUnits getTrigUnits(){
        return trigUnits;
    }
}