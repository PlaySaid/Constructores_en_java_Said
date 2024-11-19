package constructores.en.java;

public class Estudiante {
    String nombre;
    int edad;
    String curso;
    
    public Estudiante(){
        this.nombre = "Desconocido";
        this.edad = 0;
        this.curso = "Desconocido";
    }
    
    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Estudiante(String nombre, int edad, String curso){
        this(nombre,edad);
        this.curso = curso;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    @Override
    public String toString(){
        return "---Estudiante---"+"\nNombre: "+nombre+"\nEdad: "+edad+"\nCurso: "+curso;
    }
}
