package com.zipcodewilmington.froilansfarm;

public class Tractor extends FarmVehicle{
    Field field;
    CropRow<Crop> cropRow;
    public String makeNoise() {
        return "I'm a tractor yo";
    }

    public void operates() {
        for (int i = 0; i < field.size(); i++) {
            if (cropRow.get(i) == CornStalk) {
                if (cropRow.get(i).hasBeenFertilized == true) {
                    cropRow.get(i).hasBeenHarvested = true;
                }
            } else if (cropRow.get(i) == TomatoPlant) {
                if (cropRow.get(i).hasBeenFertilized == true) {
                    cropRow.get(i).hasBeenHarvested = true;
                }
            }
        }
    }
}
