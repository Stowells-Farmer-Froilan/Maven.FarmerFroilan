package com.zipcodewilmington.froilansfarm;

import org.junit.Test;

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
}
