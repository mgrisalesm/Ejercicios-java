package Ejercicios;

import java.util.Scanner;

public class Parimpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int numero = scanner.nextInt();
        //scanner.nextline();

        if (numero % 2 == 0) {
            System.out.println("el numero es par");
        } else {
            System.out.println("el numero es impar");
        }

        scanner.close();

    }
    
}
