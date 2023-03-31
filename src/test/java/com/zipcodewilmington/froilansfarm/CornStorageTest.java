package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CornStorageTest {
    @Test
    public void testGetCornStorage() {
        CornStalk stalk = new CornStalk();
        Assert.assertEquals(0, stalk.getCorn());
        Assert.assertEquals(1, stalk.getCorn());
        Assert.assertEquals(2, stalk.getCorn());
        Assert.assertEquals(3, stalk.getCorn());
    }

}