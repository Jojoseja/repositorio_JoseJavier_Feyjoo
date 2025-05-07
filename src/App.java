import modelo.Animal;
import modelo.Gato;
import modelo.Perro;

public class App {
    public static void main(String[] args) {
        Animal a = new Animal("Alberto");
        Perro b = new Perro("Berto");
        Gato c = new Gato("Carlos");
        System.out.println(a.sonido());
        System.out.println(b.sonido());
        System.out.println(c.sonido());
        System.out.println("Ejercicio");
    }
}
