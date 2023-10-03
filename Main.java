public class Main {
    public static void main(String[] args) {

        Autor autor1 = new Autor("César Vallejo");
        Autor autor2 = new Autor("José María Arguedas");

        Libro libro1 = new Libro("Paco Yunque");
        Libro libro2 = new Libro("Mitos, leyendas y cuentos peruanos");

        autor1.agregarLibro(libro1);
        autor2.agregarLibro(libro2);

        libro1.agregarAutor(autor1);
        libro2.agregarAutor(autor2);
    }
}