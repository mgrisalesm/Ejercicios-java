//Leer 10 números y obtener su cubo y su cuarta.//
import java.util.Scanner;
public class Ej4 {
    public static void main(String[] args) {
        int i=1;

        while(i<=10){
            Scanner scanner = new Scanner(System.in);
            System.out.println("ingrese el número " + i);
            int numero = scanner.nextInt();
            double cubo = Math.pow(numero, 3);
            double cuarta = Math.pow(numero, 4);
            System.out.println("El cubo de " + numero + " es: " + cubo);
            System.out.println("La cuarta de " + numero + " es: " + cuarta);        
            i++;
        }

    }   
    
}
