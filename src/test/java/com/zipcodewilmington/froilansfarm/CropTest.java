package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class CropTest {

    @Test
    public void testHarvestCrop(){
        Crop crop = new Crop();
        int expected = 10;
        int actual = crop.getCrop();
        Assert.assertEquals(expected, actual);
    }

//    @Test
//    public void testHasBeenHarvested(){
//        crop.hasBeenHarvested(true);
//        Assert.assertTrue(crop.hasBeenHarvested());
//    }
//
//    @Test
//    public void testHasBeenFertilized(){
//        crop.hasBeenFertilized(true);
//        Assert.assertTrue(crop.hasBeenFertilized());
//    }

}
