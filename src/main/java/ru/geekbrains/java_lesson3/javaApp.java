package ru.geekbrains.java_lesson3;

import java.util.Random;
import java.util.Scanner;

/*
Написать программу, которая загадывает случайное число от 0 до 9
и пользователю дается 3 попытки угадать это число.
При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число,
чем загаданное, или меньше.
После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»
(1 – повторить, 0 – нет).

 */

public class javaApp {
    public static void main(String[] args) {
        int halfs = 3; // количество попыток
        int i = 0; // число для сравнения в колличеством жизней в игре. Используется во 2м цикле
        int exit = 1; // Нужно для входа в первый цикл программы
        Scanner sc = new Scanner(System.in); // Запускаем сканер
        String exitstr ="Повторить игру еще раз. Для продолжения нажмите 1. Для выхода 0";
        String question ="Введие число от 0 до 9";
        String number ="Число которое я загадал = ";
        String halfsstr ="Попыток осталось = ";
        String yes ="Правильно";
        String no ="Загаданное число меньше";
        String no2 ="Загаданное число больше";
        String leave ="Игра окончена";

        /*
        Цикл меняющий рандомное число, при окончании колличества попыток
         */
        while (exit == 1){
            Random rand = new Random();
            int x = rand.nextInt(9);
            exit--;
            /*
            Основной цикл игры.
             */
            while (i != halfs) {

                System.out.println(question);
                int a = sc.nextInt();

                if (x == a) {
                    System.out.println(yes);
                    i = halfs;

                    } else if (x < a )  {
                        System.out.println(no);
                        i++;
                        System.out.println(halfsstr + (halfs - i));

                    } else {
                    System.out.println(no2);
                    i++;
                    System.out.println(halfsstr + (halfs - i));

                    }
                        /*
                        Условие для выхода из игры
                         */
            }
                System.out.println(number + x);
                System.out.println(exitstr);
                int b = sc.nextInt();
                switch (b){
                        case 0:
                        break;
                        case 1:
                            i = 0;
                            exit++;
                            default:
                                //nothing to do
                        }

            

        }
        System.out.println(leave);
        sc.close(); // Закрываем сканер
    }

}
