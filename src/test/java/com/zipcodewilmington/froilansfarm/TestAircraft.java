package com.zipcodewilmington.froilansfarm;

import org.junit.Test;

public class TestAircraft {

    @Test
    public void testThatAircraftIsInstanceOfFarmVehicle(){
        Aircraft aircraft = new Aircraft();
        Assert.asserTrue(aircraft instanceof FarmVehicle);
    }

    @Test
    public void testThatAircraftIsInstanceOfVehicle(){
        Aircraft aircraft = new Aircraft();
        Assert.asserTrue(aircraft instanceof Vehicle);
    }

    @Test
    public void testThatAircraftIsInstanceOfRideable(){
        Aircraft aircraft = new Aircraft();
        Assert.asserTrue(aircraft instanceof Rideable);
    }
}
