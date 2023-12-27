package ru.aston.trainee;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *  Составить алгоритм: если введенное число больше 7, то вывести “Привет”
 *  @author Зайцев Денис
 *  @version 1.0
 */

public class Hello {
    public static void main(String[] args) {
        int num = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        try {
            num = in.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Было введено не целое число");
        }
        if (num > 7) {
            System.out.printf("Привет");
        }
        in.close();
    }
}