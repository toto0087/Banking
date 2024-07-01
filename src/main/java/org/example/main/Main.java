package org.example.main;

import org.example.model.cuenta.Cuenta;
import org.example.model.tarjeta.Tarjeta;
import org.example.model.tarjeta.TarjetaCredito;
import org.example.model.tarjeta.TarjetaDebito;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        LocalDate fechaCreacion = LocalDate.of(2024, 3, 24);
        LocalDate fechaCreacion2 = LocalDate.of(2024, 2, 24);

        TarjetaCredito tarjetaCredito = new TarjetaCredito("1234", "Santi Lofiego", 1000, 1,fechaCreacion);
        TarjetaDebito tarjetaDebito = new TarjetaDebito("5678", "Martin Jams", 1000, 2,fechaCreacion2);
        Cuenta cuenta = new Cuenta("Juan Melo", 1000, null, 3);

        System.out.println(tarjetaDebito.getFechaAlta());
        System.out.println(tarjetaCredito.getFechaAlta());
        System.out.println(cuenta.getId());
    }
}