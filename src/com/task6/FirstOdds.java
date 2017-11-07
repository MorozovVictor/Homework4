package com.task6;

public class FirstOdds {
    
    public static void main(String... args) {
        
        for (int i = 1, j = 1; j < 56; i += 2, j++) {
            System.out.println(j + ". " + i);
        }
    }
}