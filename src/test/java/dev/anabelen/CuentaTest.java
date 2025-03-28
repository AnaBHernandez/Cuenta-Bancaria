package dev.anabelen;

import org.junit.jupiter.api.Test;

public class CuentaTest {
    @Test
    public void testConsignar() {
        Cuenta cuenta = new Cuenta(1000f,5f);
        cuenta.consignar(500f);
        assertEquals(1500f, cuenta.getSaldo(), 0.01);


    }

}
