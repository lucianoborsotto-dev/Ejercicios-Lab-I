
import java.util.HashSet;
import javax.swing.JTextField;

public class Alumno {

    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materias;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materias = new HashSet<>();
    }

    Alumno(int legajoInt, JTextField jTFApellido, JTextField jTFNombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(HashSet<Materia> materias) {
        this.materias = materias;
    }

    public void agregarMateria(Materia materia) {

        if (materias.contains(materia)) {
            System.out.println(nombre + " " + apellido + " ya esta inscripto en " + materia.getNombre());
        } else {
            materias.add(materia);
            System.out.println(nombre + " " + apellido + " fue inscripto a: " + materia.getNombre());
        }
    }
public void cantidadMaterias(){
    System.out.println(nombre + " esta inscripto/a en "+ materias.size()+ " materias");
}
}
