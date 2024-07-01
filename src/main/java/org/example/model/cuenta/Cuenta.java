package org.example.model.cuenta;

import java.util.Date;

public class Cuenta {

    private int id;
    private String nombre;
    private double saldo;
    private Date fechaCreacion;

    public Cuenta(String nombre, double saldo, Date fechaCreacion, int id) {
        this.nombre = nombre;
        this.saldo = saldo;
        this.fechaCreacion = new Date();
        this.id = id;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public void extraer(double monto) {
        saldo -= monto;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getId() {
        return id;
    }
}
