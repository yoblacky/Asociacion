public class Autor {
    String nombre;
    Libro[] libros;
    int numLibros;

    Autor(String nombre) {
        this.nombre = nombre;
        this.libros = new Libro[10];
        this.numLibros = 0;
    }

    void agregarLibro(Libro libro) {  // Método para agregar un libro al autor. Recibe un objeto Libro como parámetro.
        if (numLibros < 10) {   // Verifica si el autor tiene espacio para más libros (límite de 10).
            libros[numLibros] = libro;  // Agrega el libro al arreglo de libros en la posición 'numLibros'.
            numLibros++;   // Incrementa 'numLibros' para reflejar que el autor tiene un libro más.
        } else {
            System.out.println("No se pueden agregar más libros a este autor.");
            // Si el autor ya tiene 10 libros, muestra un mensaje de error.
        }
    }
}
