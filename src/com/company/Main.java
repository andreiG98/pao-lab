package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*System.out.println("Hello");

        int a = 4, b = 10;
        int sum = a + b;
        System.out.println("Suma numerelor " + a + " si " + b + " este " + sum);*/

        Scanner scanner = new Scanner(System.in);
        /*String line = scanner.nextLine();
        System.out.println(line);*/

        //Citim actiuni: 0 - exit, 1 - suma, 2 - diferenta

        int choice;
        do {
            System.out.println("0 - exit, 1 - suma, 2 - diferenta");
            choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Exit...");
                    break;
                case 1:
                    System.out.println("Dati 2 numere: ");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    System.out.println("Suma numerelor " + a + " si " + b + " este " + (a + b));
                    break;
                case 2:
                    System.out.println("Dati 2 numere: ");
                    int c = scanner.nextInt();
                    int d = scanner.nextInt();
                    System.out.println("Diferenta numerelor " + c + " si " + d + " este " + (c - d));
                    break;
                default:
                    System.out.println("Am citit altceva.");
                    break;
            }
        }while(choice != 0);

    }
}
