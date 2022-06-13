import model.Caffee;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        Caffee caffee = new Caffee();
        caffee.cook("Винстон синий");
    }

    public static void division(int x, int y) {
        System.out.println(x/y);
    }

    public static void readLineUnchecked() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println(s);
    }

    public static void readLine() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = reader.readLine();
            System.out.println(s);
        } catch (IOException ex) {
            System.out.println("Произошла ошибка ввода/вывода");
            /*try {
                reader = new BufferedReader(new FileReader(new File("C:/logs.txt")));
                String s = reader.readLine();
            } catch (IOException e) {

            }*/
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("This is finally block");
        }
    }

    /**
     * 1.Error - ошибка, которая возникает во время работы программы (Runtime).
     * 2.Exception - исключительная ситуация, которая может возникать как в
     *              Runtime так и в Compiletime.
     *   a). Сompiletime exception - это проверяемые исключения, наследуются от
     *                              класса Exception
     *   б). Runtime exception - это не проверяемые исключения, наследуются от
     *                           класса RuntimeException
     */

    /**
     * Создать 2 исключения:
     * 1. Проверяемое исключение
     * 2. Не проверяемое исключения
     * Для метода
     * String sell(float cash, String dishName)
     * написать следующую логику:
     * а). Определить стоимость блюда значением 4.75
     * б). если сдача получается меньше 1, то бросить проверяемое исключение
     * в). вызвать метод String cook(String dishName),
     *      в котором если блюдо не найдено, то бросается не проверяемое исключение
     */
}