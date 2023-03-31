package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomatoStorageTest {
    @Test
    public void testGetTomatoStorage() {
        TomatoPlant plant = new TomatoPlant();
        Assert.assertEquals(0, plant.getTomato());
        Assert.assertEquals(1, plant.getTomato());
        Assert.assertEquals(2, plant.getTomato());
        Assert.assertEquals(3, plant.getTomato());
    }
}