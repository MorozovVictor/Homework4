package com.task8;

public class ExponentiationTwo {
    
    public static void main(String... args) {
        
        for (int i = 2, j = 1; j < 21; i *= 2, j++) {
            System.out.println(j + ". " + i);
        }
    }
}