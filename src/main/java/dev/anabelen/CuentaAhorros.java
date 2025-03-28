package dev.anabelen;

public class CuentaAhorros extends Cuenta {
    boolean activa;

    public CuentaAhorros(float saldoInicial, float tasaAnual) {
        super(saldoInicial, tasaAnual);
        this.activa = (saldoInicial >= 10000f);
    }

    public boolean isActiva() {
        return activa;
    }

    @Override
    public void consignar(float cantidad) {
      if(activa) {
        super.consignar(cantidad);
        activa = (getSaldo() >= 10000f);
      }

    }

    @Override
public void extractoMensual() {
    // Calcular retiros extra (más allá de los primeros 4)
    int retirosExtra = Math.max(0, getNumeroRetiros() - 4);
    float comisionExtra = retirosExtra * 1000f; // Comisión extra por cada retiro adicional
    System.out.println("Retiros extra: " + retirosExtra);
    System.out.println("Comisión extra: " + comisionExtra);

    // Agregar la comisión extra a la comisión mensual
    comisionMensual += comisionExtra;
    System.out.println("Comisión total: " + comisionMensual);

    // Restar la comisión total del saldo
    saldo -= comisionMensual;
    System.out.println("Saldo después de comisiones: " + saldo);

    // Calcular el interés mensual sobre el saldo restante
    calcularInteresMensual();
    System.out.println("Saldo después del interés mensual: " + saldo);

    // Reiniciar los contadores de retiros y consignaciones
    this.numConsig = 0;
    this.numRetiros = 0;

    // Reevaluar si la cuenta sigue activa
    activa = (saldo >= 10000f);
    System.out.println("Estado de la cuenta (activa): " + activa);
}

}

