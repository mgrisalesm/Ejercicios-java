import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la inicial del dia:");
        char c  = scanner.next().charAt(0);
        //scanner.nextline();
        
       if (c == 'l' || c == 'L') {
            System.out.println("El dia es lunes");
        } else if (c == 'm' || c == 'M') {
            System.out.println("El dia es martes");
        } else if (c == 'x' || c == 'X') {
            System.out.println("El dia es miercoles");
        } else if (c == 'j' || c == 'J') {
            System.out.println("El dia es jueves");
        } else if (c == 'v' || c == 'V') {
            System.out.println("El dia es viernes");
        } else if (c == 's' || c == 'S') {
            System.out.println("El dia es sabado");
        } else if (c == 'd' || c == 'D') {
            System.out.println("El dia es domingo");
        } else {
            System.out.println("La letra ingresada no corresponde a un dia de la semana");
        
       }

        scanner.close();

    }

}
