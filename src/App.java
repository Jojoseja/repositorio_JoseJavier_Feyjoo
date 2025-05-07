import modelo.Animal;
import modelo.Gato;
import modelo.Perro;

public class App {
    public static void main(String[] args) {
        Animal a = new Animal("Alberto");
        Perro b = new Perro("Berto");
        Gato c = new Gato("Carlos");
        a.sonido();
        b.sonido();
        c.sonido();
    }
}
