package com.company;

public final class Tico extends Audi {
    @Override
    public void Taxi(String string) {
        super.Taxi(string);
    }

    public Tico(String model, double horsepower, String type, int door, Country countryName) {
        super(model, horsepower, type, door, countryName);
    }
}
