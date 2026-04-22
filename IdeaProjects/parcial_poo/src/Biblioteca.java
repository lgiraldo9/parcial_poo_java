import java.util.ArrayList;
public class Biblioteca {
    private String nombre;
    private ArrayList<Material> material;
    private ArrayList<Socio> socios;

    public Biblioteca(String bibliotecaUnisalamanca){
        material = new ArrayList<>();
        socios = new ArrayList<>();
    }

    public Biblioteca(String nombre, ArrayList<Material> material, ArrayList<Socio> socios) {
        this.nombre = nombre;
        this.material = material;
        this.socios = socios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Material> getMaterial() {
        return material;
    }

    public void setMaterial(ArrayList<Material> material) {
        this.material = material;
    }

    public ArrayList<Socio> getSocios() {
        return socios;
    }

    public void setSocios(ArrayList<Socio> socios) {
        this.socios = socios;
    }
    public void agregarMaterial(Material m){
        if(m == null){
             throw new IllegalArgumentException("El material no puede ser nulo.");
        }
        material.add(m);
    }
    public void agregarSocio(Socio s){
        if(s == null){
            throw new IllegalArgumentException("El socio no puede ser nulo.");
        }
        socios.add(s);
    }
    public void mostrarCatalogo(){
        System.out.println("Catalogo");
        for(Material m : material){
            System.out.println(m.mostrar());
        }
    }
    public void mostrarSocio(){
        System.out.println("Socios de la Biblioteca");
        for(Socio s : socios){
            System.out.println(s.mostrar());
        }
    }
}
