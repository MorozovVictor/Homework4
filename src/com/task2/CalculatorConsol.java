package com.task2;

import java.util.Scanner;

public class CalculatorConsol {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите операцию: ");
        String operation = scanner.next();
        
        if (operation.equals("modulus")) {
            System.out.print("Введите число: ");
            int firstOperand = scanner.nextInt();
                
            System.out.println(" Abs (" + firstOperand + ") = " + Math.abs(firstOperand));
        } else {
            System.out.print("Введите первое число: ");
            int firstOperand = scanner.nextInt();
            
            System.out.print("Введите второе число: ");
            int secondOperand = scanner.nextInt();

            switch (operation) {
                case "multiplication": 
                    System.out.println(firstOperand + " * " + secondOperand + " = " + (firstOperand * secondOperand));
                    break;
                case "division": 
                    System.out.println(firstOperand + " / " + secondOperand + " = " + (firstOperand / secondOperand));
                    break;
                case "addition": 
                    System.out.println(firstOperand + " + " + secondOperand + " = " + (firstOperand + secondOperand));
                    break;
                case "subtraction": 
                    System.out.println(firstOperand + " - " + secondOperand + " = " + (firstOperand - secondOperand));
                    break;
                case "remainder": 
                    System.out.println(firstOperand + " % " + secondOperand + " = " + (firstOperand % secondOperand));
                    break;
                default :
                    System.out.println("Введенная операция не поддерживается");
                    help();

            }
        }
    }
    
    public static void help() {
        System.out.println("Поддерживаемые операции: multiplication, division, addition, subtraction, remainder, modulus");
        
        return;
        
    }
}