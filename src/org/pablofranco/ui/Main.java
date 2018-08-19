//LinkRepositorio Git-Hub
//https://github.com/AlejandroFranco/Tarea3_201708993
package org.pablofranco.ui;

import org.pablofranco.bean.Usuario;

import java.util.Scanner;
import java.util.Vector;

public class Main extends Usuario {
    public static Vector<Usuario> vectorUsuarios = new Vector<Usuario>(5, 0);
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal() {
        try {

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
        int opcion;
        try {
            System.out.println("Ingresar usuarios (1)");
            System.out.println("Mostrar usuarios  ascendente (2)");
            System.out.println("Mostrar usuarios descendente (3)");
            System.out.println("Menu principal (4)");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    ingresarUsuarios();
                    break;
                case 2:
                    mostrarUsuariosAsc();
                    break;
                case 3:
                    mostrarUsuariosDesc();
                    break;
                case 4:
                    menuPrincipal();
                    break;
            }

        } catch (Exception ex) {
            System.out.println("Debe ingresar un numero de 1-4");
        }
    }

    private static void mostrarNumeroDigitos() {

    }

    private static void ingresarNumeroBuscar() {

    }

    private static void ingresarNumero() {

    }

    private static void mostrarUsuariosDesc() {
        for (int i = vectorUsuarios.size(); i > 0; i--) {
            System.out.println("Nombre Usuario: " + vectorUsuarios.get(i).getNombreUsuario() + "\n");
        }
        menuPrincipal();
    }

    private static void mostrarUsuariosAsc() {
        for (int i = 0; i < vectorUsuarios.size(); i++) {
            System.out.println("Nombre Usuario: " + vectorUsuarios.get(i).getNombreUsuario() + "\n");
        }
        menuPrincipal();
    }

    public static void ingresarUsuarios() {
        String valor;
        System.out.println("Ingrese el usuario");
        valor = sc.next();
        if (valor.matches("[0-9]+")) {
            System.out.println("Debe ingresar un nombre válido");
            ingresarUsuarios();
        } else {
            valor = valor.trim();
            valor = valor.toLowerCase();
            if (existeUsuario(valor) != 0) {
                System.out.println("Ya existe ese usuario");
                ingresarUsuarios();
            } else {
                vectorUsuarios.add(new Usuario(valor));
                menuPrincipal();
            }
        }
    }

    public static int existeUsuario(String valor) {
        int contador = 0;
        for (int i = 0; i < vectorUsuarios.size(); i++) {
            if (vectorUsuarios.get(i).getNombreUsuario().equals(valor)) {
                contador++;
            } else {
            }
        }
        return contador;
    }


    public static void contadorDigitosRepetidos() {
        int opcion;
        try {
            System.out.println("Ingresar  numero (1)");
            System.out.println("Ingresar numero a buscar (2)");
            System.out.println("Mostrar numero digitos (3)");
            System.out.println("Menu principal (4)");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    ingresarNumero();
                    break;
                case 2:
                    ingresarNumeroBuscar();
                    break;
                case 3:
                    mostrarNumeroDigitos();

                    break;
                case 4:
                    menuPrincipal();
                    break;
            }

        } catch (Exception ex) {
            System.out.println("Debe ingresar un numero de 1-4");
        }

    }

    public static void tresNumerosMayorMenor() {
        int opcion;
        try {
            System.out.println("Ingresar numeros (1)");
            System.out.println("Mostrar ordenados (2)");
            System.out.println("Menu principañ (3)");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    ingresarTresNumeros();
                    break;
                case 2:
                    mostrarTresOrdenados();
                    break;
                case 3:
                    menuPrincipal();

                    break;
            }

        } catch (Exception ex) {
            System.out.println("Debe ingresar un numero de 1-3");
        }
    }

    private static void mostrarTresOrdenados() {

    }

    private static void ingresarTresNumeros() {

    }

    public static void calcularPromedio() {

    }
}