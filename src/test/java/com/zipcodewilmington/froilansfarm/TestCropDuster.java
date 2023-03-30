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
    public void testThatFertilizeIncreasesCornCrop() {
        Field field = new Field();
        CropDuster cropDuster = new CropDuster();
        CropRow<CornStalk> cornRow = new CropRow<>;
        field.add(cornRow);
        Pilot pilot = new Pilot();
        pilot.ride(cropDuster);
        int expected = 1;
        int actual = cornRow.size();
    }

    @Test
    public void testThatFertilizeIncreasesTomatoCrop() {
        Field field = new Field();
        CropDuster cropDuster = new CropDuster();
        CropRow<TomatoPlant> tomatoRow = new CropRow<>;
        field.add(tomatoRow);
        Pilot pilot = new Pilot();
        pilot.ride(cropDuster);
        int expected = 1;
        int actual = tomatoRow.size();
    }
    @Test
    public void testThatFertilizeIncreasesEdibleEggYield() {
        CropDuster cropDuster = new CropDuster();
        Chicken chicken = new Chicken();
        Pilot pilot = new Pilot();
        pilot.ride(cropDuster);

    }
    public void testThatFertilizeMakesUnFertilizedEggFalseInChicken() {
        Chicken chicken = new Chicken();
        CropDuster cropDuster = new CropDuster();
        Pilot pilot = new Pilot();
        pilot.ride(cropDuster);
        boolean expected = true;
        boolean actual = chicken.hasBeenFertilize();
        Assert.assertEquals(expected, actual);
    }

    public void testThatFertilizeDecreasesCropRows() {
        Field field = new Field();
        CropDuster cropDuster = new CropDuster();
        Pilot pilot = new Pilot();
        pilot.ride(cropDuster);
        int expected = 1;
        int actual = field.size();
        Assert.assertEquals(expected, actual);
    }

    public void testThatFertilizeDecreasesTomatoPlantRows() {
        Field field = new Field();
        CropDuster cropDuster = new CropDuster();
        Pilot pilot = new Pilot();
        pilot.ride(cropDuster);
        int expected = 1;
        int actual = field.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testThatFarmerCannotRideCropDuster() {
        Field field = new Field();
        CropDuster cropDuster = new CropDuster();
        Farmer farmer = new Farmer();
        farmer.ride(cropDuster);
        int expected = 0;
        int actual = field.size();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testThatBotanistCannotRideCropDuster() {
        Field field = new Field();
        CropDuster cropDuster = new CropDuster();
        Botanist botanist = new Botanist();
        botanist.ride(cropDuster);
        int expected = 0;
        int actual = field.size();
        Assert.assertEquals(expected, actual);
    }

}
