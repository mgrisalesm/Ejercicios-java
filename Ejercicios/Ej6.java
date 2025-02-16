package Ejercicios;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un primer numero:");
        int numero1 = scanner.nextInt();
        //scanner.nextline();
        System.out.println("Introduce un segundo numero:");
        int numero2 = scanner.nextInt();
        System.out.println("Introduce un tercer numero:");
        int numero3 = scanner.nextInt();
        System.out.println("Introduce un tercer numero:");
        int numero4 = scanner.nextInt();
        
        if (numero1 > numero2 && numero1 > numero3 && numero1 > numero4) {
            System.out.println("el número mayor es:" + numero1);
        } else if (numero2 > numero1 && numero2 > numero3 && numero2 > numero4) {
            System.out.println("el número mayor es:" + numero2);
        }
        else if (numero3 > numero1 && numero3 > numero2 && numero3 > numero4) {
            System.out.println("el número mayor es:" + numero3);
        }
        else if (numero4 > numero1 && numero4 > numero2 && numero4 > numero3) {
            System.out.println("el número mayor es:" + numero4);
        }
        else{
            System.out.println("son iguales");
        }
        
        scanner.close();
    }
}
