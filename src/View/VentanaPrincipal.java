package View;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    private PanelCrearCuenta panelCrearCuenta;
    private PanelDepositar panelDepositar;
    private PanelInformacion panelInformacion;
    private PanelRetirar panelRetirar;
    private PanelInicio panelInicio;


    public VentanaPrincipal() {
        setTitle("¡Gestiona tus cuenta!");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new BorderLayout(2, 2));
        setBackground(new Color(0xFFA62B));

        inicializarComponentes();

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void inicializarComponentes() {
        panelCrearCuenta = new PanelCrearCuenta();
        add(panelCrearCuenta, BorderLayout.CENTER);
        panelDepositar = new PanelDepositar();
        panelInformacion = new PanelInformacion();
        panelRetirar = new PanelRetirar();
        panelInicio = new PanelInicio();
        add(panelInicio, BorderLayout.CENTER);
        add(panelInformacion, BorderLayout.SOUTH);
        add(panelRetirar, BorderLayout.EAST);
        add(panelDepositar, BorderLayout.WEST);

    }


    public PanelCrearCuenta getPanelCrearCuenta() {
        return panelCrearCuenta;
    }

    public void setPanelCrearCuenta(PanelCrearCuenta panelCrearCuenta) {
        this.panelCrearCuenta = panelCrearCuenta;
    }

    public PanelDepositar getPanelDepositar() {
        return panelDepositar;
    }

    public void setPanelDepositar(PanelDepositar panelDepositar) {
        this.panelDepositar = panelDepositar;
    }

    public PanelInformacion getPanelInformacion() {
        return panelInformacion;
    }

    public void setPanelInformacion(PanelInformacion panelInformacion) {
        this.panelInformacion = panelInformacion;
    }

    public PanelRetirar getPanelRetirar() {
        return panelRetirar;
    }

    public void setPanelRetirar(PanelRetirar panelRetirar) {
        this.panelRetirar = panelRetirar;
    }

    public PanelInicio getPanelInicio() {
        return panelInicio;
    }

    public void setPanelInicio(PanelInicio panelInicio) {
        this.panelInicio = panelInicio;
    }
}
