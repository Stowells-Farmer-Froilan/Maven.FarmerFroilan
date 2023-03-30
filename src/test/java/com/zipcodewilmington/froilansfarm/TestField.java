package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class TestField {
    @Test
    public void testAddCropRow(){
        // Given
        Field<CropRow> field = new Field<>();
        CropRow cornRow = new CropRow();
        CropRow tomatoRow = new CropRow();
        CropRow mangoRow = new CropRow();
        // When
        field.add(cornRow);
        field.add(tomatoRow);
        field.add(mangoRow);
        // Then
        Assert.assertEquals(3, field.size());
    }
    @Test
    public void testInstanceOfStorage(){
        // Given
        Field<CropRow> field = new Field<>();
        // Then
        Assert.assertTrue(field instanceof Storage);
    }
    @Test
    public void testRemoveCropRow(){ // move to CropRow
        // Given
        Field<CropRow> field = new Field<>();
        CropRow cornRow = new CropRow();
        CropRow tomatoRow = new CropRow();
        CropRow papayaRow = new CropRow();
        // When
        field.add(cornRow);
        field.add(tomatoRow);
        field.add(papayaRow);
        field.remove(cornRow);
        // Then
        Assert.assertEquals(2, field.size());
        Assert.assertEquals(tomatoRow, field.get(0));
    }


}
