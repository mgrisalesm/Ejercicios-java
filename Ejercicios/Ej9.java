import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el dia:");
        int numero1 = scanner.nextInt();
        //scanner.nextline();
        System.out.println("Ingrese el mes:");
        int numero2 = scanner.nextInt();
        //scanner.nextline();
        System.out.println("Ingrese el ano:");
        int numero3 = scanner.nextInt();
        //scanner.nextline();

        if (numero3 % 4 == 0 && numero3 % 100 != 0) {
            System.out.println("el ano es bisiesto");
        } else if (numero3 % 400 == 0) {
            System.out.println("el ano es bisiesto");
            
        }else if (numero1 == 31 && numero2 == 12) {
            System.out.println("la fecha del siguiente dia es: 1/1/" + (numero3 + 1));
            
        }else if (numero1 == 31 && (numero2 == 1 || numero2 == 3 || numero2 == 5 || numero2 == 7 || numero2 == 8 || numero2 == 10)) {
            System.out.println("la fecha del siguiente dia es: 1/" + (numero2 + 1) + "/" + numero3);
            
        }else if (numero1 == 30 && (numero2 == 4 || numero2 == 6 || numero2 == 9 || numero2 == 11)) {
            System.out.println("la fecha del siguiente dia es: 1/" + (numero2 + 1) + "/" + numero3);
        }else if (numero1 == 28 && numero2 == 2) {
            System.out.println("la fecha del siguiente dia es: 1/3/" + numero3);
        }else if (numero1 == 29 && numero2 == 2) {
            System.out.println("la fecha del siguiente dia es: 1/3/" + numero3);
        }else if (numero1 >=31 || numero1 <=0 || numero2 >= 12 || numero2 <= 0) {
            System.out.println("la fecha ingresada es incorrecta");
        }
        else {
            System.out.println("la fecha del siguiente dia es: " + (numero1 + 1) + "/" + numero2 + "/" + numero3);
        }
        scanner.close();

    }
}
