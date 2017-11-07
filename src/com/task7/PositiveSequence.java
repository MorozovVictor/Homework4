package com.task7;

public class PositiveSequence {
    
    public static void main(String... args) {
        
        for (int i = 90; i >= 0; i -= 5) {
            System.out.println(i);
        }
        
        /* или
        int j = 90;
        
        do {
            System.out.println(j);
            j -= 5;
        } while(j >= 0);
        */
    }
}