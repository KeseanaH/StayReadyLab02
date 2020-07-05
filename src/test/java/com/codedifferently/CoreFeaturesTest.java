package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class CoreFeaturesTest {
    @Test
    public void addTest(){
        CoreFeatures corefeatures = new CoreFeatures(10);

        double actualValue = corefeatures.add(5);
        double expectedValue = 15;

        Assert.assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void subtractTest(){
        CoreFeatures corefeatures = new CoreFeatures(8);

        double actualValue = corefeatures.subtract(2);
        double expectedValue = 6;

        Assert.assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void divideTest(){
        CoreFeatures corefeatures = new CoreFeatures(20);

        double actualValue = corefeatures.divide(10);
        double expectedValue = 2;

        Assert.assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void multiplyTest(){
        CoreFeatures corefeatures = new CoreFeatures(7);

        double actualValue = corefeatures.multiply(9);
        double expectedValue = 63;

        Assert.assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void squareTest(){
        CoreFeatures corefeatures = new CoreFeatures(5);

        double actualValue = corefeatures.square();
        double expectedValue = 25;

        Assert.assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void squareRootTest(){
        CoreFeatures corefeatures = new CoreFeatures(49);

        double actualValue = corefeatures.squareRoot();
        double expectedValue = 7;

        Assert.assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void expTest(){
        CoreFeatures corefeatures = new CoreFeatures(-9);

        double actualexpValue = corefeatures.exp(3);
        double expectedValue = -729;

        Assert.assertEquals(expectedValue, actualexpValue, 0);
    }

    @Test
    public void inverseTest(){ // check
        CoreFeatures corefeatures = new CoreFeatures(0.5);

        double actualInverse = corefeatures.inverse();
        double expectedInverse = 2;

        Assert.assertEquals(expectedInverse, actualInverse, 0);
    }

    @Test
    public void invertSignTest(){
        CoreFeatures corefeatures = new CoreFeatures();
        
        double actualValue = corefeatures.invertSign();
        double expectedValue = -0.0;

        Assert.assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void logTest(){
        CoreFeatures corefeatures = new CoreFeatures(1);

        double actualValue = corefeatures.log();
        double expectedValue = 0;

        Assert.assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void absoluteValueTest(){
        CoreFeatures corefeatures = new CoreFeatures(-4);

        double actualValue = corefeatures.absoluteValue();
        double expectedValue = 4;

        Assert.assertEquals(expectedValue, actualValue, 0);
    }
}