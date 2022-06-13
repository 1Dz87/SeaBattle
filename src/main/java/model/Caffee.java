package model;

import java.util.ArrayList;
import java.util.List;

public class Caffee {

    private List<String> dishes;

    public Caffee() {
        this.dishes = new ArrayList<>();
        this.dishes.add("Пицца");
        this.dishes.add("Шницель");
        this.dishes.add("Пюрешка");
        this.dishes.add("Компот");
    }

    public String cook(String dishName) {
        if (this.dishes.contains(dishName)) {
            return dishName;
        }
        throw new DishNotFoundException();
    }
}
