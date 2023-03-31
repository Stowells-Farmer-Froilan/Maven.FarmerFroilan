package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.security.Permission;

public class TestFarmHouse {
    @Test
    public void testInstanceOfStorage() {
        // Given
        FarmHouse<Person> farmHouse = new FarmHouse<>();
        // Then
        Assert.assertTrue(farmHouse instanceof Storage);
    }

    @Test
    public void testAddPerson(){
        // Given
        FarmHouse<Person> farmHouse = new FarmHouse<>();
        Person james = new Person();
        // When
        farmHouse.add(james);
        // Then
        Assert.assertEquals(1, farmHouse.size());
    }
    @Test
    public void testRemovePerson(){
        // Given
        FarmHouse<Person> farmHouse = new FarmHouse<>();
        Person james = new Person();
        // When
        farmHouse.add(james);
        farmHouse.remove(james);
        // Then
        Assert.assertEquals(0, farmHouse.size());
    }

}
