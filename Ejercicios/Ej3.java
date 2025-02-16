package Ejercicios;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int numero = scanner.nextInt();

        if (numero >= 0) {
            System.out.println("ingrese un nuevo numero");
            int operador = scanner.nextInt();
            int suma = numero + operador;
            int resta = numero - operador;
            int multiplicacion =  numero * operador;

            System.out.println("suma:" + suma);
            System.out.println("resta:" + resta);
            System.out.println("multiplicación:" + multiplicacion);

        } else {
            System.out.println("el numero es negativo");
        }
        scanner.close();

    }
    
}

