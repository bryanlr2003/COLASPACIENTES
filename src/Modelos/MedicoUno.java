
package Modelos;

public class MedicoUno {
    String apellidos;
    String nombre;

    public MedicoUno(String apellidos, String nombre) {
        this.apellidos = apellidos;
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
