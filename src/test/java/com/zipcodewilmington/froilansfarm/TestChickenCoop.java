package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class TestChickenCoop {
    @Test
    public void testInstanceOfStorage() {
        // Given
        FarmHouse<Chicken> farmHouse = new FarmHouse<>();
        // Then
        Assert.assertTrue(farmHouse instanceof Storage);
    }

    @Test
    public void testAddChicken(){
        // Given
        FarmHouse<Chicken> farmHouse = new FarmHouse<>();
        Chicken chickie = new Chicken();
        // When
        farmHouse.add(chickie);
        // Then
        Assert.assertEquals(1, farmHouse.size());
    }
    @Test
    public void testRemoveChicken(){
        // Given
        FarmHouse<Chicken> farmHouse = new FarmHouse<>();
        Chicken chickie = new Chicken();
        // When
        farmHouse.add(chickie);
        farmHouse.remove(chickie);
        // Then
        Assert.assertEquals(0, farmHouse.size());
    }




}


