package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class BotanistTest {
    //tests:
    //plant check
    //speak check
    //eat check

    @Test
    public void testSpeak(){
        //given
        Farmer farmer = new Farmer("Bob");
        String expected = "Yeah I be planting";
        //when
        String actual = farmer.makeNoise();
        //then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testPlant(){
        //given
        Farmer farmer = new Farmer("Bob");
        String expected = "There I go planting again!";
        //when
        String actual = farmer.plant(Corn);
        //then
        Assert.assertEquals(expected, actual);
    }
//    @Test
//    public void testEat(){
//        //given
//        Botanist botanist = new Botanist();
//        String expected = "Wow I ate this crop I planted!";
//        //when
//        String actual = botanist.eat;
//        //then
//        Assert.assertEquals(expected, actual);
//
//    }

}
