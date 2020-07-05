package com.codedifferently;

public class Memory extends Display{
    private double memoryValue;

    public Memory(){
        memoryValue = 0.0; //default value is 0
    }

    public Memory(double number){
        memoryValue = number;
    }

    public double recallMemory(){
        return memoryValue;
    }

    public void addToMemory(){
        memoryValue = getDisplayValue();
    }

    public void resetMemory(){
        memoryValue = 0.0;
    }
}