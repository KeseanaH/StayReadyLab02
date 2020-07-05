package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class MemoryTest {
    @Test
    public void recallMemoryTest(){
        Memory memoryTest = new Memory();

        double actualValue = memoryTest.recallMemory();
        double expectedValue = 0.0; //expected 

        Assert.assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void addToMemoryTest(){
        Memory memoryTest = new Memory();

        memoryTest.addToMemory();
        double actualValue = memoryTest.recallMemory();
        double expectedValue = 0.0;

        Assert.assertEquals(expectedValue, actualValue, 0);
    }

    @Test
    public void resetMemory(){
        Memory memoryTest = new Memory();

        memoryTest.resetMemory();
        double actualValue = memoryTest.recallMemory();
        double expectedValue = 0.0;

        Assert.assertEquals(expectedValue, actualValue, 0);
    }
}