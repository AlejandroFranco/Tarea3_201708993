package org.pablofranco.ui;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal() {
        try {

            Scanner sc = new Scanner(System.in);
            int opcion;
            System.out.println("Usuarios (1)");
            System.out.println("Contador de digitos repetidos (2)");
            System.out.println("Tres numeros de menor a mayor");
            System.out.println("Calcular promedio (4)");
            System.out.println("Salir (5)");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    usuarios();
                    break;
                case 2:
                    contadorDigitosRepetidos();
                    break;
                case 3:
                    tresNumerosMayorMenor();
                    break;
                case 4:
                    calcularPromedio();
                    break;
                case 5:
                    System.exit(1);
                    break;
            }
        } catch (Exception ex) {
        }
    }

    public static void usuarios() {
    }

    public static void contadorDigitosRepetidos() {
    }

    public static void tresNumerosMayorMenor() {
    }

    public static void calcularPromedio() {
    }
}