package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class TestVehicle {

    @Test
    public void testThatVehicleIsInstanceOfRideable(){
        Vehicle vehicle = new Vehicle();
        Assert.assertTrue(vehicle instanceof Rideable);
    }

}
