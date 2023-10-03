public class Libro {
    private String titulo;
    Autor[] autores;
    private int numAutores;

    Libro(String titulo) {
        this.titulo = titulo;
        this.autores = new Autor[3];
        this.numAutores = 0;
    }
    void agregarAutor(Autor autor) {
        if (numAutores < 3) {
            autores[numAutores] = autor;
            numAutores++;
        } else {
            System.out.println("No se pueden agregar más autores a este libro.");
        }
    }
}
