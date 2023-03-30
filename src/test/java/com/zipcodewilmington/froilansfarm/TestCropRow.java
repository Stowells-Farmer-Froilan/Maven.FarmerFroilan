package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class TestCropRow {
    @Test
    public void testAddCrop(){
        // Given
        CropRow<Crop> cornRow = new CropRow();
        CropRow<Crop> tomatoRow = new CropRow();
        CropRow<Crop> mangoRow = new CropRow();
        Crop corny = new Crop();
        Crop tomatoy = new Crop();
        Crop mangoy = new Crop();
        // When
        cornRow.add(corny);
        tomatoRow.add(tomatoy);
        mangoRow.add(mangoy);
        // Then
        Assert.assertEquals(1, cornRow.size());
        Assert.assertEquals(1, tomatoRow.size());
        Assert.assertEquals(1, mangoRow.size());
    }

    @Test
    public void testRemoveCrop(){
        // Given
        CropRow<Crop> cornRow = new CropRow();
        CropRow<Crop> tomatoRow = new CropRow();
        CropRow<Crop> mangoRow = new CropRow();
        Crop corny = new Crop();
        Crop tomatoy = new Crop();
        Crop mangoy = new Crop();
        // When
        cornRow.add(corny);
        tomatoRow.add(tomatoy);
        mangoRow.add(mangoy);
        tomatoRow.remove(tomatoy);
        // Then
        Assert.assertEquals(1, cornRow.size());
        Assert.assertEquals(0, tomatoRow.size());
        Assert.assertEquals(1, mangoRow.size());
    }
    @Test
    public void testInstanceOfStorage(){
        // Given
        CropRow<Crop> cornRow = new CropRow<>();
        Assert.assertTrue(cornRow instanceof Storage);
        // Then
    }

}
