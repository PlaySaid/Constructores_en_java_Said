package constructores.en.java;

public class Libro {
    String titulo;
    String autor;
    int numeroPaginas;
    
    public Libro(){
        this.titulo = "???";
        this.autor = "???";
        this.numeroPaginas = 0;
    }
    public Libro(String autor, String titulo, int numeroPaginas){
        this.autor = autor;
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        
    }
    public void mostrarDetalles(){
        System.out.println("El titulo del libro es \""+titulo+"\"");
        System.out.println("El numero de paginas que contiene el libro es "+numeroPaginas);
        System.out.println("Autor: "+autor);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    @Override
    public String toString(){
        return "---LIBRO---"+"\nTitulo: "+titulo+"\nNumero de paginas: "+numeroPaginas+"\nAutor: "+autor;
    }
}
