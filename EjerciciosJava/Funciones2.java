/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;
import java.util.Scanner;
/**
 *
 * @author Est01
 */
public class Funciones2 {
    public static void divCifras(){
        
        System.out.println("Ingrese el primer numero");
        Scanner scanner = new Scanner(System.in);
        double valor1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el segundo numero");
        double valor2= scanner.nextInt();
        double resultado= valor1 / valor2;
        System.out.println("\n la division es de:" + resultado);   
    }
    
    public static void main(String[] args) {
    divCifras();
    }
}
