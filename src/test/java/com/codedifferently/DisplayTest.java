package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class DisplayTest {
    @Test
    public void getDisplayValue(){

        Display display = new Display();

        double actualValue = display.getDisplayValue();
        double expectedValue = 0.0;

        Assert.assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void setDisplayValueTest(){

        Display display = new Display();

        display.setDisplayValue(25);
        double actualValue = display.getDisplayValue();
        double expectedValue = 25;

        Assert.assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void clearDisplayTest(){

        Display display = new Display();

        display.clearDisplayValue();
        double actualValue = display.getDisplayValue();
        double expectedValue = 0.0;

        Assert.assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void getDisplayTest(){
        Display display = new Display();

        DisplayMode actual = display.getDisplay();
        DisplayMode expected = null;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMemoryTest(){
        Display display = new Display();

        Memory actual = display.getMemory();
        Memory expected = null;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCoreFeaturesTest(){
        Display display = new Display();

        CoreFeatures actual = display.getCoreFeatures();
        CoreFeatures expected = null;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTrigFunctionsTest(){
        Display display = new Display();

        TrigFunctions actual = display.getTrigFunctions();
        TrigFunctions expected = null;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTrigUnits(){
        Display display = new Display();

        TrigUnits actual = display.getTrigUnits();
        TrigUnits expected = null;

        Assert.assertEquals(expected, actual);
    }
}