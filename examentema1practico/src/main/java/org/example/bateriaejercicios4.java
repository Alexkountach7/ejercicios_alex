package org.example;

import java.util.Scanner;

public class bateriaejercicios4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el primer numero ");
        int numero1 = sc.nextInt();
        System.out.println("introduce el segundo numero");
        int numero2 = sc.nextInt();
        System.out.println("introduce el tercer numero");
        int numero3= sc.nextInt();
        int menor;
        if (numero1 == numero2 || numero1 == numero3 || numero2 == numero3){
            System.out.println("has introducido numeros iguales");
        }else {

            if (numero1<numero2 && numero1<numero3){
                menor=numero1;
            } else if (numero2<numero1 && numero2<numero3) {
                menor = numero2;
            }else {
                menor= numero3;
            }
            System.out.println("el numero menor es" +menor);
        }

    }
}
