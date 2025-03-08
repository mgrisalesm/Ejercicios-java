import java.util.Scanner;

import javax.swing.plaf.BorderUIResource.LineBorderUIResource;

import java.util.ArrayList;

/**
 * Esta sera la clase del main, donde se gesttionaran los objetos de las demás clases
 * @author Mateo Grisales
 */

public class Gestionbiblioteca {

    private Biblioteca biblioteca;
    

    public Gestionbiblioteca() {
        this.biblioteca = new Biblioteca(new ArrayList<Libro>());
    }


    
     // Métodos para gestión de biblioteca
    public void agregarLibro(Libro libro){
        biblioteca.agregarLibro(libro);
    }
    
    public void eliminarLibro(Libro libro){
        biblioteca.eliminarLibro(libro);
    }
    
    public ArrayList<Libro> getLibros() {
        return biblioteca.getLibros();
    }
    
    public void encontrarLibro(Libro libro){
        biblioteca.encontrarLibro(libro);
    }

    public void mostrarMenu(){
        System.out.println("1. Agregar libro al sistema");
        System.out.println("2. Eliminar libro del sistema");
        System.out.println("3. Buscar Libro");
        System.out.println("4. Ver libros disponibles");
        System.out.println("5. Salir");
    }


    //Ahora creamos el metodo main para hacer funcionar el programa
    //Crearemos el Objeto opcion para llamar a los metodos y atriburos de las demas clases
    public static void main(String[] args) {
        Gestionbiblioteca opcion = new Gestionbiblioteca();
        Scanner scanner = new Scanner(System.in);
        int select;

        do{
            System.out.println("Hola. Bienvenido al Sistema de Gestion de bibliotecas. Por favor selecciones una de las opciones");
            opcion.mostrarMenu();
            select=scanner.nextInt();

            switch (select) {
                case 1:
                    System.out.println("Ingrese los datos del libro por favor");
                    System.out.println("Ingrese el titulo del libro por favor");
                    String titulo1= scanner.next();
                    scanner.nextLine();
                    System.out.println("Ingrese el nombre del autor del libro por favor");
                    String autor1= scanner.next();
                    scanner.nextLine();
                    System.out.println("Ingrese el ISBN del libro por favor");
                    String isbn1= scanner.next();
                    scanner.nextLine();

                    Libro libro1= new Libro(titulo1, autor1, isbn1);
                    opcion.agregarLibro(libro1);

                    System.out.println("se ha agregado el libro con titulo "  +  titulo1 + " del autor " +  autor1 +  " con ISBN "  + isbn1);

                    break;

                case 2:

                    System.out.println("Ingrese los datos del libro que desea eliminar favor");
                    System.out.println("Ingrese el titulo del libro por favor");
                    String titulo2= scanner.next();
                    scanner.nextLine();
                    System.out.println("Ingrese el nombre del autor del libro por favor");
                    String autor2= scanner.next();
                    scanner.nextLine();
                    System.out.println("Ingrese el ISBN del libro por favor");
                    String isbn2= scanner.next();
                    scanner.nextLine();

                    Libro libro2= new Libro(titulo2, autor2, isbn2);
                    opcion.eliminarLibro(libro2);

                    System.out.println("se ha eliminado el libro con titulo "  +  titulo2 + " del autor " +  autor2 +  " con ISBN "  + isbn2);
                 break;

                case 3:

                    System.out.println("Ingrese los datos del libro que desea buscar favor");
                    System.out.println("Ingrese el titulo del libro por favor");
                    String titulo3= scanner.next();
                    scanner.nextLine();
                    System.out.println("Ingrese el nombre del autor del libro por favor");
                    String autor3= scanner.next();
                    scanner.nextLine();
                    System.out.println("Ingrese el ISBN del libro por favor");
                    String isbn3= scanner.next();
                    scanner.nextLine();

                    Libro libro3= new Libro(titulo3, autor3, isbn3);
                    opcion.encontrarLibro(libro3);
                
                break;

                case 4:
                    System.out.println("Los libros disponibles en la biblioteca son: ");
                    System.out.println(opcion.getLibros());
                break;

                case 5:
                    System.out.println("Gracias por usar el sistema de gestion de bibliotecas");

                 default:
                 break;
            
               
                 } 
            
            } while (select != 5); 
            scanner.close();


        }
    
    
    }
