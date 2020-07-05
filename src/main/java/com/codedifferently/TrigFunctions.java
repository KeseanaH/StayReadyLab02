package com.codedifferently;

public class TrigFunctions extends Display{
    private double value;

    public double sin(){
        value = Math.sin(getDisplayValue());
        setDisplayValue(value);
        return value;
    }

    public double cos(){
        value = Math.cos(getDisplayValue());
        setDisplayValue(value);
        return value;
    }

    public double tan(){
        value = Math.tan(getDisplayValue());
        setDisplayValue(value);
        return value;
    }

    public double inverseSin(){
        value = Math.asin(getDisplayValue());
        setDisplayValue(value);
        return value;
    }

    public double inverseCos(){
        value = Math.acos(getDisplayValue());
        setDisplayValue(value);
        return value;
    }

    public double inverseTan(){
        value = Math.atan(getDisplayValue());
        setDisplayValue(value);
        return value;
    }
}