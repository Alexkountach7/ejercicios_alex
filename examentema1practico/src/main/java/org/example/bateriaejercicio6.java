package org.example;

import java.util.Scanner;

public class bateriaejercicio6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double base;
        double altura;
        do {
            System.out.println("introduce un valor base");
            base = sc.nextDouble();
            if (base<0){
                System.out.println("el valor de base tiene que ser positivo");
            }
        }while(base<0);
        do {
            System.out.println("introduce un valor altura");
            altura = sc.nextDouble();
            if (altura<0){
                System.out.println("debes introducir una altura positiva");
            }
        }while(altura<0);
        double area = (base * altura)/2;
        System.out.println("el area del triangulo es: "+area);
    }
}
