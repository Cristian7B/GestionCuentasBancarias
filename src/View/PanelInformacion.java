package View;

import javax.swing.*;
import java.awt.*;

public class PanelInformacion extends JPanel {
    private JLabel nombreTitular;
    private JLabel nombreTitularTexto;

    private JLabel numeroCuenta;
    private JLabel numeroCuentaTexto;

    private JLabel saldoCuenta;
    private JLabel saldoCuentaTexto;

    private JLabel interesMensual;
    private JLabel interesMensualTexto;

    private JButton botonAtras;
    private JLabel titulo;

    public PanelInformacion() {
        setLayout(new BorderLayout(25, 25));
        setVisible(false);
        inicializarComponentes();
    }

    public void inicializarComponentes() {
        Font font1 = new Font("Arial", Font.BOLD, 20);
        Font font2 = new Font("Arial", Font.PLAIN, 20);

        nombreTitular = new JLabel("Titular");
        nombreTitular.setFont(font1);
        nombreTitularTexto = new JLabel("");
        nombreTitularTexto.setFont(font2);

        numeroCuenta = new JLabel("Cuenta");
        numeroCuenta.setFont(font1);
        numeroCuentaTexto = new JLabel("");
        numeroCuentaTexto.setFont(font2);

        saldoCuenta = new JLabel("Saldo");
        saldoCuenta.setFont(font1);
        saldoCuentaTexto = new JLabel("");
        saldoCuentaTexto.setFont(font2);

        interesMensual = new JLabel("Interes");
        interesMensual.setFont(font1);
        interesMensualTexto = new JLabel("");
        interesMensualTexto.setFont(font2);

        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(4, 2, 10, 10));
        gridPanel.add(nombreTitular);
        gridPanel.add(nombreTitularTexto);

        gridPanel.add(numeroCuenta);
        gridPanel.add(numeroCuentaTexto);

        gridPanel.add(saldoCuenta);
        gridPanel.add(saldoCuentaTexto);

        gridPanel.add(interesMensual);
        gridPanel.add(interesMensualTexto);

        botonAtras = new JButton("Atras");
        botonAtras = PanelButtons.crearBotonEstilizado("Atras");
        botonAtras.setBackground(new Color(0xF40000));
        botonAtras.setActionCommand("Atras Informacion");

        titulo = new JLabel("¡La cuenta que estabas buscando!");
        Font font = new Font("arial", Font.BOLD, 50);
        titulo.setFont(font);

        add(titulo, BorderLayout.NORTH);
        add(gridPanel, BorderLayout.CENTER);
        add(botonAtras, BorderLayout.SOUTH);
    }

    public JLabel getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(JLabel nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public JLabel getNombreTitularTexto() {
        return nombreTitularTexto;
    }

    public void setNombreTitularTexto(JLabel nombreTitularTexto) {
        this.nombreTitularTexto = nombreTitularTexto;
    }

    public JLabel getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(JLabel numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public JLabel getNumeroCuentaTexto() {
        return numeroCuentaTexto;
    }

    public void setNumeroCuentaTexto(JLabel numeroCuentaTexto) {
        this.numeroCuentaTexto = numeroCuentaTexto;
    }

    public JLabel getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(JLabel saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public JLabel getSaldoCuentaTexto() {
        return saldoCuentaTexto;
    }

    public void setSaldoCuentaTexto(JLabel saldoCuentaTexto) {
        this.saldoCuentaTexto = saldoCuentaTexto;
    }

    public JLabel getInteresMensual() {
        return interesMensual;
    }

    public void setInteresMensual(JLabel interesMensual) {
        this.interesMensual = interesMensual;
    }

    public JLabel getInteresMensualTexto() {
        return interesMensualTexto;
    }

    public void setInteresMensualTexto(JLabel interesMensualTexto) {
        this.interesMensualTexto = interesMensualTexto;
    }

    public JButton getBotonAtras() {
        return botonAtras;
    }

    public void setBotonAtras(JButton botonAtras) {
        this.botonAtras = botonAtras;
    }
}
