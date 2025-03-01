import java.util.Scanner;

public class Ej3 {
    public  void  letraRepetida() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la letra: ");
        char c = sc.next().charAt(0);
        sc.nextLine();
        System.out.println("Introduce el número: ");
        int num = sc.nextInt();
        int i = 1;

        while (i<=num) {
            System.out.println(c);
            i++;
            }

        sc.close();
        
    }
    public static void main(String[] args) {
        Ej3 ej3 = new Ej3();
        ej3.letraRepetida();
    }
}