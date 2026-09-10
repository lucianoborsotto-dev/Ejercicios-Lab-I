
public class colegio {

    
    public static void main(String[] args) {
        
        Materia web2 = new Materia(1, "Web 2", 2);
        Materia matematicas = new Materia(2, "Matematicas", 1);
        Materia laboratorio1 = new Materia(1, "Laboratorio 1", 1);
        
        Alumno alumno1 = new Alumno(1001, "Lopez", "Martin");
        Alumno alumno2 = new Alumno(1002, "Martinez", "Brenda");
        
        alumno1.agregarMateria(matematicas);
        alumno1.agregarMateria(web2);
        alumno1.agregarMateria(laboratorio1);
        
         alumno2.agregarMateria(matematicas);
        alumno2.agregarMateria(web2);
        alumno2.agregarMateria(laboratorio1);
        alumno2.agregarMateria(laboratorio1);
        
        alumno1.cantidadMaterias();
        alumno2.cantidadMaterias();
    }
    
}
