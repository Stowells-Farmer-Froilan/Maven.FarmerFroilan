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
        Tractor tractor = new Tractor();
        Botanist botanist = new Botanist(null);
        Farmer farmer = new Farmer(null);
        botanist.plant(corn);
        farmer.ride(tractor);
        boolean expected = false;
        boolean actual = Corn.hasBeenHarvested();
        Assert.assertEquals(expected, actual);


    }
    @Test
    public void testThatOperateDoesNotHarvestUnfertilizedTomatoPlants(){
        Tractor tractor = new Tractor();
        Botanist botanist = new Botanist(null);
        Farmer farmer = new Farmer(null);
        botanist.plant(tomato);
        farmer.ride(tractor);
        boolean expected = false;
        boolean actual = Tomato.hasBeenHarvested();
        Assert.assertEquals(expected, actual);
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
        Farmer farmer = new Farmer(null);
        farmer.ride(tractor);
        int expected = 0;
        int actual = tomatoStorage.size();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testThatOperateIncreasesCornStorage(){
        Tractor tractor = new Tractor();
        Farmer farmer = new Farmer(null);
        farmer.ride(tractor);
        int expected = 0;
        int actual = cornStorage.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testThatOperateDecreasesCornStalk(){
        Tractor tractor = new Tractor();
        Farmer farmer = new Farmer(null);
        farmer.ride(tractor);
        int expected = 0;
        int actual = cornStorage.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testThatOperateDecreasesTomatoPlant(){
        Tractor tractor = new Tractor();
        Farmer farmer = new Farmer(null);
        farmer.ride(tractor);
        int expected = 0;
        int actual = tomatoStorage.size();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testTractorMakeNoise(){
        Tractor tractor = new Tractor();
        String expected = "I'm a tractor yo";
        String actual = tractor.makeNoise();
        Assert.assertEquals(expected, actual);
    }
}
