//Leer 20 números e imprimir cuantos son positivos, cuantos negativos y cuantos neutros.//
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
    int i=1;
    int positivos=0;    
    int negativos=0;
    int neutros=0;
    while(i<=20){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero" + i);
        int numero = scanner.nextInt();
            if (numero > 0){
            System.out.println("El numero ingresado es positivo");
            positivos++;
            }else if(numero < 0){
            System.out.println("El numero ingresado es negativo");
            negativos++;
            }else{
            System.out.println("El numero ingresado es neutro");
            neutros++;
            }
        i++;
    }
    System.out.println("La cantidad de numeros positivos es de: " + positivos);
    System.out.println("La cantidad de numeros negativos es de: " + negativos);
    System.out.println("La cantidad de numeros neutros es de: " + neutros);
    }
}
