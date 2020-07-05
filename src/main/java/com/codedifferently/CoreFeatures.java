package com.codedifferently;

public class CoreFeatures extends Display{
    private double memory;

    public CoreFeatures(){
        memory = 0;
    }

    public CoreFeatures(double value){
        memory = value;
        setDisplayValue(memory);
    }

    public double add(double number){
        memory = number + getDisplayValue();
        setDisplayValue(memory);
        return memory;
    }

    public double subtract(double number){
        memory = getDisplayValue() - number;
        setDisplayValue(memory);
        return memory;
    }

    public double divide(double number){ 
        if(number != 0){
            memory = getDisplayValue() / number;
            setDisplayValue(memory);
            return memory;
        } else{
            System.out.println("ERROR: Cannot divide by zero");
            return memory;
        }
    }

    public double multiply(double number){
        memory = getDisplayValue() * number;
        setDisplayValue(memory);
        return memory;
    }

    public double square(){
        memory = getDisplayValue() * getDisplayValue();
        setDisplayValue(memory);
        return memory;
    }

    public double squareRoot(){ 
        if(getDisplayValue() > 0){
            memory = Math.sqrt(getDisplayValue());
            setDisplayValue(memory);
            return memory;
        } else{
            System.out.println("ERROR: Cannot use a negative number");
            return memory;
        }
    }

    public double exp(double exponent){
        memory = Math.pow(getDisplayValue(), exponent);
        setDisplayValue(memory);
        return memory;
    }

    public double inverse(){
        if(getDisplayValue() != 0){
            memory = 1/getDisplayValue();
            setDisplayValue(memory);
            return memory;
        } else{
            System.out.println("ERROR: Cannot divide by zero");
            return memory;
        }
    }

    public double invertSign(){
        memory = -(getDisplayValue());
        setDisplayValue(memory);
        return memory;
    }

    public double log(){
        if(getDisplayValue() > 0){
            memory = Math.log(getDisplayValue());
            setDisplayValue(memory);
            return memory;
        } else{
            System.out.println("ERROR: Invalid input");
            return memory;
        }
    }

    public double absoluteValue(){
        memory = Math.abs(getDisplayValue());
        setDisplayValue(memory);
        return memory;
    }
}