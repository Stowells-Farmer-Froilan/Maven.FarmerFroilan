package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestFarm {
    @Test
    public void testAddChickenCoop(){
        // Given
        Farm farm = new Farm();
        ChickenCoop<Chicken> coop = new ChickenCoop<>();
        // When
        farm.addChickenCoop(coop);
        int actual = farm.getChickenCoop().size();
        // Then
        Assert.assertEquals(3, actual);
    }

}
