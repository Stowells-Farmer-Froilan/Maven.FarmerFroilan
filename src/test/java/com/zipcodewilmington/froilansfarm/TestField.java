package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class TestField {
    @Test
    public void testAddCropRow(){
        // Given
        Field<CropRow> field = new Field<>();
        // When
        CropRow<corn> row1 = new CropRow();
        CropRow<tomato> row2 = new CropRow();
        CropRow<papaya> row3 = new CropRow();
        field.add(row1);
        field.add(row2);
        field.add(row3);
        // Then
        Assert.assertEquals(3, field.size());
    }
    @Test
    public void testInstanceOfStorage(){
        // Given
        Field<CropRow> field = new Field<>();
        // When
        Assert.assertTrue(field instanceof Storage);
        // Then
    }
    @Test
    public void testRemoveCropRow(){ // move to CropRow
        // Given
        Field<CropRow> field  = new Field<>();
        // When
        CropRow<corn> row1 = new CropRow();
        CropRow<tomato> row2 = new CropRow();
        field.add(row1);
        field.add(row2);
        field.remove(row2);
        // Then
        Assert.assertEquals(1, field.size());
    }

    @Test
    public void testHarvestCrop(){

    }

}
