package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;

public class animalTest {

    @Test
    public void makeNoiseTest(){
        //given
        Animal animal = new animal();
        String expected = "cluck or whatever horses do";
        //when
        String actual = animal.makeNoise;
        //then
        Assert.assertEquals(expected, actual);
    }
}
