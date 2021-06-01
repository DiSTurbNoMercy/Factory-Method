package com.example.factorymethod;

public class Renault extends Car {

    @Override
    public String getInfo() {
        return "Сar Model: " + EuropeCarCreator.Renault;
    }
}