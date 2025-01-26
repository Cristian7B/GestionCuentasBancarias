package Model;

public class CuentaAhorro extends CuentaBancaria{
    private double interesMensual;
    public CuentaAhorro(String numeroCuenta, String nombreTitular, double saldoCuenta, double interesMensual) {
        super(numeroCuenta, nombreTitular, saldoCuenta);
        this.interesMensual = interesMensual;
    }

    public double getInteresMensual() {
        return interesMensual;
    }

    public void setInteresMensual(double interesMensual) {
        this.interesMensual = interesMensual;
    }

    public String toString() {
        return super.getNumeroCuenta() + " " + super.getNombreTitular() + " " + super.getSaldoCuenta() + " " + interesMensual;
    }
}
