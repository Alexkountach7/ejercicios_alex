package org.example;

import java.util.Scanner;

public class bateriadeejercicios2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double horas;
        double tarifa;
        double excedentehoras;
        double salariosimple;
        double tarifaexcedente;
        double salarioextra;
        System.out.println("introduce el numero de horas ");
        horas = sc.nextDouble();
        System.out.println("introduce el precio de la tarifa");
        tarifa = sc.nextDouble();



        if (horas > 40){
            excedentehoras = horas - 40;
            tarifaexcedente = excedentehoras * 1.5 * tarifa;
            salarioextra = (tarifa * 40) + (tarifaexcedente);
            System.out.println("el salario total es: "+salarioextra);
        }else {
            salariosimple = horas * tarifa;
            System.out.println("el salario simple es: " +salariosimple);
        }
    }
}
