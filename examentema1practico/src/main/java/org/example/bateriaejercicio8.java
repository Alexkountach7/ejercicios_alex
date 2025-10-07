package org.example;

import java.util.Scanner;

public class bateriaejercicio8 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce lado uno ");
        double lado1 = sc.nextDouble();
        System.out.println("introduce lado dos");
        double lado2 = sc.nextDouble();
        System.out.println("introduce lado tres");
        double lado3 = sc.nextDouble();

        if (lado1 == lado2 && lado2 == lado3){
            System.out.println("el triangulo es equilatero ");
        } else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
            System.out.println("el triangulo es isosceles");

        }else {
            System.out.println("el triangulo es escaleno");
        }
    }
}
