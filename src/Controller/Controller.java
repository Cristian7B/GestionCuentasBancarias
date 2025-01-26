package Controller;

import Model.AgendaBancaria;
import Model.SaldoInsuficienteException;
import View.VentanaPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Controller implements ActionListener {
    private VentanaPrincipal ventanaPrincipal;
    private AgendaBancaria agendaBancaria;

    public Controller() {
        ventanaPrincipal = new VentanaPrincipal();
        agendaBancaria = new AgendaBancaria();
        asignarOyentes();
    }

    public void asignarOyentes() {
        ventanaPrincipal.getPanelInicio().getPanelButtons().getBotonCrearCuenta().addActionListener(this);
        ventanaPrincipal.getPanelInicio().getPanelButtons().getBotonDepositar().addActionListener(this);
        ventanaPrincipal.getPanelInicio().getPanelButtons().getBotonSalir().addActionListener(this);
        ventanaPrincipal.getPanelInicio().getPanelButtons().getBotonRetirar().addActionListener(this);
        ventanaPrincipal.getPanelInicio().getPanelButtons().getBotonInformacion().addActionListener(this);
        ventanaPrincipal.getPanelCrearCuenta().getRegistrarCuenta().addActionListener(this);
        ventanaPrincipal.getPanelInformacion().getBotonAtras().addActionListener(this);
        ventanaPrincipal.getPanelCrearCuenta().getBotonAtras().addActionListener(this);
        ventanaPrincipal.getPanelRetirar().getBotonAtras().addActionListener(this);
        ventanaPrincipal.getPanelRetirar().getRegistrarCuenta().addActionListener(this);
        ventanaPrincipal.getPanelDepositar().getBotonAtras().addActionListener(this);
        ventanaPrincipal.getPanelDepositar().getRegistrarCuenta().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        switch (comando) {
            case "Crear Cuenta":
                ventanaPrincipal.setLayout(new FlowLayout());
                ventanaPrincipal.getPanelInicio().setVisible(false);
                ventanaPrincipal.getPanelCrearCuenta().setVisible(true);
                break;

            case "Salir":
                System.exit(0);
                break;

            case "Registrar Cuenta":
                String numeroCuenta = ventanaPrincipal.getPanelCrearCuenta().getTextFieldNumeroCuenta().getText();
                String nombreTitular = ventanaPrincipal.getPanelCrearCuenta().getTextFieldNombreTitular().getText();
                String saldoTexto = ventanaPrincipal.getPanelCrearCuenta().getTextFieldSaldoCuenta().getText();
                String interesTexto = ventanaPrincipal.getPanelCrearCuenta().getTextFieldInteresMensual().getText();

                if(!numeroCuenta.isEmpty() && !nombreTitular.isEmpty()) {
                    double saldo;
                    double interes;

                    try {
                        saldo = Double.parseDouble(saldoTexto);
                        interes = Double.parseDouble(interesTexto);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(ventanaPrincipal, "No se ha podido registrar al usuario, ingrese valores correctos en los campos de valor y/o interés");
                        throw new NumberFormatException("Por favor, ingrese un número válido en los campos de saldo e interés.");
                    }

                    String mensaje = agendaBancaria.agregarCuenta(numeroCuenta, nombreTitular, saldo, interes);

                    ventanaPrincipal.getPanelCrearCuenta().getTextFieldNumeroCuenta().setText("");
                    ventanaPrincipal.getPanelCrearCuenta().getTextFieldNombreTitular().setText("");
                    ventanaPrincipal.getPanelCrearCuenta().getTextFieldSaldoCuenta().setText("");
                    ventanaPrincipal.getPanelCrearCuenta().getTextFieldInteresMensual().setText("");

                    JOptionPane.showMessageDialog(ventanaPrincipal, mensaje);
                    ventanaPrincipal.setLayout(new BorderLayout(2, 2));
                    ventanaPrincipal.getPanelInicio().setVisible(true);
                    ventanaPrincipal.getPanelCrearCuenta().setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(ventanaPrincipal, "Rellena todos los campos.");
                }

                break;
            case "Retirar":
                ventanaPrincipal.setLayout(new FlowLayout());
                ventanaPrincipal.getPanelInicio().setVisible(false);
                ventanaPrincipal.getPanelRetirar().setVisible(true);
                break;

            case "Retirar Cuenta":
                String numeroCuenta2 = ventanaPrincipal.getPanelRetirar().getTextFieldNumeroCuenta().getText();
                String valorARetirar = ventanaPrincipal.getPanelRetirar().getTextFieldValorARetirar().getText();

                ventanaPrincipal.getPanelRetirar().getTextFieldNumeroCuenta().setText("");
                ventanaPrincipal.getPanelRetirar().getTextFieldValorARetirar().setText("");

                try {
                    double valorRetiro = Double.parseDouble(valorARetirar);
                    String mensaje1 = agendaBancaria.retirarEnCuenta(numeroCuenta2, valorRetiro);
                    JOptionPane.showMessageDialog(ventanaPrincipal, mensaje1);

                    ventanaPrincipal.setLayout(new BorderLayout(2, 2));
                    ventanaPrincipal.getPanelInicio().setVisible(true);
                    ventanaPrincipal.getPanelRetirar().setVisible(false);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(ventanaPrincipal, "Por favor, ingrese un número válido para el valor a retirar.");
                } catch (SaldoInsuficienteException ex) {
                    JOptionPane.showMessageDialog(ventanaPrincipal, ex.getMessage());
                    ventanaPrincipal.setLayout(new BorderLayout(2, 2));
                    ventanaPrincipal.getPanelInicio().setVisible(true);
                    ventanaPrincipal.getPanelRetirar().setVisible(false);
                }
                break;

            case "Depositar":
                ventanaPrincipal.setLayout(new FlowLayout());
                ventanaPrincipal.getPanelInicio().setVisible(false);
                ventanaPrincipal.getPanelDepositar().setVisible(true);
                break;

            case "Depositar Cuenta":
                String numeroCuenta3 = ventanaPrincipal.getPanelDepositar().getTextFieldNumeroCuenta().getText();
                String valorADepositar = ventanaPrincipal.getPanelDepositar().getTextFieldValorARetirar().getText();

                ventanaPrincipal.getPanelDepositar().getTextFieldNumeroCuenta().setText("");
                ventanaPrincipal.getPanelDepositar().getTextFieldValorARetirar().setText("");

                try {
                    double valorDeposito = Double.parseDouble(valorADepositar);
                    String mensajeDeposito = agendaBancaria.depositarEnCuenta(numeroCuenta3, valorDeposito);
                    JOptionPane.showMessageDialog(ventanaPrincipal, mensajeDeposito);

                    ventanaPrincipal.setLayout(new BorderLayout(2, 2));
                    ventanaPrincipal.getPanelInicio().setVisible(true);
                    ventanaPrincipal.getPanelDepositar().setVisible(false);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(ventanaPrincipal, "Por favor, ingrese un número válido para el valor a depositar.");
                }
                break;

            case "Buscar Cuenta":
                String numeroCuenta4 = JOptionPane.showInputDialog(ventanaPrincipal, "Ingrese el número de la cuenta: ");
                String infoCuenta = agendaBancaria.mostrarInformacion(numeroCuenta4);
                if(!Objects.equals(infoCuenta, "No se ha encontrado la cuenta")) {
                    String[] info = infoCuenta.split(" ");
                    ventanaPrincipal.getPanelInformacion().getNumeroCuentaTexto().setText(info[0]);
                    ventanaPrincipal.getPanelInformacion().getNombreTitularTexto().setText(info[1]);
                    ventanaPrincipal.getPanelInformacion().getSaldoCuentaTexto().setText(info[2]);
                    ventanaPrincipal.getPanelInformacion().getInteresMensualTexto().setText(info[3]);

                    ventanaPrincipal.setLayout(new FlowLayout());
                    ventanaPrincipal.getPanelInicio().setVisible(false);
                    ventanaPrincipal.getPanelInformacion().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(ventanaPrincipal, infoCuenta);
                    ventanaPrincipal.setLayout(new BorderLayout(2, 2));
                    ventanaPrincipal.getPanelInicio().setVisible(true);
                    ventanaPrincipal.getPanelInformacion().setVisible(false);
                }
                break;
            case "Atras Informacion":
                ventanaPrincipal.setLayout(new BorderLayout(2, 2));
                ventanaPrincipal.getPanelInicio().setVisible(true);
                ventanaPrincipal.getPanelInformacion().setVisible(false);
                break;

            case "Atras Crear":
                ventanaPrincipal.setLayout(new BorderLayout(2, 2));
                ventanaPrincipal.getPanelInicio().setVisible(true);
                ventanaPrincipal.getPanelCrearCuenta().setVisible(false);
                break;

            case "Atras Retirar":
                ventanaPrincipal.setLayout(new BorderLayout(2, 2));
                ventanaPrincipal.getPanelInicio().setVisible(true);
                ventanaPrincipal.getPanelRetirar().setVisible(false);
                break;

            case "Atras Depositar":
                ventanaPrincipal.setLayout(new BorderLayout(2, 2));
                ventanaPrincipal.getPanelInicio().setVisible(true);
                ventanaPrincipal.getPanelDepositar().setVisible(false);
                break;
        }
    }
}
