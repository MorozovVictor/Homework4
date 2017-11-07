package com.task11;

public class SumEvenOddElementsOfArray {
    
    public static void main(String[] args) {
        
        if (args.length == 0) {
            System.out.println("SumEvenOddElementsOfArray elem1 elem2 ... elemN");
            return;
        }
        
        int[] array = new int[args.length];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }
        
        System.out.print("Массив ");
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        int sumEven = 0, sumOdd = 0;
        
        for (int i = 0; i <= array.length - 1; i++) {
            
            if (i % 2 == 0) {
               sumOdd += array[i]; 
            } else {
               sumEven += array[i]; 
            }
 
        }
        System.out.println("Сумма четных элементов = " + sumEven);
        System.out.println("Сумма нечетных элементов = " + sumOdd);
        
    }
}