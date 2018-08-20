//LinkRepositorio Git-Hub
//https://github.com/AlejandroFranco/Tarea3_201708993
package org.pablofranco.ui;

import org.pablofranco.bean.Estudiante;
import org.pablofranco.bean.Usuario;

import java.util.*;

public class Main {
    private static Vector<Usuario> vectorUsuarios = new Vector<Usuario>(5, 0);
    private static Vector<Estudiante> vectorEstudiantes = new Vector<Estudiante>(6, 0);
    static int numero1;
    static int numero2;
    static int numero3;
    static String[] partes;
    static Vector<String> numerosGuardados = new Vector<String>();


    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("Usuarios (1)");
        System.out.println("Contador de digitos repetidos (2)");
        System.out.println("Tres numeros de menor a mayor (3)");
        System.out.println("Calcular promedio (4)");
        System.out.println("Salir (5)");
        try {
            opcion = Integer.parseInt(sc.next());
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
                    ingresoEstudiantesPromediar();
                    break;
                case 5:
                    System.exit(1);
                    break;
            }
        } catch (Exception ex) {
            System.out.println("Debe ingresar numeros de 1-5");
            menuPrincipal();
        }
    }

    public static void usuarios() {
        int opcion;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Ingresar usuarios (1)");
            System.out.println("Mostrar usuarios  ascendente (2)");
            System.out.println("Mostrar usuarios descendente (3)");
            System.out.println("Menu principal (4)");
            opcion = Integer.parseInt(sc.next());
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
            menuPrincipal();
        }
    }

    private static void mostrarNumeroDigitos() {

    }

    public static int contadorCaracterEnString(char caracter, char[] arrayCaracteres) {
        int contador = 0;
        int y = 0;

        for (int k = 0; k < arrayCaracteres.length; k++) {
            if (caracter == arrayCaracteres[k]) {
                contador = contador + 1;
            } else {
            }
        }
        y = contador;
        return y;
    }

    private static void ingresarNumeroBuscar() {
        int contador = 0;
        String numeroBuscado;
        String copiaNumeroBuscado;
        char[] arrayCaracteres;
        char[] arrayCaracterescopia;
        Scanner sc = new Scanner(System.in);
        if (numerosGuardados.size() == 0) {
            System.out.println("No hay numeros guardados...");
            contadorDigitosRepetidos();
        } else {
            System.out.println("Ingrese el numero que desea buscar...");
            numeroBuscado = sc.next();
            if (numeroBuscado.matches("[0-9]+")) {
                for (String s : numerosGuardados
                        ) {
                    if (s.contains(numeroBuscado)) {
                        arrayCaracteres = s.toCharArray();
                        int[] cantidadPorCaracter = new int[arrayCaracteres.length];
                        for (int i = 0; i < arrayCaracteres.length; i++) {
                            cantidadPorCaracter[i] = contadorCaracterEnString(arrayCaracteres[i], arrayCaracteres);
                        }
                        System.out.println(s + " Cantidad por caracter " + Arrays.toString(cantidadPorCaracter));
                        contadorDigitosRepetidos();
                    } else {

                    }
                }

            } else {
                System.out.println("Debe ingresar un numero!");
                ingresarNumeroBuscar();
            }
        }
    }

    private static void ingresarNumero() {
        String numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        numero = scanner.next();
        numero = numero.trim();
        if (numero.matches("[0-9]+")) {
            numerosGuardados.add(numero);
            contadorDigitosRepetidos();
        } else {
            System.out.println("Debe ingresar un numero!");
        }


    }

    private static void mostrarUsuariosDesc() {
        for (int i = vectorUsuarios.size() - 1; i >= 0; i--) {
            System.out.println(vectorUsuarios.get(i).getNombreUsuario() + "\n");
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
        Scanner sc = new Scanner(System.in);
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
        Scanner sc = new Scanner(System.in);
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
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Ingresar  numero (1)");
            System.out.println("Ingresar numero a buscar (2)");
            System.out.println("Mostrar numero digitos (3)");
            System.out.println("Menu principal (4)");
            opcion = Integer.parseInt(sc.next());
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
            contadorDigitosRepetidos();
        }

    }

    public static void tresNumerosMayorMenor() {
        Main m = new Main();
        int opcion;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Ingresar numeros (1)");
            System.out.println("Mostrar ordenados (2)");
            System.out.println("Menu principal (3)");
            opcion = Integer.parseInt(sc.next());
            switch (opcion) {
                case 1:
                    ingresarTresNumeros();
                    break;
                case 2:
                    mostrarTresOrdenados();
                    break;
                case 3:
                    m.menuPrincipal();
                    break;
            }

        } catch (Exception ex) {
            System.out.println("Debe ingresar un numero de 1-3");
            m.menuPrincipal();
        }
    }

    private static void mostrarTresOrdenados() {
        Integer[] arregloEnteros = new Integer[3];
        arregloEnteros[0] = numero1;
        arregloEnteros[1] = numero2;
        arregloEnteros[2] = numero3;
        Arrays.sort(arregloEnteros, Collections.reverseOrder());
        System.out.println("Ordenados de mayor a menor " + Arrays.toString(arregloEnteros));
        tresNumerosMayorMenor();
    }

    private static void ingresarTresNumeros() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Ingrese el primer numero");
            numero1 = Integer.parseInt(sc.next());
            System.out.println("Ingrese el segundo numero");
            numero2 = Integer.parseInt(sc.next());
            System.out.println("Ingrese el tercer numero");
            numero3 = Integer.parseInt(sc.next());
            tresNumerosMayorMenor();
        } catch (Exception ex) {
            System.out.println("Debe ingresar unicamente numeros");
            tresNumerosMayorMenor();
        }

    }

    public static void ingresoEstudiantesPromediar() {
        Scanner sc = new Scanner(System.in);
        int idEstudiante;
        int nota1;
        int nota2;
        int nota3;
        int nota4;
        int[] notasEstudiante = new int[4];
        try {
            while (vectorEstudiantes.size() < 6) {
                System.out.println("Ingrese la id del estudiante");
                idEstudiante = Integer.parseInt(sc.next());
                if (existeEstudiante(idEstudiante) == 0) {
                    System.out.println("Ingrese  su primera nota");
                    nota1 = Integer.parseInt(sc.next());
                    System.out.println("Ingrese su segunda");
                    nota2 = Integer.parseInt(sc.next());
                    System.out.println("Ingrese la tercera nota");
                    nota3 = Integer.parseInt(sc.next());
                    System.out.println("Ingrese  su cuarta nota");
                    nota4 = Integer.parseInt(sc.next());
                    notasEstudiante[0] = nota1;
                    notasEstudiante[1] = nota2;
                    notasEstudiante[2] = nota3;
                    notasEstudiante[3] = nota4;
                    vectorEstudiantes.add(new Estudiante(idEstudiante, notasEstudiante));
                    notasEstudiante = new int[4];
                    idEstudiante = 0;
                    System.out.println("Se ha agregado 1 estudiante" + "\n" + "\n");
                } else {
                    System.out.println("Ya existe ese id de estudiante");
                    ingresoEstudiantesPromediar();
                }
            }

            for (int i = 0; i < 6; i++) {
                int prom1 = 0;
                int tmp1 = vectorEstudiantes.get(i).getNotasEstudiantes()[0];
                int tmp2 = vectorEstudiantes.get(i).getNotasEstudiantes()[1];
                int tmp3 = vectorEstudiantes.get(i).getNotasEstudiantes()[2];
                int tmp4 = vectorEstudiantes.get(i).getNotasEstudiantes()[3];
                prom1 = ((tmp1 + tmp2 + tmp3 + tmp4) / 4);
                System.out.println(vectorEstudiantes.get(i).getIdEstudiante() + Arrays.toString(vectorEstudiantes.get(i).getNotasEstudiantes()) + prom1);
                tmp1 = 0;
                tmp2 = 0;
                tmp3 = 0;
                tmp4 = 0;
                prom1 = 0;
            }
            System.out.println("\n");
            menuPrincipal();
        } catch (Exception ex) {
            ingresoEstudiantesPromediar();
        }
    }

    public static int existeEstudiante(int idEstudiante) {
        int contador = 0;
        for (int i = 0; i < vectorEstudiantes.size(); i++) {
            if (vectorEstudiantes.get(i).getIdEstudiante() == idEstudiante) {
                contador++;
            } else {
            }
        }
        return contador;
    }
}