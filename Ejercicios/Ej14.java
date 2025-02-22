import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el costo");
        int costo = scanner.nextInt();
        //scanner.nextline();
        
        if (costo < 0) {
            System.out.println("El costo no puede ser negativo");
        } else if (costo < 3) {
            double ganancia = costo * 0.15;
            double precio = costo + ganancia;
            System.out.println("El precio del producto es de:" + precio +  "BsF");
        } else if (costo >= 3 && costo <= 6) {
            double ganancia = 0.5;
            double precio = costo + ganancia;
            System.out.println("El precio del producto es de:" + precio +  "BsF");
        } else {
            double ganancia = costo * 0.5;
            double precio = costo + ganancia;
            System.out.println("El precio del producto es de:" + precio +  "BsF");
        }

        scanner.close();

    }
}
