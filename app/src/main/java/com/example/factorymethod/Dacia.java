package com.example.factorymethod;

public class Dacia extends Car {

    @Override
    public String getInfo() {
        return "Сar Model: " + EuropeCarCreator.Dacia;
    }
}
