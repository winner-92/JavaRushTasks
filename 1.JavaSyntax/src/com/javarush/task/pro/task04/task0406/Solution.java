package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показываем, что получаем
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // сканер для считывания ввода
        String enough = "enough"; // переменаня с ключевым словом для выхода

        //логика
        while (true) {  // пока "правда"
            String str = scanner.nextLine(); // считывать ввод строки
            if (str.equals(enough)) { // внутренний циклл  если введено ключевое слово для выхода
                break; // заверишь цикл
            }
            System.out.println(str); //во внешнем цикле вывод строки в терминал
        }
    }
}
