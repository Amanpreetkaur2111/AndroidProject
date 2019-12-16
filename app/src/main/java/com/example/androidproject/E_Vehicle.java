package com.example.androidproject;

public class E_Vehicle {

    private String model, plate, color;

    public E_Vehicle(String model, String plate, String color) {
        this.model = model;
        this.plate = plate;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getPlate() {
        return plate;
    }

    public String getColor() {
        return color;
    }

    public String data(){
        return ""  ;
    }
}
