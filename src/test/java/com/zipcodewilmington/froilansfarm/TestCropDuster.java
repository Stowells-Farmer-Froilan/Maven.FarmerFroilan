package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import javax.accessibility.AccessibleTable;

public class TestCropDuster {
    @Test
    public void testThatCropDusterIsInstanceOfAircraft(){
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster instanceof Aircraft);
    }
    @Test
    public void testThatCropDusterIsInstanceOfFarmVehicle(){
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster instanceof FarmVehicle);
    }
    @Test
    public void testThatCropDusterIsInstanceOfVehicle(){
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster instanceof Vehicle);
    }
    @Test
    public void testThatCropDusterIsInstanceOfRideable(){
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster instanceof Rideable);
    }
    @Test
    public void testThatOperateSetsCornHasBeenFertilizedToTrue() {
        CropDuster cropDuster = new CropDuster();
        Botanist botanist = new Botanist(null);
        Pilot pilot = new Pilot(null);
        botanist.plant(corn);
        pilot.ride(cropDuster);
        boolean expected = true;
        boolean actual = Corn.hasBeenFertilized();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testThatOperateSetsTomatoHasBeenFertilizedToTrue() {
        CropDuster cropDuster = new CropDuster();
        Botanist botanist = new Botanist(null);
        Pilot pilot = new Pilot(null);
        botanist.plant(tomato);
        pilot.ride(cropDuster);
        boolean expected = true;
        boolean actual = Tomato.hasBeenFertilized();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testThatOperateMakesHasBeenFertilizedToTrueInChicken() {
        Chicken chicken = new Chicken();
        CropDuster cropDuster = new CropDuster();
        Pilot pilot = new Pilot(null);
        pilot.ride(cropDuster);
        boolean expected = true;
        boolean actual = chicken.hasBeenFertilized();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testThatFlyReturnsMessage(){
        CropDuster cropDuster = new CropDuster();
        String expected = "You soar high in the sky!";
        String actual = cropDuster.fly();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testCropDusterMakeNoise(){
        CropDuster cropDuster = new CropDuster();
        String expected = "I'm a crop duster yo";
        String actual = cropDuster.makeNoise();
        Assert.assertEquals(expected, actual);
    }
}
