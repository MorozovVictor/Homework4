package com.task4;

import java.util.Scanner;

public class Tips {
    
    public static void main(String[] args) {
        
        int summa = 0;
        String service = "";
        
        if (args.length > 0) {
            summa = Integer.parseInt(args[0]);
            service = args[1];
        } else {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите сумму: ");
            summa = scanner.nextInt();

            System.out.print("Введите уровень сервиса(terrible/poor/good/great/excellent): ");
            service = scanner.next();
        }
        
        switch (service) {
            case "terrible":
                break;
            case "poor":
                summa += summa * 5 / 100 ;
                break;
            case "good":
                summa += summa * 10 / 100 ;
                break;
            case "great":
                summa += summa * 15 / 100 ;
                break;
            case "excellent":
                summa += summa * 20 / 100 ;
                break;
            default:
                System.out.println("Уровень сервиса задан неверно.");
                System.out.println("Tips [summa] [terrible/poor/good/great/excellent]");
                return;
        }
        
        System.out.println("Сумма к оплате: " + summa);
    }
}