import java.util.Scanner;

//Realizar en JAVA un programa que simule un cajero automático y que pueda realizar las siguientes operaciones: retiro, deposito y consultar saldo. El saldo inicial de la cuenta será de 1000.00 soles. El programa debe tener un menú de opciones que permita al usuario elegir la operación a realizar. El programa debe tener una opción para salir del programa. El programa debe validar que el usuario no pueda retirar más de lo que tiene en la cuenta. El programa debe validar que el usuario no pueda depositar un monto negativo. El programa debe mostrar el saldo actualizado después de cada operación. El programa debe mostrar un mensaje de error si el usuario ingresa una opción inválida. El programa debe mostrar un mensaje de error si el usuario ingresa un monto negativo en la opción de retiro. El programa debe mostrar un mensaje de error si el usuario ingresa un monto negativo en la opción de depósito. 

//El programa debe tener una clase Cajero con los siguientes métodos:
//public void retirar(double monto)
//public void depositar(double monto)
//public void consultarSaldo()
//public void mostrarMenu()
//public void mostrarError(String mensaje)
//public void mostrarSaldo(double saldo)

//El programa debe tener una clase Main con el método main que permita ejecutar el programa.


public class Cajero {

    double saldo=1000.00;

    public void depositarMonto(double monto){
        
        if (monto<=0) {
            System.out.println("El monto ingresado no es valido");
         
        }else{
            saldo= saldo+monto;
            System.out.println("El deposito ha sido exitoso");
            System.out.println("su saldo es de:" +  saldo);
        }
    }

    public void retirarSuma(double monto){
        
        if (monto<=0) {
            System.out.println("El monto ingresado no es valido");
        
        }else if (monto>saldo) {
            System.out.println("No se puede retirar esa cantidad. Dinero insuficiente");
        } else {
            saldo=saldo-monto;
            System.out.println("Por favor retire su dinero");
            System.out.println("su saldo es de:" + saldo);
        }
    }
    public void consultarSaldo(){
        System.out.println("Su saldo es de:" + saldo);
    }

    public void finalizarPrograma(){
        System.out.print("Gracias por usar nuestro servicios. Saliendo del programa...");
    }

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        double cantidad;
        int opcion;
        Cajero cuenta= new Cajero();

        do{

            System.out.println("Buen dia, por favor elija una opcion");
            System.out.println("1. Retirar monto");
            System.out.println("2. Depositar monto");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            opcion=scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el monto que desea retirar");
                    cantidad=scanner.nextDouble();
                    cuenta.retirarSuma(cantidad);
                    break;
                case 2:
                    System.out.println("Ingrese el monto que desea depositar");
                    cantidad=scanner.nextDouble();
                    cuenta.depositarMonto(cantidad);
                    break;
                case 3:
                    cuenta.consultarSaldo();
                    break;
                case 4:
                    cuenta.finalizarPrograma();
                    break;

                default:
                    break;
            }
        } while(opcion!=4);

        scanner.close();
    }
    
}
