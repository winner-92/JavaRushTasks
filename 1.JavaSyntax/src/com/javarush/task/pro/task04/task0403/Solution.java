package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {

        // считывание ввода
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;  // переменная для завершения программы

        int sum = 0;   // переменная в которую суммируются вводимые значения

        // логика
        while (!isExit) {  // пока не введено значение для выхода
            if (scanner.hasNextInt()) { // пока вводят число
                int number = scanner.nextInt(); // принимать число в переменную
                sum = sum + number; // суммировать вводимые значения сначало 0 + ввод потом прошлое введенное число и новый ввод
            } else if (scanner.hasNextLine()) { // иначе если вводят строку
                String line = scanner.nextLine(); // принять строку в переменную
                if (line.equals("ENTER")) { // если введено слово "Enter"
                    isExit = true; // выйти из цыкла и
                }
            }
        }
        System.out.println(sum);  // и вывести сумму
    }
}


