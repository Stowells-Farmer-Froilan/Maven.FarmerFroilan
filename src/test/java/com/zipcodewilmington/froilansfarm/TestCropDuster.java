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
    public void testThatCropDusterIsInstanceOfAircraft(){
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster instanceof Vehicle);
    }
    @Test
    public void testThatCropDusterIsInstanceOfAircraft(){
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster instanceof Rideable);
    }
    @Test
    public void testFertilize() {
        Field field = new Field();
        Pilot pilot = new Pilot();
        pilot.rideCropDuster();
        int expected = 1;
        int actual = field.size();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testThatFarmerCannotRideCropDuster() {
        Field field = new Field();
        Farmer farmer = new Farmer();
        farmer.rideCropDuster();
        int expected = 0;
        int actual = field.size();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testThatBotanistCannotRideCropDuster() {
        Field field = new Field();
        Botanist botanist = new Botanist();
        botanist.rideCropDuster();
        int expected = 0;
        int actual = field.size();
        Assert.assertEquals(expected, actual);
    }

}
