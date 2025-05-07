package modelo;

public class Perro extends Animal{
    public Perro(String nombre) {
        super(nombre);
    }

    /**
     * @return Sonido de Perro - "Guau"
     */
    @Override
    public String sonido() {
        return "Guau";
    }
}
