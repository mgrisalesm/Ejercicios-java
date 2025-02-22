import java.util.Scanner;

public class Ej10 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el mes:");
        int numero = scanner.nextInt();
        //scanner.nextline();

        if (numero <= 0 || numero >12) {
            System.out.println("el mes ingresado es incorrecto");
        } else if (numero ==1) {
            System.out.println("el mes ingresado es enero");
        } else if (numero ==2) {
            System.out.println("el mes ingresado es febrero");
        } else if (numero ==3) {
            System.out.println("el mes ingresado es marzo");
        } else if (numero ==4) {
            System.out.println("el mes ingresado es abril");
        } else if (numero ==5) {
            System.out.println("el mes ingresado es mayo");
        } else if (numero ==6) {
            System.out.println("el mes ingresado es junio");
        } else if (numero ==7) {
            System.out.println("el mes ingresado es julio");
        } else if (numero ==8) {
            System.out.println("el mes ingresado es agosto");
        } else if (numero ==9) {
            System.out.println("el mes ingresado es septiembre");
        } else if (numero ==10) {
            System.out.println("el mes ingresado es octubre");
        } else if (numero ==11) {
            System.out.println("el mes ingresado es noviembre");
        } else if (numero ==12) {
            System.out.println("el mes ingresado es diciembre");
        }

        scanner.close();

    }
}
