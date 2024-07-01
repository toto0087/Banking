package org.example.model.tarjeta;

import java.time.LocalDate;

public class TarjetaCredito extends Tarjeta{
    public TarjetaCredito(String numero, String titular, double saldo, int id, LocalDate fechaAlta) {
        super(numero, titular, saldo, id, fechaAlta);
    }

    @Override
    public void pagar(double monto) {
        double nuevoSaldo = getSaldo() - monto;
        setSaldo(nuevoSaldo);
    }

}
