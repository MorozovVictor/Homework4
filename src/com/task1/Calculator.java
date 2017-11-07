package com.task1;

public class Calculator {
    
    public static void main(String[] args) {
        
        if (args.length < 2 || args.length > 3) {
            help();
        } 
        
        if (args.length == 2) {
            String operation = args[0];
            int firstOperand = Integer.parseInt(args[1]);     

            switch (operation) {
                case "modulus": 
                    System.out.println(" Abs (" + firstOperand + ") = " + Math.abs(firstOperand));
                    break;
                default :
                    System.out.println("Введенная операция не поддерживается");
                    help();
            }
        }
        if (args.length == 3) {
            String operation = args[0];
            int firstOperand = Integer.parseInt(args[1]);
            int secondOperand = Integer.parseInt(args[2]);

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
        System.out.println("Поддерживаемые операции:");
        System.out.println("multiplication [firstOperand] [secondOperand]");
        System.out.println("division [firstOperand] [secondOperand]");
        System.out.println("addition [firstOperand] [secondOperand]");
        System.out.println("subtraction [firstOperand] [secondOperand]");
        System.out.println("remainder [firstOperand] [secondOperand]");
        System.out.println("modulus [Operand]");
        System.out.println("--help");
        
        return;
        
    }
}