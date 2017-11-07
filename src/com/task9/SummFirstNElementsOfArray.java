package com.task9;

import java.util.Scanner;

public class SummFirstNElementsOfArray {
    
    public static void main(String[] args) {
        
        int[] array = new int[10];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        
        System.out.print("Массив ");
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        System.out.println();
        
        int summ = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите N(<" + array.length + "): ");
        int n = scanner.nextInt();
        
        if (n > array.length - 1) {
            System.out.println("Ошибка. N должно быть меньше " + array.length + ".");
            return;
        } else {
            
            for (int i = 0; i <= n; summ += array[i], i++) {}
        }
        System.out.println("Сумма первых " + n + " элементов массива = " + summ);
        
    }
}