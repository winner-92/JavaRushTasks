package com.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        boolean number1number2 = (number1 == number2);
        boolean number1number3 = (number1 == number3);
        boolean number2number3 = (number2 == number3);

        if (number1number2) {
            if (number1number3) {
                System.out.println(number1 + " " + number2 + " " + number3);
            } else {
                System.out.println(number1 + " " + number2);
            }
        } else if (number1number3) {
            System.out.println(number1 + " " + number3);
        } else if (number2number3) {
            System.out.println(number2 + " " + number3);
        }
    }
}

