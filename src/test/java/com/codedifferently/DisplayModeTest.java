package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class DisplayModeTest {
    @Test 
    public void getModeTest(){
        DisplayMode displayMode = new DisplayMode();

        String actualValue = displayMode.getMode();
        String expectedValue = "Decimal";

        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void switchDisplayModeTest1(){
        DisplayMode displayMode = new DisplayMode();

        String actualValue = displayMode.switchDisplayMode();
        String expectedValue = "Octal";

        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void switchDisplayModeTest2(){
        DisplayMode displayMode = new DisplayMode();

        displayMode.switchDisplayMode("Hexadecimal");
        String actualValue = displayMode.getMode();
        String expectedValue = "Hexadecimal";

        Assert.assertEquals(expectedValue, actualValue);
    }
}