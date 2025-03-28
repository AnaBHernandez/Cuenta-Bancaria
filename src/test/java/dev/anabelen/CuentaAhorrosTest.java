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

    @Test
    public void testConsignarInactiva() {
        CuentaAhorros cuenta = new CuentaAhorros(9000, 5f);
        cuenta.consignar(1000f);
        assertEquals(9000f, cuenta.getSaldo(), 0.01f);
        assertFalse(cuenta.isActiva(), "La cuenta está inactiva después de consignar");

}

@Test
public void testExtractoMensualSimplificado() {
    CuentaAhorros cuenta = new CuentaAhorros(10000f, 6f);
    for (int i = 0; i < 4; i++) {
        cuenta.retirar(1000f);
    }
    cuenta.extractoMensual();
    assertEquals(6030f, cuenta.getSaldo(), 0.01f, "El saldo debe reflejar el interés mensual sin comisión extra");
}
@Test
public void testRetirarInactiva() {
    CuentaAhorros cuenta = new CuentaAhorros(9000f, 5f);
    cuenta.retirar(1000f);
    assertEquals(9000f, cuenta.getSaldo(), 0.01f);
    assertFalse(cuenta.isActiva(), "La cuenta sigue inactiva después de retirar");

}
@Test
public void testImprimir() {
    CuentaAhorros cuenta = new CuentaAhorros(12000f, 5f);
    String estado = cuenta.imprimir();
    assertTrue(estado.contains("Saldo:"), "El mensaje debe incluir el saldo");
    assertTrue(estado.contains("Comisión:"), "El mensaje debe incluir la comisión");
    assertTrue(estado.contains("Transacciones totales:"), "El mensaje debe incluir las transacciones totales");
}
}


