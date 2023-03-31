package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class PilotTest {
    @Test
    public void testSpeak(){
        //given
        Pilot pilot = new Pilot("Bob");
        String expected = "Yeah I be flying";
        //when
        String actual = pilot.speak();
        //then
        Assert.assertEquals(expected, actual);
    }
//    @Test
//    public void rideCropDusterTomatoTest(){
//        //given
//        Pilot pilot = new Pilot();
//        Pilot.ride(CropDuster);
//        int expected = 0;
//        //when
//        int actual = farm.getTomatoYield();
//        //then
//        Assert.assertEquals(expected, actual);
//    }
//    @Test
//    public void rideCropDusterTomatoTest(){
//        //given
//        Pilot pilot = new Pilot();
//        Pilot.ride(CropDuster);
//        int expected = 0;
//        //when
//        int actual = farm.getCornYield();
//        //then
//        Assert.assertEquals(expected, actual);
//    }
}
