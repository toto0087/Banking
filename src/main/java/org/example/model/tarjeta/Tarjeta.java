package org.example.model.tarjeta;

import java.time.LocalDate;
import java.util.Date;

public abstract class Tarjeta {

    private int id;
    private String numero;
    private String titular;
    private double saldo;
    private LocalDate fechaAlta;

    public Tarjeta(String numero, String titular, double saldo, int id, LocalDate fechaAlta) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.id = id;
        this.fechaAlta = fechaAlta;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public abstract void pagar(double monto);

}
