package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import javax.net.ssl.HostnameVerifier;

public class TestStable {

    @Test
    public void testInstanceOfStorage() {
        // Given
        Stable<Horse>  stable = new Stable<>();
        // Then
        Assert.assertTrue(stable instanceof Storage);
    }

    @Test
    public void testAddHorse(){
        // Given
        Stable<Horse>  stable = new Stable<>();
        Horse horse = new Horse();
        // When
        stable.add(horse);
        // Then
        Assert.assertEquals(1, stable.size());
    }

    @Test
    public void testRemoveHorse(){
        // Given
        Stable<Horse>  stable = new Stable<>();
        Horse horse = new Horse();
        // When
        stable.add(horse);
        stable.remove(horse);
        // Then
        Assert.assertEquals(0, stable.size());
    }


}
