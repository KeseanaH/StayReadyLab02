package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class TrigUnitsTest {
    @Test
    public void getModeTest(){
        TrigUnits trigUnits = new TrigUnits();

        String actualValue = trigUnits.getMode();
        String expectedValue = "Radians";

        Assert.assertEquals(expectedValue, actualValue);
    }
    
    @Test
    public void switchUnitsModeTest1(){

        TrigUnits trigUnits = new TrigUnits();

        trigUnits.switchUnitsMode();
        String actualValue = trigUnits.getMode();
        String expectedValue = "Degree";

        Assert.assertEquals(expectedValue, actualValue);
    }    

    @Test
    public void switchUnitsModeTest2(){
        TrigUnits trigUnits = new TrigUnits();

        trigUnits.switchUnitsMode("Degree");
        String actualValue = trigUnits.getMode();
        String expectedValue = "Degree";

        Assert.assertEquals(expectedValue, actualValue);
    }
}