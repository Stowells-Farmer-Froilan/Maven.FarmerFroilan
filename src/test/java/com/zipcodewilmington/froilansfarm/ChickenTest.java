package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChickenTest {
//    private EdibleEgg edibleEgg;
//    @Before
//    public void before(){
//
//    }

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

    @Test
    public void testHasBeenFertilized(){
        edibleEgg.hasBeenFertilized(true);
        Assert.assertTrue(edibleEgg.hasBeenFertilized);
    }

    @Test
    public void testYield(){
        Chicken chicken = new Chicken();
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
