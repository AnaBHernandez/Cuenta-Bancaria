package dev.anabelen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CuentaCorrienteTest {
    @Test
    public void testRetirarConSobregiro() {
        CuentaCorriente cuenta = new CuentaCorriente(1000f, 5f);
        cuenta.retirar(1500f);
        assertEquals(0f, cuenta.getSaldo(), 0.01f, "El saldo debe ser 0 después de un retiro con sobregiro");
        assertEquals(500f, cuenta.getSobregiro(), 0.01f, "El sobregiro debe reflejar la cantidad retirada por encima del saldo");

    }
    @Test
    public void testConsignarParaReducirSobregiro() {
        CuentaCorriente cuenta = new CuentaCorriente(1000f, 5f);
        cuenta.retirar(1500f);
        cuenta.consignar(300f);
        assertEquals(200f, cuenta.getSobregiro(), 0.01f, "El sobregiro debe reducirse con la consignación");
        assertEquals(0f, cuenta.getSaldo(), 0.01f, "El saldo debe ser 0 si aún hay sobregiro");

        cuenta.consignar(300f);
        assertEquals(0f, cuenta.getSobregiro(), 0.01f, "El sobregiro debe ser 0 después de cubrirlo completamente");
        assertEquals(100f, cuenta.getSaldo(), 0.01f, "El saldo debe reflejar el excedente después de cubrir el sobregiro");
    }

}
