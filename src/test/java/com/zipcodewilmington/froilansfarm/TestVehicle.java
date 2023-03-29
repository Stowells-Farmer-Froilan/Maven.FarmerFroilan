package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class TestVehicle {

    @Test
    public void testThatVehicleIsInstanceOfRideable(){
        Vehicle vehicle = new Vehicle();
        Assert.assertTrue(vehicle instanceof Rideable);
    }

//    @Test
//    public void testOperate(){
//        Vehicle vehicle = new Vehicle();
//        boolean expected = true;
//        boolean actual = vehicle.operate();//does something
//        Assert.assertEquals(expected, actual);
//    }
}
