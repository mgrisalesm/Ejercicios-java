

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el ano:");
        int numero = scanner.nextInt();
        //scanner.nextline();

        if (numero % 4 == 0 && numero % 100 != 0) {
            System.out.println("el ano es bisiesto");
        } else if (numero % 400 == 0) {
            System.out.println("el ano es bisiesto");
            
        }else {
            System.out.println("el ano no es bisiesto");
        }

        scanner.close();

    }
}
