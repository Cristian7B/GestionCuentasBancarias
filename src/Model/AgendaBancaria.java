package Model;

import java.util.ArrayList;

public class AgendaBancaria {
    private ArrayList<CuentaAhorro> cuentas;
    private CuentaAhorro cuentaAhorro;

    public AgendaBancaria() {
        cuentas = new ArrayList<CuentaAhorro>();
    }

    public String agregarCuenta(String numeroCuenta, String nombreTitular, double saldoCuenta, double interesMensual) {
        cuentaAhorro = new CuentaAhorro(numeroCuenta, nombreTitular, saldoCuenta, interesMensual);
        cuentas.add(cuentaAhorro);

        return "Cuenta añadida exitosamente";
    }

    public String depositarEnCuenta(String numeroCuenta, double valorADepositar) {
        if (valorADepositar > 0) {
            int posicion = buscarPosicionCuenta(numeroCuenta);
            if (posicion != -1) {
                cuentas.get(posicion).depositar(valorADepositar);
                return "Transacción exitosa";
            }
            return "No se ha encontrado la cuenta";
        } else {
            return "No puedes depositar un valor negativo";
        }
    }

    public String retirarEnCuenta(String numeroCuenta, double valorARetirar) throws SaldoInsuficienteException {
        if (valorARetirar > 0) {
            int posicion = buscarPosicionCuenta(numeroCuenta);
            if (posicion != -1) {
                cuentas.get(posicion).retirar(valorARetirar);
                return "Ha retirado " + valorARetirar + " exitosamente";
            }
            return "No se ha encontrado la cuenta";
        }
        return "No puedes retirar un valor negativo";
    }

    public String mostrarInformacion(String numeroCuenta) {
        int posicion = buscarPosicionCuenta(numeroCuenta);
        if (posicion != -1) {
            return cuentas.get(posicion).toString();
        }
        return "No se ha encontrado la cuenta";
    }

    public int buscarPosicionCuenta(String numeroCuenta) {
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getNumeroCuenta().equals(numeroCuenta)) {
                return i;
            }
        }
        return -1;
    }
}


