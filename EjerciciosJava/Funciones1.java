/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;
import java.util.Scanner;
/**
    //Funciones:

 * @author Est01
 */
public class Funciones1 {
    
    public static void sumaCifras(){
        
System.out.println("Ingrese el primer numero");
Scanner scanner = new Scanner(System.in);
int valor1 = scanner.nextInt();
scanner.nextLine();
System.out.println("Ingrese el segundo numero");
int valor2= scanner.nextInt();
        int resultado= valor1 + valor2;
        System.out.println("\n la suma es de:" + resultado);   
    }
    
    public static void main(String[] args) {
    sumaCifras();
    }
    
}
