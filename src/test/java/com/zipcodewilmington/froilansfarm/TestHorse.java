package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class TestHorse {
    @Test
    public void testEatCorn(){
        Horse horse = new Horse();
        int expected = 3;
        horse.eatCorn();
        Assert.assertEquals(expected, horse.eatCorn());
    }

    @Test
    public void testEatTomato(){
        Horse horse = new Horse();
        int expected = 1;
        horse.eatTomato();
        Assert.assertEquals(expected, horse.eatTomato());
    }


}
