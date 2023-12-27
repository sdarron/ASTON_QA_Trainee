package ru.aston.trainee;

import java.util.Scanner;

/**
 *  Составить алгоритм: если введенное имя совпадает с Вячеслав,
 *  то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
 *  @author Зайцев Денис
 *  @version 1.0
 */

public class Name {
    public static void main(String[] args) {
        String name = "";
        String nameMask = "Вячеслав";

        Scanner in  = new Scanner(System.in);
        System.out.print("Введите имя: ");
        name = in.nextLine();
        if (name.equals(nameMask)) {
            System.out.printf("Привет, "+ nameMask);
        } else {
            System.out.printf("Нет такого имени");
        }
        in.close();
    }
}


