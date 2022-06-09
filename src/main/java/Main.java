import interfaces.Moveable;
import interfaces.Sinkable;
import model.Car;
import model.Ship;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    /*public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(7);
        integers.add(13);
        integers.add(2);
        integers.add(1);
        integers.add(17);
        integers.add(44);
        integers.add(22);

        int x;
        Integer ex; // null
        Boolean b; // true, false, null

        integers.remove(Integer.valueOf(17));
        for (int i = 0; i < integers.size(); i++) {
            System.out.println(integers.get(i));
        }
        // int -> Integer
        // float -> Float
        // long -> Long
        // double -> Double
        // char -> Character
        // short -> Short
        // byte -> Byte
        // boolean -> Boolean
    }*/

/*    public static void main(String[] args) {
        LinkedList<Double> doubles = new LinkedList<>();
        Ship ship = new Ship();
        ship.smth(doubles);
    }*/

    public static void main(String[] args) {
        Moveable ship = new Ship();
        ship.move("right");

        Moveable car = new Car();
        car.move("left");

        ArrayList<Moveable> moveables = new ArrayList<>(); // асширяемый массив
        moveables.add(ship); // Добавить элемент в коллекцию, в данном случ. объект ship
        moveables.add(car);

        int indexOfCar = moveables.indexOf(car); // Получить индекс текущего элемента коллекции
        moveables.remove(indexOfCar); // Удалить текущий элемент из коллекции
        moveables.clear(); // очистить коллекцию
        boolean isInCollection = moveables.contains(ship); // Возвращает TRUE, если элемент присутствует в коллекции
        moveables.lastIndexOf(car); // Возвращает последний индекс элемента в коллекции
        int size = moveables.size(); // Возвращает текущий размер коллекции

        LinkedList<Moveable> moveableLinkedList = new LinkedList<>();
        moveableLinkedList.add(ship);
        moveableLinkedList.add(car);

        moveableLinkedList.get(0);
        moveableLinkedList.remove(car);

        Moveable shipFromArray = moveables.get(0);

        moveables.remove(1);
        moveables.remove(car);

        if (ship instanceof Sinkable) {
            ((Sinkable) ship).sink(15f);
        }
    }
}
