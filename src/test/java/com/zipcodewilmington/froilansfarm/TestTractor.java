package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class TestTractor {

    @Test
    public void testThatTractorIsInstanceOfFarmVehicle() {
        Tractor tractor = new Tractor();
        Assert.assertTrue(tractor instanceof FarmVehicle);
    }
    @Test
    public void testThatTractorIsInstanceOfVehicle() {
        Tractor tractor = new Tractor();
        Assert.assertTrue(tractor instanceof Vehicle);
    }
    @Test
    public void testThatTractorIsInstanceOfRideable() {
        Tractor tractor = new Tractor();
        Assert.assertTrue(tractor instanceof Rideable);
    }
    @Test
    public void testThatHarvestIncreasesTomatoYield(){
        Tractor tractor = new Tractor();
        tractor.fertilize();
        int expected = 0;
        int actual = tomatoStorage.size();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testThatHarvestIncreasesCornYield(){
        Tractor tractor = new Tractor();
        tractor.fertilize();
        int expected = 0;
        int actual = cornStorage.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testThatHarvestDecreasesCornStalk(){
        Tractor tractor = new Tractor();
        tractor.fertilize();
        int expected = 0;
        int actual = cornStorage.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testThatHarvestDecreasesTomatoPlant(){
        Tractor tractor = new Tractor();
        tractor.fertilize();
        int expected = 0;
        int actual = tomatoStorage.size();
        Assert.assertEquals(expected, actual);
    }
}
