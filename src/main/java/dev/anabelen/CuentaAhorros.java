package dev.anabelen;

public class CuentaAhorros extends Cuenta {
    private boolean activa;

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
}
