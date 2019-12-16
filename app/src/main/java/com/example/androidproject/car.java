package com.example.androidproject;

public class car extends E_Vehicle {
    private String Ctype;

    public car(String make, String plate, String color, String ctype) {
        super(make, plate, color);
        Ctype = ctype;
    }

    @Override
    public String data() {

        String data = super.data() + "motorcycle = \n" + super.getMake() + "\n"
                + "plate = "+ super.getPlate() +"\n" + "color =" +super.getColor()+"\n";
        data += "-" + Ctype;
        return data;
    }
}
