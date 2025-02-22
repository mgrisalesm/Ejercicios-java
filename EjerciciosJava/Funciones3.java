/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejerciciosjava;
import java.util.Scanner

/**
 *
 * @author Est01
/*Crear una función llamada "letraRepetida", que reciba como parámetros una letra y un número,
y escriba en pantalla esa letra repetida en pantalla
varias veces (tantas como indique el número), sin devolver ningún valor. */

public class Funciones3 {
    
    public static void letraRepetida(){
        //System.out.println("Ingrese una letra");
        Scanner scanner = new Scanner(System.in);
        char a;
        //scanner.nextLine();
        System.out.println("Ingrese un numero");
        int numero= scanner.nextInt();
        int i= 1;
        
        do{ 
        System.out.println(a);
        i++;
            
        }while(i<=numero);
            
        
    }
    
    public static void main(String[] args) {
    letraRepetida();
    }
    
    
}
