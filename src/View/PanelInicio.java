package View;

import javax.swing.*;
import java.awt.*;

public class PanelInicio extends JPanel {
    private PanelButtons panelButtons;
    private JLabel titulo;

    public PanelInicio() {
        setLayout(new BorderLayout(20, 20));
        setBounds(20, 20, 100, 200);
        setBackground(new Color(0xFFA62B));
        inicializarComponentes();

    }

    public void inicializarComponentes() {
        titulo = new JLabel("¡Gestiona tus cuentas!     ");
        Font font = new Font("arial", Font.BOLD, 40);
        titulo.setForeground(new Color(0xEDE7E3));
        titulo.setFont(font);

        JPanel contenedorCentral = new JPanel(new GridBagLayout());
        contenedorCentral.setBackground(new Color(0xFFA62B));
        panelButtons = new PanelButtons();
        contenedorCentral.add(titulo);
        contenedorCentral.add(panelButtons);

        add(contenedorCentral, BorderLayout.CENTER);
    }

    public PanelButtons getPanelButtons() {
        return panelButtons;
    }

    public void setPanelButtons(PanelButtons panelButtons) {
        this.panelButtons = panelButtons;
    }

    public JLabel getTitulo() {
        return titulo;
    }

    public void setTitulo(JLabel titulo) {
        this.titulo = titulo;
    }
}
