package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class TestChickenCoop {
    @Test
    public void testInstanceOfStorage() {
        // Given
        ChickenCoop<Chickens> chickenCoop = new ChickenCoop<>();
        // Then
        Assert.assertTrue(chickenCoop instanceof Storage);
    }

    @Test
    public void testAddChicken(){
        // Given
        ChickenCoop<Chickens>  chickenCoop = new ChickenCoop<>();
        CropRow cornRow = new CropRow();
        // When
        field.add(cornRow);
        field.add(tomatoRow);
        field.add(mangoRow);
        // Then
        Assert.assertEquals(3, field.size());
    }
    @Test
    public void testRemoveChicken(){
        // Given
        Field<CropRow> field = new Field<>();
        CropRow cornRow = new CropRow();
        CropRow tomatoRow = new CropRow();
        CropRow mangoRow = new CropRow();
        // When
        field.add(cornRow);
        field.add(tomatoRow);
        field.add(mangoRow);
        // Then
        Assert.assertEquals(3, field.size());
    }


}


