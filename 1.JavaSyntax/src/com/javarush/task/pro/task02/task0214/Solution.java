package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firststring = scanner.nextLine();
        String secondstring = scanner.nextLine();
        String thirdstring = scanner.nextLine();

        System.out.println(thirdstring);
        System.out.println(secondstring.toUpperCase());
        System.out.println(firststring.toLowerCase());

    }
}
