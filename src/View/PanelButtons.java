package View;

import javax.swing.*;
import java.awt.*;

public class PanelButtons extends JPanel {
    private JButton botonCrearCuenta;
    private JButton botonRetirar;
    private JButton botonInformacion;
    private JButton botonDepositar;
    private JButton botonSalir;
    public PanelButtons() {
        setLayout(new FlowLayout());
        setVisible(true);
        setBackground(new Color(0xFFA62B));
        inicializarComponentes();

    }
    public void inicializarComponentes() {
        botonCrearCuenta = new JButton("Crear Cuenta");
        botonCrearCuenta = crearBotonEstilizado("Crear Cuenta");
        botonCrearCuenta.setActionCommand("Crear Cuenta");
        add(botonCrearCuenta);

        botonRetirar = new JButton("Retirar");
        botonRetirar = crearBotonEstilizado("Retirar");
        botonRetirar.setActionCommand("Retirar");
        add(botonRetirar);

        botonInformacion = new JButton("Informacion");
        botonInformacion = crearBotonEstilizado("Buscar Cuenta");
        botonInformacion.setActionCommand("Buscar Cuenta");
        add(botonInformacion);

        botonDepositar = new JButton("Depositar");
        botonDepositar = crearBotonEstilizado("Depositar");
        botonDepositar.setActionCommand("Depositar");
        add(botonDepositar);

        botonSalir = new JButton("Salir");
        botonSalir = crearBotonEstilizado("Salir");
        botonSalir.setActionCommand("Salir");
        add(botonSalir);
    }

    public static JButton crearBotonEstilizado(String texto) {
        JButton boton = new JButton(texto);
        boton.setFont(new Font("Arial", Font.PLAIN, 14));
        boton.setFocusPainted(false);
        boton.setBorderPainted(false);
        boton.setContentAreaFilled(true);
        boton.setBackground(new Color(0x489FB5));
        boton.setForeground(new Color(0xEDE7E3));
        boton.setOpaque(true);
        boton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        return boton;
    }

    public JButton getBotonCrearCuenta() {
        return botonCrearCuenta;
    }

    public void setBotonCrearCuenta(JButton botonCrearCuenta) {
        this.botonCrearCuenta = botonCrearCuenta;
    }

    public JButton getBotonRetirar() {
        return botonRetirar;
    }

    public void setBotonRetirar(JButton botonRetirar) {
        this.botonRetirar = botonRetirar;
    }

    public JButton getBotonInformacion() {
        return botonInformacion;
    }

    public void setBotonInformacion(JButton botonInformacion) {
        this.botonInformacion = botonInformacion;
    }

    public JButton getBotonDepositar() {
        return botonDepositar;
    }

    public void setBotonDepositar(JButton botonDepositar) {
        this.botonDepositar = botonDepositar;
    }

    public JButton getBotonSalir() {
        return botonSalir;
    }

    public void setBotonSalir(JButton botonSalir) {
        this.botonSalir = botonSalir;
    }
}
