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
    int retirosExtra = Math.max(0, getNumeroRetiros() - 4);
    float comisionExtra = retirosExtra * 1000f;
    System.out.println("Retiros extra: " + retirosExtra);
    System.out.println("Comisión extra: " + comisionExtra);
    comisionMensual += comisionExtra;
    System.out.println("Comisión total: " + comisionMensual);
    saldo -= comisionMensual;
    System.out.println("Saldo después de comisiones: " + saldo);
    calcularInteresMensual();
    System.out.println("Saldo después del interés mensual: " + saldo);
    this.numConsig = 0;
    this.numRetiros = 0;
    activa = (saldo >= 10000f);
    System.out.println("Estado de la cuenta (activa): " + activa);
}

    @Override
    public void retirar(float cantidad) {
        if(activa) {
            super.retirar(cantidad);
            activa = (getSaldo() >= 10000f);
        }
    }

}

