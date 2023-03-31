package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class TestFarm {

    @Test
    public void testInstanceOfStorage(){
        // Given
        Farm farm = new Farm();
        // Then
        Assert.assertTrue(farm instanceof Storage);
    }
    @Test
    public void testAddChickenCoop(){
        // Given
        Farm farm = new Farm();
        FarmHouse<Chicken> coop = new FarmHouse<>();
        // When
        farm.addChickenCoop(coop);
        int actual = farm.getChickenCoop().size();
        // Then
        Assert.assertEquals(3, actual);
    }
    @Test
    public void testRemoveChickenCoop(){
        // Given
        Farm farm = new Farm();
        FarmHouse<Chicken> coop = new FarmHouse<>();
        // When
        farm.addChickenCoop(coop);
        farm.removeChickenCoop(coop);
        int actual = farm.getChickenCoop().size();
        // Then
        Assert.assertEquals(3, actual);
    }

}
