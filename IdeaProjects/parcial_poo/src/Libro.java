public class Libro extends Material {
    private int numeroPaginas;
    private String genero;
    private Autor autor;

    public Libro() {

    }

    public Libro(String codigo, String titulo, int anioPublicacion, boolean disponible, int numeroPaginas, String genero, Autor autor) {
        super(codigo, titulo, anioPublicacion, disponible);
        this.numeroPaginas = numeroPaginas;
        this.genero = genero;
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    @Override
    public String mostrar(){
        return "Numero de pagina: "+ numeroPaginas+
                "Genero: "+ genero+
                "Autor: "+ autor.getNombre();
    }
}
