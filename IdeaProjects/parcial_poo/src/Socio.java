import java.util.ArrayList;
public class Socio {
    private String cedula;
    private String nombre;
    private double multa;
    private ArrayList<Prestamo> prestamos;

    public Socio(){
        prestamos = new ArrayList<>();
    }

    public Socio(String cedula, String nombre, double multa) {
        setCedula(cedula);
        setNombre(nombre);
        setMulta(multa);
        prestamos = new ArrayList<>();
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public void agregarPrestamo(Prestamo p){
        if(p == null){
            throw new IllegalArgumentException("El préstamo no puede ser nulo.");
        }
        prestamos.add(p);
    }
    public void mostrarPrestamo(){
        for(Prestamo p : prestamos){
            System.out.println(p.mostrar());
        }
    }
    public  String mostrar(){
        return "Cedeula: " + cedula+
                "nombre: "+ nombre+
                "multa: "+ multa;
    }
}
