package Presentacion.GUI;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowTwo extends JFrame implements ActionListener, ChangeListener {
    private final JTextArea panel0;

    public WindowTwo() {
        ImageIcon nuestroIcono = new ImageIcon("src/Presentacion/Recursos/fondo1.jpg");
        JLabel panel = new JLabel();
        panel.setIcon(nuestroIcono);

        this.panel0 = new JTextArea();
        this.panel0.setBounds(20, 50, 260, 300);
        this.panel0.setBackground(new Color(200, 200, 200));
        this.panel0.setBorder(null);
        this.panel0.setText("        REGLAS\n\nEl jugador debe ingresar un valor inicial para comenzar a jugar.\n\n" +
                "Si el jugador acierta las 3 ruletas, su valor se multiplicará.\n\n" +
                "Si el jugador acierta 2 ruletas, su valor se multiplicará por 1.2.\n\n" +
                "Si el jugador no acierta ninguna de las ruletas, el valor que ingresó se reducirá a la mitad. \n\n" +
                "Cada juego consta de 3 rondas para poder ganar.");
        this.panel0.setLineWrap(true);
        this.panel0.setFont(new Font("Tahoma", Font.BOLD, 12));
        this.panel0.setOpaque(false);
        this.panel0.setForeground(Color.WHITE);

        this.setResizable(false);
        this.add(panel0);
        this.add(panel);
        this.setResizable(false);
        this.setSize(330, 530);
        this.setTitle("Juego Con Hilos");
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void stateChanged(ChangeEvent e) {

    }
}
