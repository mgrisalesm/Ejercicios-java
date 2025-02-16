package Ejercicios;

import java.util.Scanner;

public class Positivonegativo {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduce un numero:");
    int numero = scanner.nextInt();
    //scanner.nextline();

    if (numero >= 0) {
        System.out.println("el numero es positivo");
    } else {
        System.out.println("el numero es negativo");
    }
    
    scanner.close();

    }
    
}