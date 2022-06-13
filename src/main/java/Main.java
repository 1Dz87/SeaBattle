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

    private static final String STRING_CONSTANT = "Нейкая строка";

    public static final String EXCLAMATION_MARKS = "!!";

    public static final String QUESTION_MARKS = "??";

    public static void main(String[] args) {
        final String str = "some string";
        Car car = new Car("Mercedes");
        int num = Car.number;
        String s = Car.moreStrings;
        //doSmth(5);
        doSwitch(5);
    }

    public static void doSmth(int x) {
        if (x == 1) {
            System.out.println("Это 1");
        } else if (x == 2) {
            System.out.println("Это больше одно, но меньше 3-х");
        } else if (x == 3) {
            System.out.println("Это 3");
        } else {
            System.out.println("Слишком большое число");
        }
    }

    public static void switchString(String s) {
        Car car = new Car("Mercedes");
        switch (s) {
            case EXCLAMATION_MARKS:
                System.out.println("Don't shout!");
                break;
            case QUESTION_MARKS:
                System.out.println("What is the question?");
                break;
            default:
                System.out.println("I can't hear you.");
        }
    }

    public static void doSwitch(int x) {
        switch (x) {
            case 1:
                System.out.println("Это 1");
                break;
            case 2:
                System.out.println("Это больше одного, но меньше 3-х");
                break;
            case 3:
                System.out.println("Это 3");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Это меньше 7-ми");
                break;
            default:
                System.out.println("Слишком большое число");
        }
    }
}
/**
 * ? - вопросительный знак
 * ! - восклицательный знак
 * [.,;] - знак препинания
 * [:-] - Что это?
 * по умолчанию - не известный знак
 *
 */
