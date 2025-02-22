// Realizar un programa que transforme todas las letras del alfabeto de mayúsculas a minúsculas.//
import java.util.Scanner;
Public class Ej1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una letra en mayúscula");
        char letra = scanner.next().charAt(0);
        int ascii = (int) letra;
        int asciiMinuscula = ascii + 32;
        char letraMinuscula = (char) asciiMinuscula;
        System.out.println("La letra en minúscula es: " + letraMinuscula);
        
    }

}