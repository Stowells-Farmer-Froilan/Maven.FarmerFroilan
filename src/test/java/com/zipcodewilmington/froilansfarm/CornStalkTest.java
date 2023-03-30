package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CornStalkTest {
    @Test
    public void testHarvestCorn(){
        CornStalk stalk = new CornStalk();
        int expected = 10;
        int actual = stalk.getCorn();
        Assert.assertEquals(expected, actual);
    }
}