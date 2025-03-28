package dev.anabelen;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CuentaAhorrosTest {
    @Test
    public void testCuentaAhorrosInicialmenteActiva() {
        CuentaAhorros cuenta = new CuentaAhorros(12000f, 5f);
        assertTrue(cuenta.isActiva(), "La cuenta debe estar activa cuando el saldo es >= 10,000");
    }

    @Test
    public void testConsignarActiva() {
        CuentaAhorros cuenta = new CuentaAhorros(11000f, 5f);
        cuenta.consignar(1000f);
        assertEquals(12000f, cuenta.getSaldo(), 0.01f);
        assertTrue(cuenta.isActiva(), "La cuenta sigue activa después de consignar");
    }

}
