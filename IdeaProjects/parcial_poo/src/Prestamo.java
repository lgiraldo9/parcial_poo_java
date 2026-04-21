
public class Prestamo {
    private String fechaPrestamo;
    private int diasRetraso;
    private Material material;
    private int diasPlazo;
    private boolean devuelto;
    private Socio socio;

    public Prestamo(){

    }

    public Prestamo(String fechaPrestamo, int diasRetraso, Material material, boolean devuelto, int diasPlazo, Socio socio) {
        this.fechaPrestamo = fechaPrestamo;
        this.diasRetraso = diasRetraso;
        this.material = material;
        this.devuelto = devuelto;
        this.diasPlazo = diasPlazo;
        this.socio = socio;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public int getDiasRetraso() {
        return diasRetraso;
    }

    public void setDiasRetraso(int diasRetraso) {
        this.diasRetraso = diasRetraso;
    }

    public int getDiasPlazo() {
        return diasPlazo;
    }

    public void setDiasPlazo(int diasPlazo) {
        this.diasPlazo = diasPlazo;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public boolean isDevuelto() {
        return devuelto;
    }

    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }
    public double calcularMulta(){
        return diasRetraso + 0.80;
    }
    public void devolver(int diasRetraso){
        this.diasRetraso = diasRetraso;
        this.devuelto = true;
        this.material.setDisponible(true);
        double multa = calcularMulta();
        socio.setMulta(socio.getMulta()+ multa);
    }
    public String mostrar() {
        return "Fecha préstamo: " + fechaPrestamo +
                " | Días plazo: " + diasPlazo +
                " | Días retraso: " + diasRetraso +
                " | Devuelto: " + devuelto +
                " | Multa: $" + calcularMulta() +
                " | Material: " + material.mostrar() +
                " | Socio: " + socio.getNombre();
    }
}
