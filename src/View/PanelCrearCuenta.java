package View;

import javax.swing.*;
import java.awt.*;

public class PanelCrearCuenta extends JPanel {
    private JLabel labelNumeroCuenta;
    private JTextField textFieldNumeroCuenta;

    private JLabel nombreTitular;
    private JTextField textFieldNombreTitular;

    private JLabel saldoCuenta;
    private JTextField textFieldSaldoCuenta;

    private JLabel interesMensual;
    private JTextField textFieldInteresMensual;

    private JButton registrarCuenta;
    private JButton botonAtras;

    private JLabel titulo;


    public PanelCrearCuenta() {
        setLayout(new BorderLayout(20, 20));
        setVisible(false);
        inicializarComponentes();
    }

    public void inicializarComponentes() {
        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(4, 2, 22, 22));

        labelNumeroCuenta = new JLabel("Numero Cuenta");
        gridPanel.add(labelNumeroCuenta);

        textFieldNumeroCuenta = new JTextField();
        gridPanel.add(textFieldNumeroCuenta);

        nombreTitular = new JLabel("Titular");
        gridPanel.add(nombreTitular);

        textFieldNombreTitular = new JTextField();
        gridPanel.add(textFieldNombreTitular);

        saldoCuenta = new JLabel("Saldo");
        gridPanel.add(saldoCuenta);

        textFieldSaldoCuenta = new JTextField();
        gridPanel.add(textFieldSaldoCuenta);

        interesMensual = new JLabel("Interes");
        gridPanel.add(interesMensual);

        textFieldInteresMensual = new JTextField();
        gridPanel.add(textFieldInteresMensual);
        add(gridPanel, BorderLayout.CENTER);

        registrarCuenta = new JButton("Registrar");
        registrarCuenta = PanelButtons.crearBotonEstilizado("Registrar");
        registrarCuenta.setActionCommand("Registrar Cuenta");

        botonAtras = new JButton("Atras");
        botonAtras = PanelButtons.crearBotonEstilizado("Atras");
        botonAtras.setBackground(new Color(0xF40000));
        botonAtras.setActionCommand("Atras Crear");

        JPanel botonPanel = new JPanel();

        botonPanel.setLayout(new GridLayout(2, 1, 10, 10));
        botonPanel.add(registrarCuenta);
        botonPanel.add(botonAtras);

        add(botonPanel, BorderLayout.SOUTH);

        titulo = new JLabel("¡Crea una nueva cuenta!");
        Font font = new Font("arial", Font.BOLD, 50);
        titulo.setFont(font);

        add(titulo, BorderLayout.NORTH);
    }

    public JLabel getLabelNumeroCuenta() {
        return labelNumeroCuenta;
    }

    public void setLabelNumeroCuenta(JLabel labelNumeroCuenta) {
        this.labelNumeroCuenta = labelNumeroCuenta;
    }

    public JTextField getTextFieldNumeroCuenta() {
        return textFieldNumeroCuenta;
    }

    public void setTextFieldNumeroCuenta(JTextField textFieldNumeroCuenta) {
        this.textFieldNumeroCuenta = textFieldNumeroCuenta;
    }

    public JLabel getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(JLabel nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public JTextField getTextFieldNombreTitular() {
        return textFieldNombreTitular;
    }

    public void setTextFieldNombreTitular(JTextField textFieldNombreTitular) {
        this.textFieldNombreTitular = textFieldNombreTitular;
    }

    public JLabel getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(JLabel saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public JTextField getTextFieldSaldoCuenta() {
        return textFieldSaldoCuenta;
    }

    public void setTextFieldSaldoCuenta(JTextField textFieldSaldoCuenta) {
        this.textFieldSaldoCuenta = textFieldSaldoCuenta;
    }

    public JLabel getInteresMensual() {
        return interesMensual;
    }

    public void setInteresMensual(JLabel interesMensual) {
        this.interesMensual = interesMensual;
    }

    public JTextField getTextFieldInteresMensual() {
        return textFieldInteresMensual;
    }

    public void setTextFieldInteresMensual(JTextField textFieldInteresMensual) {
        this.textFieldInteresMensual = textFieldInteresMensual;
    }

    public JButton getRegistrarCuenta() {
        return registrarCuenta;
    }

    public void setRegistrarCuenta(JButton registrarCuenta) {
        this.registrarCuenta = registrarCuenta;
    }

    public JButton getBotonAtras() {
        return botonAtras;
    }

    public void setBotonAtras(JButton botonAtras) {
        this.botonAtras = botonAtras;
    }

    public JLabel getTitulo() {
        return titulo;
    }

    public void setTitulo(JLabel titulo) {
        this.titulo = titulo;
    }
}
