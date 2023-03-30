package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;


public class personTest {
    @Test
    public void getNameTest(){
        //Given
        Person person = new Person("Bob");
        String expected = "Bob";
        //When
        String actual = person.getName();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest(){
        //Given
        Person person = new Person("Bob");
        person.setName("Trung");
        String expected = "Trung";
        //When
        String actual = person.getName();
        //Then
        Assert.assertEquals(expected, actual);
    }
//    @Test
//    public void testRide(){
//        //given
//        Person person = new Person();
//        perso
//        String expected = "You ride a";
//        //when
//        String actual = person.ride;
//        //then
//        Assert.assertEquals(expected, actual);
//    }


    //Eater
    @Test
    public void testEat(){
        //given
        Person person = new Person();
        String expected = "You have ate";
        //when
        String actual = person.eat();
        //then
        Assert.assertEquals(expected, actual);

    }


    //NoiserMaker
    @Test
    public void testSpeak(){
        //given
        Person person = new Person();
        String expected = "Thing to say";
        //when
        String actual = person.speak();
        //then
        Assert.assertEquals(expected, actual);
    }

}
