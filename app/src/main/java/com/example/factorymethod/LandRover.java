package com.example.factorymethod;

public class LandRover extends Car {

    @Override
    public String getInfo() {
        return "Сar Model: " + EuropeCarCreator.LandRover;
    }
}
