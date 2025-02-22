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
public class Cuentadebanco {
    
    //Funciones:
   public static double consultaSaldo(){
       double saldo = 123897.4;
       return saldo;
   }
   
   public static double hacerRetiro(){
       Scanner scanner = new Scanner(System.in);
       double valor = scanner.nextDouble();
       scanner.nextLine();
       return valor;
   }
   // Método main:
    public static void main(String[] args){
        String usuario= "Mateo Grisales";
        while(true){
            System.out.println("Hola Usuario" + usuario + "\n");
            System.out.println("Qué quieres hacer el día de hoy?\n");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Hacer Retiros");
            System.out.println("3. Hacer Consignación");
            System.out.println("4. Salir");
            
            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            if (opcion ==4){
                System.out.println("Gracias por usar nuestros servicios");
                break;
            }
            
            switch(opcion){
                case 1:
                    System.out.println("Consultando Saldo");
                    consultaSaldo();
                    break;
                case 2:
                    System.out.println("Ingrese el monto que desea retirar");
                    hacerRetiro();
                    break;
                case 3:
                    System.out.println("4. Salir");
                    break;
                default:
                    break;
            }
            
                    
        }
        
    }
    
}
