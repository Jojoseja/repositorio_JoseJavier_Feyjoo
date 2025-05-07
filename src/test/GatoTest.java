package test;

import modelo.Gato;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class GatoTest {
    Gato g1 = new Gato("Gato");

    @Test
    @DisplayName("Sonido Gato")
    public void sonido(){
        assertEquals("Miau", g1.sonido());
    }




}