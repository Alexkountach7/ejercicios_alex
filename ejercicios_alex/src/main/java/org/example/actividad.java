package org.example;

import java.util.Scanner;

public class actividad {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String curso;
        System.out.println("¿Como te llamas?");
        nombre = sc.nextLine();  // si la palabra va a tener espacios nextline
        System.out.println("cual es tu curso?");
        curso = sc.next();

        System.out.println("hola, tu nombre esmai " +nombre + " bienvenido a " +curso);


    }
}
