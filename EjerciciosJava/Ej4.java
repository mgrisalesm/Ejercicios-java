//*Crear una función llamada "rotulo", que tome como parámetro una cadena de texto, no devuelva ningún valor, y escriba en pantalla ese texto centrado (suponiendo una anchura de pantalla de 80 letras) y en la línea siguiente escriba guiones para que el rótulo parezca subrayado (tantos guiones como letras formen la palabra).//
//*En el programa principal, se solicitará al usuario que introduzca una palabra y se llamará a la función "rotulo" pasándole la palabra introducida
//*Ejemplo de ejecución:
//*Introduce la palabra: Hola
//*                                Hola
//*                                ---- 
//*Nota: La función "rotulo" debe funcionar con palabras de cualquier longitud.
//

import java.util.Scanner;

public class Ej4 {
    public static void  rotulo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la palabra: ");
        String c = sc.next();
        //sc.nextLine();
        int i = 1;
        int longitud = c.length();  //longitud de la palabra
        int espacios = (80 - longitud) / 2; //espacios a la izquierda       
        int guiones = espacios + longitud; //guiones a la derecha
        int j = 1;
        while (j<=espacios) {
            System.out.print(" ");
            j++;
        }
        System.out.println(c); 

        while (j<=guiones) {
                while (i<=espacios) {
                    System.out.print(" ");
                    i++;
                }         
        System.out.print("-");
        j++;
        }
        sc.close();
        }
        
        
    public static void main(String[] args) {
        rotulo();
    }
}
