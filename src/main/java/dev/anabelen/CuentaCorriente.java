package dev.anabelen;

public class CuentaCorriente extends Cuenta {
    private float sobregiro;

    public CuentaCorriente(float saldoIncial, float tasaAnual) {
        super(saldoIncial, tasaAnual);
        this.sobregiro = 0;
    }

    @Override
    public void retirar(float cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            float sobregiroNuevo = cantidad - saldo;
            saldo = 0;
            sobregiro += sobregiroNuevo;
        }
    }

    public float getSobregiro() {
        return sobregiro;
    }

    @Override
    public void consignar(float cantidad) {
        if (sobregiro > 0) {
            if (cantidad >= sobregiro) {
                cantidad -= sobregiro;
                sobregiro = 0;
            } else {
                sobregiro -= cantidad;
                cantidad = 0;
            }
        }
        saldo += cantidad;
        }
    }
