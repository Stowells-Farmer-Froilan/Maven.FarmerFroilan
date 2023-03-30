package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomatoPlantTest {
    @Test
    public void testHarvestTomato(){
        TomatoPlant plant = new TomatoPlant();
        int expected = 10;
        int actual = plant.getTomato();
        Assert.assertEquals(expected, actual);
    }

}