public class Revista extends Material {
    private int numeroEdicion;
    private String periodicidad;
    private String issn;

    public Revista(){

    }
    public Revista(String codigo, String titulo, int anioPublicacion, boolean disponible, int numeroEdicion, String periodicidad, String issn) {
        super(codigo, titulo, anioPublicacion, disponible);
        this.numeroEdicion = numeroEdicion;
        this.periodicidad = periodicidad;
        this.issn = issn;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }
    @Override
    public String mostrar(){
        return "Numero de Edicion: "+ numeroEdicion+
                "Periocidad: "+ periodicidad+
                "Issn: "+ issn;
    }
}
