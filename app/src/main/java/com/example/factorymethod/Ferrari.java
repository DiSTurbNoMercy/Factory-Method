package com.example.factorymethod;

public class Ferrari extends Car {

    @Override
    public String getInfo() {
        return "Сar Model: " + EuropeCarCreator.Ferrari;
    }
}
