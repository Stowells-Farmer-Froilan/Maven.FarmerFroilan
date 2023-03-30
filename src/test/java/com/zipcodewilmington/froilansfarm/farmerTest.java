package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class farmerTest {
    //Tests: ride, harvest. isPilot
//    @Test
//    public void harvestTest(){
//        //given
//        Farmer farmer = new Farmer();
//        Integer expected = 1;
//        //when
//        Integer actual = farmer.harvest;
//        //then
//        Assert.assertEquals(expected, actual);
//    }

    @Test
    public void rideTractorTomatoTest(){
        //given
        Farmer farmer = new Farmer();
        farmer.ride(tractor);
        int expected = 0;
        //when
        int actual = farm.getTomatoYield();
        //then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void rideTractorCornTest(){
        //given
        Farmer farmer = new Farmer();
        farmer.ride(tractor);
        int expected = 0;
        //when
        int actual = farm.getCornYield();
        //then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void rideHorseTest(){
        //given
        Farmer farmer = new Farmer();
        farmer.ride(horse);
        String expected = "neigh";
        //when
        String actual = horse.makeNoise();
        //then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSpeak(){
        //given
        Farmer farmer = new Farmer();
        String expected = "Yeah I be farming";
        //when
        String actual = farmer.speak();
        //then
        Assert.assertEquals(expected, actual);
    }
}
