public class Autor {
    private String nombre;
    private String nacionalidad;
    private int anioNacimiento;

    public Autor(){

    }

    public Autor(String nombre, String nacionalidad, int anioNacimiento) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.anioNacimiento = anioNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
