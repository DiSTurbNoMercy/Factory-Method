package com.example.factorymethod;

public class BMW extends Car {

    @Override
    public String getInfo() {
        return "Сar Model: " + EuropeCarCreator.BMW;
    }
}

