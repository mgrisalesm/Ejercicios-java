import java.util.Scanner;
//Programa que lee las edades de un grupo de 100 alumnos y encuentra el promedio.//

public class Ej2 {
    public static void main(String[] args) {
        int i=1;
        double j=0;    
        while(i<=100){
            Scanner scanner = new Scanner(System.in);
            System.out.println("ingrese la edad de la persona ");
            int edad = scanner.nextInt();
            j= edad + j;
            i++;
            }
        double promedio = j / (i-1);
        System.out.println("El promedio de edad es: " + promedio);

        //scanner.close(); 
    }
}