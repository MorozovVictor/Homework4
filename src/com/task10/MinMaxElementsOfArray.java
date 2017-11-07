package com.task10;

public class MinMaxElementsOfArray {
    
    public static void main(String[] args) {
        
        int[] array = new int[args.length];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }
        
        System.out.print("Массив ");
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        int min = array[0], max = array[0];
        
        for (int i = 1; i <= array.length - 1; i++) {
            
            if (min > array[i]) {
                min = array[i];
            }
            
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Min = " + min + "; Max = " + max);
        
    }
}