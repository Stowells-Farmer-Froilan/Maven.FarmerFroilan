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
    public void testThatOperateDoesNotHarvestUnfertilizedCornStalks(){

    }
    @Test
    public void testThatOperateDoesNotHarvestUnfertilizedTomatoPlants(){

    }
    @Test
    public void testThatOperateSetsCornHasBeenHarvestedToTrue() {

    }
    @Test
    public void testThatOperateSetsTomatoHasBeenHarvestedToTrue() {

    }
    @Test
    public void testThatOperateIncreasesTomatoStorage(){
        Tractor tractor = new Tractor();
        Farmer farmer = new Farm();
        farmer.ride(tractor);
        int expected = 0;
        int actual = tomatoStorage.size();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testThatOperateIncreasesCornStorage(){
        Tractor tractor = new Tractor();
        Farmer farmer = new Farm();
        farmer.ride(tractor);
        int expected = 0;
        int actual = cornStorage.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testThatOperateDecreasesCornStalk(){
        Tractor tractor = new Tractor();
        Farmer farmer = new Farm();
        farmer.ride(tractor);
        int expected = 0;
        int actual = cornStorage.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testThatOperateDecreasesTomatoPlant(){
        Tractor tractor = new Tractor();
        Farmer farmer = new Farm();
        farmer.ride(tractor);
        int expected = 0;
        int actual = tomatoStorage.size();
        Assert.assertEquals(expected, actual);
    }
}
