package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class TestChickenCoop {
    @Test
    public void testInstanceOfStorage() {
        // Given
        ChickenCoop<Chicken> chickenCoop = new ChickenCoop<>();
        // Then
        Assert.assertTrue(chickenCoop instanceof Storage);
    }

    @Test
    public void testAddChicken(){
        // Given
        ChickenCoop<Chicken>  chickenCoop = new ChickenCoop<>();
        Chicken chickie = new Chicken();
        // When
        chickenCoop.add(chickie);
        // Then
        Assert.assertEquals(1, chickenCoop.size());
    }
    @Test
    public void testRemoveChicken(){
        // Given
        ChickenCoop<Chicken>  chickenCoop = new ChickenCoop<>();
        Chicken chickie = new Chicken();
        // When
        chickenCoop.add(chickie);
        chickenCoop.remove(chickie);
        // Then
        Assert.assertEquals(0, chickenCoop.size());
    }


}


