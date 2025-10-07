package org.example;

import java.util.Scanner;

public class bateriaejercicio7 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("tienes tomate");
        char tomate = sc.next().charAt(0);
        System.out.println("tiene aceite");
        char aceite = sc.next().charAt(0);
        System.out.println("tiene jamon");
        char jamon = sc.next().charAt(0);

        if (tomate != 's' || aceite != 's' || jamon != 's'){
            System.out.println("tiene que ir a comprar");
        }else {
            System.out.println("no tiene que ir a comprar");
        }
    }
}
