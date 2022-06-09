package model;

import interfaces.Moveable;
import interfaces.Sinkable;

import java.util.ArrayList;
import java.util.List;

public class Ship implements Moveable, Sinkable {

    private String name;

    public void move(String direction) {
        // логика движения корабля
    }

    public void sink(float sinkSpeed) {
        // логика утопания
    }

    public void smth(List<Double> doubles) {

    }
}
