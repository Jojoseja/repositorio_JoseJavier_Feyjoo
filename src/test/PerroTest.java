package test;

import modelo.Perro;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class PerroTest {
    Perro p1 = new Perro("Perro");
    @Test
    @DisplayName("Sonido Perro")
    public void sonido(){
        assertEquals("Guau", p1.sonido());
    }

}