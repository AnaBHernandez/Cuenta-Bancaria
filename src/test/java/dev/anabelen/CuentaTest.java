package dev.anabelen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CuentaTest {
    @Test
    public void testConsignar() {
        Cuenta cuenta = new Cuenta(1000f,5f);
        cuenta.consignar(500f);
        assertEquals(1500f, cuenta.getSaldo(), 0.01f);
    }

    @Test
    public void testRetirar() {
        Cuenta cuenta = new Cuenta(1000f,5f);
        cuenta.retirar(500f);
        assertEquals(500f, cuenta.getSaldo(), 0.01f);
        assertEquals(1, cuenta.getNumeroRetiros());
    }

}
