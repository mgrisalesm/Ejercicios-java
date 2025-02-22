import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el dia:");
        int numero1 = scanner.nextInt();
        System.out.println("Introduce el mes:");
        int numero2 = scanner.nextInt();
        System.out.println("Introduce el ano:");
        int numero3 = scanner.nextInt();
        //scanner.nextline();

        if (numero2 <= 0 || numero2 >12) {
            System.out.println("la fecha ingresada es incorrecta");
        } else if (numero3 <= 0 || numero1 <= 0 || numero1 > 31) {
            System.out.println("la fecha ingresada es incorrecta"); 
        } else if (numero2 ==2 && numero1 > 29) {
            System.out.println("la fecha ingresada es incorrecta");
        } else if ((numero2 == 4 || numero2 == 6 || numero2 == 9 || numero2 == 11) && numero1 > 30) {
            System.out.println("la fecha ingresada es incorrecta");
        } else if (numero2 == 2 && numero1 == 29 && ((numero3 % 4 != 0 && numero3 % 100 == 0)|| numero3 % 400 != 0)) {
            System.out.println("la fecha ingresada es incorrecta");
        } else {
            System.out.println("la fecha del dia es: " + (numero1) + "/" + numero2 + "/" + numero3);
            
        }

        scanner.close();

    }
}
