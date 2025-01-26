package Model;

public class CuentaBancaria {
    private String numeroCuenta;
    private String nombreTitular;
    private double saldoCuenta;

    public CuentaBancaria(String numeroCuenta, String nombreTitular, double saldoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.saldoCuenta = saldoCuenta;
    }

    public void depositar(double valor) {
        saldoCuenta += valor;
    }

    public void retirar(double valor) throws SaldoInsuficienteException {
        if(valor > saldoCuenta) {
            throw new SaldoInsuficienteException("No hay el dinero suficiente para poder retirar");
        }
        saldoCuenta -= valor;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public String toString() {
        return numeroCuenta + " " + nombreTitular + " " + saldoCuenta;
    }
}
