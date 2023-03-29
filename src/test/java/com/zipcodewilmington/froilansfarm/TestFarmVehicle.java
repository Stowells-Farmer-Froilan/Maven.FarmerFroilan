package com.zipcodewilmington.froilansfarm;

import org.junit.Test;

public class TestFarmVehicle {

    @Test
    public void testThatFarmVehicleIsInstanceOfVehicle() {
        FarmVehicle farmVehicle = new FarmVehicle();
        Assert.assertTrue(farmVehicle instanceof Vehicle);

    }

    @Test
    public void testThatFarmVehicleIsInstanceOfRideable() {
        FarmVehicle farmVehicle = new FarmVehicle();
        Assert.assertTrue(farmVehicle instanceof Rideable);
    }
}
