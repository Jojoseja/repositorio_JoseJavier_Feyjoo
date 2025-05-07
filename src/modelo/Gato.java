package modelo;

public class Gato extends Animal {

    public Gato(String nombre) {
        super(nombre);
    }

    /**
     * @return Sonido de Gato - "Miau"
     */
    @Override
    public String sonido() {
        return "Miau";
    }
}
