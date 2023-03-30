package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class botanistTest {
    //tests:
    //plant check
    //speak check
    //eat check

    @Test
    public void testSpeak(){
        //given
        Botanist botanist = new Botanist();
        String expected = "Yeah I be planting";
        //when
        String actual = botanist.speak();
        //then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testPlant(){
        //given
        Botanist botanist = new Botanist();
        String expected = "There I go planting again!";
        //when
        String actual = botanist.plant();
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
