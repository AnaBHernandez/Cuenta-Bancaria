package dev.anabelen;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CuentaAhorrosTest {
    @Test
    public void testCuentaAhorrosInicialmenteActiva() {
        CuentaAhorros cuenta = new CuentaAhorros(12000f, 5f);
        assertTrue(cuenta.isActiva(), "La cuenta debe estar activa cuando el saldo es >= 10,000");
    }

}
