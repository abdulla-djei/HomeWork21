package com.company;

import java.util.Arrays;

public class Car {
    protected Car car;
    private String model;
    private double horsepower;
    private String type;
    private int door;
    private Country countryName;

    public String getModel() {
        return model;
    }

    public double getHorsepower() {
        return horsepower;
    }

    public String getType() {
        return type;
    }

    public int getDoor() {
        return door;
    }

    public Country getCountryName() {
        return countryName;
    }

    public Car(String model, double horsepower, String type, int door, Country countryName) {
        this.model = model;
        this.horsepower = horsepower;
        this.type = type;
        this.door = door;
        this.countryName = countryName;
    }
    public String getInfo(){
        return "Model: " + model + "\nHorsepower: " + horsepower +
                "\nType: " + type +
                "\nDoor: " + door +
                "\nDoor: " + countryName.getNameCountry()+
                "\n_________________________________________";
    }}
