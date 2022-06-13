package model;

import interfaces.Moveable;

import java.util.ArrayList;
import java.util.List;

public class Car implements Moveable {

    public static int number = 5;

    public static String moreStrings = "!!!";

    public static List<String> needMoreString = new ArrayList<>();
    static {
        needMoreString.add("??");
        needMoreString.add("^^");
        needMoreString.add("::");
    }

    private String name;

    public Car(String name) {
        Car.moreStrings = "asad";
        this.name = name;
    }

    public void move(String direction) {
        Car.number = 7;
    }

    public void stop() {
        String s = "";
        switch (s) {
            case "???":
                // тормозить
                break;
            case "!!!":
                // тормозить но сильно
                break;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
