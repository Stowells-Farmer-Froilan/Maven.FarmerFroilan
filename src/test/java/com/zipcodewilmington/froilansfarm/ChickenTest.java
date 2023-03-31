package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChickenTest {
    public ChickenTest() {
        Chicken chicken = new Chicken();
    }

    @Test
    public void testMakeNoise(){
        Chicken chicken = new Chicken();
        String expected = "Cluck";
        String actual = chicken.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLayEgg(){
        Chicken chicken = new Chicken();
        int expected = 1;
        chicken.layEgg();
        Assert.assertEquals(expected, chicken.getEggsLaid());
    }

//    @Test
//    public void testHasBeenFertilized(){
//        Chicken chicken = new Chicken();
//        chicken.hasBeenFertilized();
//        Assert.assertFalse(chicken.hasBeenFertilized());
//    }

    @Test
    public void testEatCorn(){
        Chicken chicken = new Chicken();
        int expected = 3;
        chicken.eatCorn();
        Assert.assertEquals(expected, chicken.eatCorn());
    }

    @Test
    public void testEatTomato(){
        Chicken chicken = new Chicken();
        int expected = 1;
        chicken.eatTomato();
        Assert.assertEquals(expected, chicken.eatTomato());
    }
}
