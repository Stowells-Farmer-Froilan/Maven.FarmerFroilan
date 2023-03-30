package com.zipcodewilmington.froilansfarm;

public class CropDuster extends Aircraft {
    public static void fertilize(){

        for (Crop c : CropRow){
            if (c instanceof CornStalk) {
                cornStorage += 10;
            }else if (c instanceof TomatoPlant) {
                tomatoStorage += 10;
            }
        }

        for (egg e : something) {
            eggStorage += 1;
        }

    }
}
