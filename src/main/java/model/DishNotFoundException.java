package model;

public class DishNotFoundException extends RuntimeException {

    public DishNotFoundException() {
        super("Блюдо не найдено");
        System.out.println("Произошел вызов конструктора исключения");
    }
}
