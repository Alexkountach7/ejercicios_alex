package org.example;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base;
        double altura;
        do {
            System.out.println("introduce el valor de la base ");
             base = sc.nextDouble();

            if (base <= 0) {
                System.out.println("el numero debe ser positivo");
            }
        }while (base <= 0) ;


            do {
                System.out.println("introduce la altura");
                 altura = sc.nextDouble();
                if (altura <= 0) {
                    System.out.println("el valor de la altura debe ser positivo");
                }
            } while (altura <= 0);


            double area = (base * altura) / 2;
            System.out.println("el area del triangulo es" + area);

        }
    }