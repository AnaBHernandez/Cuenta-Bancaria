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
        comisionMensual += comisionExtra;
        saldo -= comisionMensual;
        calcularInteresMensual();
        this.numRetiros = 0;
        activa = (saldo >= 10000f);
    }

    @Override
    public void retirar(float cantidad) {
        if(activa) {
            super.retirar(cantidad);
            activa = (getSaldo() >= 10000f);
        }
    }

    @Override
    public String imprimir() {
    return "Saldo: " + saldo + "\n" +
           "Comisión: " + comisionMensual + "\n" +
           "Transacciones totales: " + (this.numConsig + this.numRetiros);
}

}

