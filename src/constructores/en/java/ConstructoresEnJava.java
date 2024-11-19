package constructores.en.java;
import java.util.Scanner;

public class ConstructoresEnJava {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        Estudiante estud = new Estudiante();
        
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = teclado.nextLine();
        estud.setNombre(nombre);
        
        System.out.print("Ingrese la edad del estudiante: ");
        int edad = teclado.nextInt();
        estud.setEdad(edad);
        
        System.out.print("Ingrese el curso del estudiante: ");
        teclado.nextLine();
        String curso = teclado.nextLine();
        estud.setCurso(curso);
        
        
        Libro libro1 = new Libro("Goethe", "Werther", 192);
        System.out.println(libro1);
        
        CuentaBancaria cuenta = new CuentaBancaria("Ahorros",12341,2000000);
        System.out.println(cuenta);
        
        System.out.println(estud);
    }
    
}
