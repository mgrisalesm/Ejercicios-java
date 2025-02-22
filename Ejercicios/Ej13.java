import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos:");
        int numero1 = scanner.nextInt();
        //scanner.nextline();
        
        if (numero1 < 0) {
            System.out.println("La cantidad de minutos ingresada es incorrecta");
        } else if (numero1 <= 5) {
            System.out.println("El costo de la llamada es de 10BsF");
        } else {
            System.out.println("El costo de la llamada es de " + (10 + (numero1 - 5) * 2) + "BsF");
        }

        scanner.close();

    }
}
