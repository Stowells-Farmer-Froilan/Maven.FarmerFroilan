package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChickenTest {

    public Chicken chicken;
//    private EdibleEgg edibleEgg;
    @Before
    public void before(){
        chicken = new Chicken();
    }

    public ChickenTest(Chicken chicken) {
        this.chicken = chicken;
    }

    @Test
    public void testMakeNoise(){
        String expected = "Cluck";
        String actual = chicken.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHasBeenFertilized(){
        edibleEgg.hasBeenFertilized(true);
        Assert.assertTrue(edibleEgg.hasBeenFertilized);
    }

    @Test
    public void testYield(){
        int actual = chicken.yield();
        Assert.assertNotNull(actual);

    }
//    @Test
//    public void testEat(int numberOfFood, Crop<Corn>){
//        numberOfFood = CornStalk.get();
//        int expected = numberOfFood -
//        int eaten = Chicken.eat();
//
//        Assert.assertEquals(eaten);
//    }
}
