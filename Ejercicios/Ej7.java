package Ejercicios;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la temperatura:");
        double temperatura = scanner.nextInt();
        //scanner.nextline();

        if (temperatura < 0) {
            System.out.println("el estado es sólido");
        } else if (temperatura >= 0 && temperatura <= 100) {
            System.out.println("el estado es líquido");
        }else {
            System.out.println("el estado es gaseoso");
        }
    

        scanner.close();

    }
}
