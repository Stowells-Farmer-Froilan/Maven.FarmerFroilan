package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import javax.net.ssl.HostnameVerifier;

public class TestStable {

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
        Stable<Horse>  stable = new Stable<>();
        Horse horse = new Horse();
        // When
        stable.add(horse);
        // Then
        Assert.assertEquals(1, stable.size());
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
