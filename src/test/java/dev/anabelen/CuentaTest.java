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

    @Test
    public void testCalcularInteresMensual() {
        Cuenta cuenta = new Cuenta(1200f, 12F);
        cuenta.calcularInteresMensual();
        assertEquals(1212f, cuenta.getSaldo(), 0.01f);
    }

    @Test
    public void testExtractoMensual() {
        Cuenta cuenta = new Cuenta(2000f, 12F);
        cuenta.comisionMensual = 50f;
        cuenta.extractoMensual();
        assertEquals(1969.5f, cuenta.getSaldo(), 0.01f);
    }

    @Test
    public void testImprimir() {
        Cuenta cuenta = new Cuenta(2000f, 12f);
        String estado = cuenta.imprimir();
        assertTrue(estado.contains("Saldo"));
        assertTrue(estado.contains("Número de consignaciones"));
        assertTrue(estado.contains("Número de retiros"));
        assertTrue(estado.contains("Tasa anual"));
        assertTrue(estado.contains("Comisión por manejo de cuenta"));
    }


}
