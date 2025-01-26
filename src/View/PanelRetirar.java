package View;

import javax.swing.*;
import java.awt.*;

public class PanelRetirar extends JPanel {

    private JLabel labelNumeroCuenta;
    private JTextField textFieldNumeroCuenta;

    private JLabel valorARetirar;
    private JTextField textFieldValorARetirar;

    private JLabel titulo;
    private JButton registrarCuenta;
    private JButton botonAtras;


    public PanelRetirar() {
        setLayout(new BorderLayout(20, 20));
        setVisible(false);
        inicializarComponentes();
    }

    public void inicializarComponentes() {
        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(2, 2, 22, 22));

        labelNumeroCuenta = new JLabel("Numero Cuenta");
        gridPanel.add(labelNumeroCuenta);

        textFieldNumeroCuenta = new JTextField();
        gridPanel.add(textFieldNumeroCuenta);

        valorARetirar = new JLabel("Valor a retirar");
        gridPanel.add(valorARetirar);

        textFieldValorARetirar = new JTextField();
        gridPanel.add(textFieldValorARetirar);


        registrarCuenta = new JButton("Retirar");
        registrarCuenta = PanelButtons.crearBotonEstilizado("Retirar");
        registrarCuenta.setActionCommand("Retirar Cuenta");

        botonAtras = new JButton("Atras");
        botonAtras = PanelButtons.crearBotonEstilizado("Atras");
        botonAtras.setBackground(new Color(0xF40000));
        botonAtras.setActionCommand("Atras Retirar");

        JPanel botonPanel = new JPanel();

        botonPanel.setLayout(new GridLayout(2, 1, 10, 10));
        botonPanel.add(registrarCuenta);
        botonPanel.add(botonAtras);

        add(botonPanel, BorderLayout.SOUTH);
        add(gridPanel, BorderLayout.CENTER);

        titulo = new JLabel("¡Retira dinero de una cuenta!");
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

    public JLabel getValorARetirar() {
        return valorARetirar;
    }

    public void setValorARetirar(JLabel valorARetirar) {
        this.valorARetirar = valorARetirar;
    }

    public JTextField getTextFieldValorARetirar() {
        return textFieldValorARetirar;
    }

    public void setTextFieldValorARetirar(JTextField textFieldValorARetirar) {
        this.textFieldValorARetirar = textFieldValorARetirar;
    }

    public JLabel getTitulo() {
        return titulo;
    }

    public void setTitulo(JLabel titulo) {
        this.titulo = titulo;
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
}

