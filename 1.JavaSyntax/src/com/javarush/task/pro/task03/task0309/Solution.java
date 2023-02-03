package com.javarush.task.pro.task03.task0309;

import java.util.Scanner;

/* 
Ищем максимум
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // сканер для считывания
        int numberA = scanner.nextInt(); // считывание числа 1
        int numberB = scanner.nextInt(); // считывание числа 2

        //логика
        System.out.println(numberA > numberB ? numberA : numberB);
    }
}
