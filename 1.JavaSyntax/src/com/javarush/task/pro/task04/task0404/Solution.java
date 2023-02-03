package com.javarush.task.pro.task04.task0404;

/* 
Заполненный прямоугольник
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        int height = 0; // переменная для высоты прямоугольника
        while (height < 5) {  // внешний цикл для высоты прямоугольника
            int width = 0; // переменная для длинны прямоугольника
            while (width < 10) { // внутренний цикл для длинны прямоугольника
                System.out.print('Q'); // тело внутреннего цикла что вводить print - без перевода строки
                width++; // увеличение значения ширины
            }
            System.out.println(); // смена строки для смены высоты
            height++; // увеличение переменной высоты
        }
    }
}