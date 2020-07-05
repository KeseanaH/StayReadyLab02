package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class TrigFunctionsTest {
    @Test
    public void sineTest(){

        TrigFunctions tfTest = new TrigFunctions();

        double actualValue = tfTest.sin();
        double expectedValue = 0.0;

        Assert.assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void cosineTest(){
        
        TrigFunctions tfTest = new TrigFunctions();

        double actualValue = tfTest.cos();
        double expectedValue = 1.0;

        Assert.assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void tangentTest(){

        TrigFunctions tfTest = new TrigFunctions();
        
        double actualValue = tfTest.tan();
        double expectedValue = 0.0;

        Assert.assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void inverseSineTest(){
        
        TrigFunctions tfTest = new TrigFunctions();

        double actualValue = tfTest.inverseSin();
        double expectedValue = 0.0;

        Assert.assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void invereCosineTest(){

        TrigFunctions tfTest = new TrigFunctions();

        double actualValue = tfTest.inverseCos();
        double expectedValue = 1.5707963267948966;

        Assert.assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void inverseTangentTest(){

        TrigFunctions tfTest = new TrigFunctions();

        double actualValue = tfTest.inverseTan();
        double expectedValue = 0.0;

        Assert.assertEquals(expectedValue, actualValue, 0);
    }
}