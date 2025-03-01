/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;
import java.util.ArrayList;


/**
 * Esta clase es para agregar, eliminar, visualizar y buscar los libros en el sistema de bibliotecas
 * @author Mateo Grisales
 */
public class Biblioteca {
    
    private  ArrayList<Libro> libros;

    //Constructor
    public Biblioteca(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    //Método para agregar libros
    
    public void agregarLibro(Libro libro){
        libros.add(libro);
    }
    
    //Método para eliminar libros
    
    public void eliminarLibro(Libro libro){
        
        libros.remove(libro);
    }
    
    public void encontrarLibro(Libro libro){
        
        int index = libros.indexOf(libro);
        if (index == -1){ 
            System.out.println(" No se ha encontrado el libro " + libro);
        }
        else{
            System.out.println("Se ha encontrado el libro " + libro +"exitosamente");
            
        }
              
    }
            

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "libros=" + libros + '}';
    }
    
    
}



