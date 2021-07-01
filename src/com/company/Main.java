package com.company;

public class Main {

    public static void main(String[] args) {
        Country country = new Country();
        country.nameCountry = "Германия";
        Country country2 = new Country();
        country2.nameCountry = "Польша";

//        Audi audi = new Audi("Audi A6",3.5,"Седан",4, country);
//        audi.Taxi("Машина для","дотсавки пицы ","*НЕ РАБОЧИЙ*");
//        System.out.println(audi.getInfo());
//        Tico tico = new Tico("Tico 234",0.8,"Хэтчбек",4,country2);
//        tico.Taxi("Машина для","перевозки картошки");
//        System.out.println(tico.getInfo());
        Tico tico2 = new Tico("Tico C3",0.6,"Хэтчбек",4,country2);
//        tico2.Taxi("Машина для ","перевозки пассажиров ","РАБОЧИЙ");
//        System.out.println(tico2.getInfo());
        Tico t = new Tico("Tico C3",0.6,"Хэтчбек",4,country2);

    }
}
