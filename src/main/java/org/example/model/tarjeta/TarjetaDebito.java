package org.example.model.tarjeta;

import java.time.LocalDate;
import java.util.Date;

public class TarjetaDebito extends Tarjeta{
    public TarjetaDebito(String numero, String titular, double saldo, int id, LocalDate fechaAlta) {
        super(numero, titular, saldo, id, fechaAlta);
    }

    @Override
    public void pagar(double monto) {
        double nuevoSaldo = getSaldo() - monto;
        setSaldo(nuevoSaldo);
    }
}
