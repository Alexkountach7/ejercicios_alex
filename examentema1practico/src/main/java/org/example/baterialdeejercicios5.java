package org.example;

import java.util.Scanner;

public class baterialdeejercicios5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero");
        double numero1 = sc.nextDouble();
        System.out.println("introduce un numero");
        double numero2 = sc.nextDouble();
        if (numero2==0){
            System.out.println("lo siento no se uede dividir entre 0");
        }else {
            double dividir = numero1/numero2;
            System.out.println("el resultado de la division es: "+dividir);
        }
    }
}
