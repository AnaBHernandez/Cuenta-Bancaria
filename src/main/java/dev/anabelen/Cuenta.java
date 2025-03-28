package dev.anabelen;

public class Cuenta {
    private float saldo;
    private int numConsig;
    private int numRetiros;
    private float tasaAnual;
    public float comisionMensual;

    public Cuenta(float saldoIncial, float tasaAnual) {
        this.saldo = saldoIncial;
        this.tasaAnual = tasaAnual;
        this.numConsig = 0;
        this.numRetiros = 0;
        this.comisionMensual = 0;
    }

    public void consignar(float cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            numConsig++;
        }
    }

    public float getSaldo() {
        return saldo;
    }

    public void retirar(float cantidad) {
        if (cantidad > 0 && saldo <= saldo) {
            saldo -= cantidad;
            numRetiros++;
        }
    }

    public int getNumeroRetiros() {
        return numRetiros;
    }

    public void calcularInteresMensual() {
        float interes = saldo * tasaAnual / 1200;
        saldo += interes;
    }

    public void extractoMensual () {
        saldo = saldo -= comisionMensual;
        calcularInteresMensual();
        numConsig = 0;
        numRetiros = 0;
    }
}
