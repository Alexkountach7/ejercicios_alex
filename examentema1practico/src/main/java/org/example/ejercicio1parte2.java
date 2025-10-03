package org.example;

import java.util.Scanner;

public class ejercicio1parte2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int numero=0;
        int numero1;
        boolean repetir = false;
        do {
            try {
                System.out.println("introduce un numero ");
                numero = sc.nextInt();
                repetir = false;
            } catch (Exception err) {
                System.out.println("introduce un valor valido");
                repetir = true;
            }
            sc.nextLine();
        }while(repetir == true);
        if (numero<0){
            numero = numero*-1;
            System.out.println("el numero absoluto es: "+numero);
        }else{
            System.out.println("el numero absoluto es: " +numero);
        }

    }
}