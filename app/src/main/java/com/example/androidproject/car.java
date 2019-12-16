package com.example.androidproject;

public class car extends E_Vehicle {
    private String Ctype;

    public car(String model, String plate, String color, String ctype) {
        super(model, plate, color);
        Ctype = ctype;
    }

    @Override
    public String data() {

        String data = super.data() + "Motorcycle = \n"+"Model" + super.getModel() + "\n"
                + "plate = "+ super.getPlate() +"\n" + "color =" +super.getColor()+"\n";
        data += "-" + Ctype;
        return data;
    }
}
