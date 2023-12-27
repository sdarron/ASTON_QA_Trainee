package ru.aston.trainee;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *  Составить алгоритм:
 *  на входе есть числовой массив, необходимо вывести элементы массива кратные 3
 *  @author Зайцев Денис
 *  @version 1.0
 */

public class MultipleNumber {
    public static void main(String[] args) {
        int multNum = 3;
        int array[] = {};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        try {
            int length = scanner.nextInt();
            array = new int[length];
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < length; i++) {
                array[i] = scanner.nextInt();
            }
        } catch (InputMismatchException ex) {
            System.out.println("Было введено не целое число");
            return;
        }
        List<Integer> multipleList = Arrays.stream(array).filter(i -> i % multNum == 0).boxed().collect(Collectors.toList());
        System.out.println("Элементы массива кратные " + multNum + ":");
        multipleList.stream().forEach(System.out::println);
    }
}


