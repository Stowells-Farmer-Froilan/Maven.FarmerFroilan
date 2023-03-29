package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProduceTest {

    @Before
    public void beforeClass(){

    }
    @Test
    public void testYield(){
        Produce expected =

        Produce actual = produce.yield();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testHasBeenEaten(){
        produce.hasBeenEaten(true);
        Assert.assertTrue(produce.hasBeenEaten());
    }

}
