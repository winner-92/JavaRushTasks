package com.javarush.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Треугольник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";

    public static void main(String[] args) {


        // ввод
        Scanner scanner = new Scanner(System.in);
        int side1 = scanner.nextInt(); // считыванеи ввода 1 числа в переменную
        int side2 = scanner.nextInt(); // считыванеи 2 числа в переменную
        int side3 = scanner.nextInt(); // считывание 3 числа в переменную

        //логика задачи
        if ((side1 < side2 + side3) && (side2 < side3 + side1) && (side3 < side1 + side2)) {
            System.out.println(TRIANGLE_EXISTS);
        }  else {
            System.out.println(TRIANGLE_NOT_EXISTS);
        }
    }
}
