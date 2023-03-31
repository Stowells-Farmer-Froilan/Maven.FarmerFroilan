package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class EggStorageTest {
    @Test
    public void testUnFertilizedEggs() {
        ChickenCoop coop = new ChickenCoop();
        Chicken chicken = new Chicken();
        Assert.assertEquals(0, chicken.getEggsLaid());
        Assert.assertEquals(1, chicken.getEggsLaid());
        Assert.assertEquals(2, chicken.getEggsLaid());
        Assert.assertEquals(3, chicken.getEggsLaid());
        }

    }
