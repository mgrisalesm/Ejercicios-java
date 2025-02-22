import java.util.Scanner;
//Calcular el promedio de un alumno que tiene 7 calificaciones en la materia de Cálculo.//
public class Ej3 {
    public static void main(String[] args) {
        int i=1;
        double j=0;    
        while(i<=7){
            Scanner scanner = new Scanner(System.in);
            System.out.println("ingrese la calificación" + i +" del alumno ");
            double calificacion = scanner.nextDouble();
            j= calificacion + j;
            i++;
            }
        double promedio = j / (i-1);
        System.out.println("La calificacion promedio es de: " + promedio);

        //scanner.close(); 
    }
}
