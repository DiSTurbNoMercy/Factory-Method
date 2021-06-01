package com.example.factorymethod;

public class EuropeCarCreator extends CarCreator {

    public static final String BMW = "BMW";
    public static final String Renault = "Renault";
    public static final String LandRover = "Land Rover";
    public static final String Dacia = "Dacia";
    public static final String Ferrari = "Ferrari";


    @Override
    public Car create(String name) {
        if (name.equals(BMW)) {
            return new BMW();
        } else if (name.equals(Renault)) {
            return new Renault();
        } else if (name.equals(LandRover)) {
            return new LandRover();
        } else if (name.equals(Dacia)) {
            return new Dacia();
        } else if (name.equals(Ferrari)) {
            return new Ferrari();
        }
        return null;
    }
}
