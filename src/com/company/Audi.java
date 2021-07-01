package com.company;

public class Audi extends Car {
    public Audi(String model, double horsepower, String type, int door, Country countryName) {
        super(model, horsepower, type, door, countryName);
    }

    public void Taxi(String string) {
        System.out.println(string);

      }

    public final void Taxi(String s,String s2) {
        System.out.println(s + s2);

    }

    public void Taxi(String s,String s2,String condition) {
        System.out.println(s + s2 + condition);
    }
}
