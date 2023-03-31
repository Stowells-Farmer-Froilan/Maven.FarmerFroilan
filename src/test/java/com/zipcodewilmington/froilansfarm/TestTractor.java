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

//    @Test
//    public void testThatOperateDoesNotHarvestUnfertilizedCornStalks(){
//        Crop corn = new Crop();
//        Tractor tractor = new Tractor();
//        Farmer farmer = new Farmer(null);
//        farmer.plant(corn);
//        farmer.mount(); // tractor
//        boolean expected = false;
//        boolean actual = corn.hasBeenHarvested();
//        Assert.assertEquals(expected, actual);
//    }
//    @Test
//    public void testThatOperateDoesNotHarvestUnfertilizedTomatoPlants(){
//        Crop tomato = new Crop();
//        Tractor tractor = new Tractor();
//        Farmer farmer = new Farmer(null);
//        farmer.plant(tomato);
//        farmer.mount();//tractor
//        boolean expected = false;
//        boolean actual = tomato.hasBeenHarvested();
//        Assert.assertEquals(expected, actual);
//    }

//    @Test
//    public void testThatOperateSetsCornHasBeenHarvestedToTrue() {
//        Crop tomato = new Crop();
//        Tractor tractor = new Tractor();
//        CropDuster cropDuster = new CropDuster();
//        Pilot pilot = new Pilot(null);
//        Farmer farmer = new Farmer(null);
//        farmer.plant(tomato);
//        pilot.mount();//cropduster
//        farmer.mount();//tractor
//        boolean expected = true;
//        boolean actual = Corn.hasBeenHarvested();
//        Assert.assertEquals(expected, actual);
//    }
//    @Test
//    public void testThatOperateSetsTomatoHasBeenHarvestedToTrue() {
//        Crop tomato = new Crop();
//        Tractor tractor = new Tractor();
//        CropDuster cropDuster = new CropDuster();
//        Pilot pilot = new Pilot(null);
//        Farmer farmer = new Farmer(null);
//        farmer.plant(tomato);
//        pilot.mount();//cropDuster
//        farmer.mount();//tractor
//        boolean expected = true;
//        boolean actual = tomato.hasBeenHarvested();
//        Assert.assertEquals(expected, actual);
//    }
    @Test
    public void testThatOperateIncreasesTomatoStorage(){
        TomatoStorage tomatoStorage = new TomatoStorage();
        Tractor tractor = new Tractor();
        Farmer farmer = new Farmer(null);
        farmer.mount();//tractor
        int expected = 0;
        int actual = tomatoStorage.getTomatoStorage();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testThatOperateIncreasesCornStorage(){
        CornStorage cornStorage = new CornStorage();
        Tractor tractor = new Tractor();
        Farmer farmer = new Farmer(null);
        farmer.ride(tractor);
        int expected = 0;
        int actual = cornStorage.getCornStorage();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testThatOperateDecreasesCornStalk(){
        CornStorage cornStorage = new CornStorage();
        Tractor tractor = new Tractor();
        Farmer farmer = new Farmer(null);
        farmer.ride(tractor);
        int expected = 0;
        int actual = cornStorage.getCornStorage();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testThatOperateDecreasesTomatoPlant(){
        TomatoStorage tomatoStorage = new TomatoStorage();
        Tractor tractor = new Tractor();
        Farmer farmer = new Farmer(null);
        farmer.ride(tractor);
        int expected = 0;
        int actual = tomatoStorage.getTomatoStorage();
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
