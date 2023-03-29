package com.zipcodewilmington.froilansfarm;

import org.junit.Test;

public class TestTractor {

    @Test
    public void testThatTractorIsInstanceOfFarmVehicle() {
        Tractor tractor = new Tractor();
        Assert.assertTrue(tractor instanceof FarmVehicle);
    }
    @Test
    public void testThatTractorIsInstanceOfVehicle() {
        Tractor tractor = new Tractor();
        Assert.assertTrue(tractor instanceof Vehicle);
    }
    @Test
    public void testThatTractorIsInstanceOfRideable() {
        Tractor tractor = new Tractor();
        Assert.assertTrue(tractor instanceof Rideable);
    }
}
