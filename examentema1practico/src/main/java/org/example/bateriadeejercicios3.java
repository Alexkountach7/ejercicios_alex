package org.example;

import java.util.Scanner;

public class bateriadeejercicios3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero");
        int numero = sc.nextInt();
        if (numero>0){
            System.out.println("el numero es posivito");
        } else if (numero<0) {
            System.out.println("el numero es negativo");
        }else {
           System.out.println("el numero es natural.");
        }
    }
}
