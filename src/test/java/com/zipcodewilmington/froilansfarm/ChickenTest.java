package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChickenTest {
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
        Object unFertilizedEgg = new Object();
        unFertilizedEgg.hasBeenFertilized(false);
        Assert.assertFalse(unFertilizedEgg.hasBeenFertilized);
    }


//    }
//    @Test
//    public void testEat(int numberOfFood, Crop<Corn>){
//        numberOfFood = CornStalk.get();
//        int expected = numberOfFood -
//        int eaten = Chicken.eat();
//
//        Assert.assertEquals(eaten);
//    }
}
