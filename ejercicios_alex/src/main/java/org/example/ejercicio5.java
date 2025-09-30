package org.example;

import java.util.Scanner;

public class ejercicio5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir un numero ");
        int numero1 = sc.nextInt();
        System.out.println("introducir otro numero");
        int numero2 = sc.nextInt();
        if (numero2 == 0){
            System.out.println("error el divisor no puede ser cero");

        }else {
            double dividir = numero1 / numero2;
            System.out.println("el resultado de la division es: "+dividir);
        }
    }
}
