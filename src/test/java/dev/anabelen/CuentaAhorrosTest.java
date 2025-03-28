package dev.anabelen;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CuentaAhorrosTest {
    @Test
    public void testCuentaAhorrosInicialmenteActiva() {
        CuentaAhorros cuenta = new CuentaAhorros(1200f,5f);
        assertTrue(cuenta.isActiva());
    }

}
