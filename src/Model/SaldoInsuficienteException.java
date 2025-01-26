package Model;

public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensajeError) {
        super(mensajeError);
    }
}
