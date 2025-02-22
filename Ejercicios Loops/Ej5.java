//Leer 10 números e imprimir solamente los números positivos.//
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        int i=1;

        while(i<=10){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero" + i);
        int numero = scanner.nextInt();
            if (numero >= 0){
            System.out.println("El numero ingresado es:" + numero);
            }else{
            System.out.println("El numero ingresado es negativo");
            }
        i++;
        }   
    }
}