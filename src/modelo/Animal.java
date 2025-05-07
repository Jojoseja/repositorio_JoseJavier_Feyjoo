package modelo;

/**
 * @author Jose
 * @version 1.1
 */
public class Animal {
    protected String nombre;

    /**
     * @param nombre
     */
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Nombre del Animal
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    /**
     * @return
     */
    public String sonido(){
        return "";

    }
}
