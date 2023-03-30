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
    }
    @Test
    public void testThatHarvestIncreasesCornYield(){
    }
    @Test
    public void testThatHarvestDecreasesCornStalk(){
    }

    @Test
    public void testThatHarvestDecreasesTomatoPlant(){
    }
}
