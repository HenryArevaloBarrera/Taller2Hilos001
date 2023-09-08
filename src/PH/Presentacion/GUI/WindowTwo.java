package PH.Presentacion.GUI;


import PH.Logica.Control.HilosJuego;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowTwo extends JFrame implements ActionListener, ChangeListener {
    private final JTextArea panel0;
    private final JTextArea txtNombre;
    private final JTextArea txtValor;
    private final JTextField nombre;
    private final JTextField valor;
    private final JButton envio;
    private final JButton salir;

    public WindowTwo() {
        ImageIcon nuestroIcono = new ImageIcon("src/PH/Presentacion/Recursos/fondo1.jpg");
        JLabel panel = new JLabel();
        panel.setIcon(nuestroIcono);

        this.envio = new JButton("Iniciar Juego");
        this.envio.setBounds(20, 410, 120, 20);
        this.envio.addActionListener(this);


        this.salir = new JButton("salir");
        this.salir.setBounds(160, 410, 120, 20);
        this.salir.addActionListener(this);

        this.txtNombre = new JTextArea("Nombre Jugador :");
        this.txtNombre.setBounds(30, 330, 200, 20);
        this.txtNombre.setLineWrap(true);
        this.txtNombre.setFont(new Font("Tahoma", Font.BOLD, 12));
        this.txtNombre.setOpaque(false);
        this.txtNombre.setForeground(Color.WHITE);

        this.txtValor = new JTextArea("Valor De La Apuesta:");
        this.txtValor.setBounds(30, 360, 200, 20);
        this.txtValor.setLineWrap(true);
        this.txtValor.setFont(new Font("Tahoma", Font.BOLD, 12));
        this.txtValor.setOpaque(false);
        this.txtValor.setForeground(Color.WHITE);


        this.nombre = new JTextField();
        this.nombre.setBounds(160, 330, 120, 20);
        this.nombre.setFont(new Font("Tahoma", Font.BOLD, 12));

        this.valor = new JTextField();
        this.valor.setBounds(160, 360, 120, 20);
        this.valor.setFont(new Font("Tahoma", Font.BOLD, 12));

        this.panel0 = new JTextArea();
        this.panel0.setBounds(20, 20, 260, 300);
        this.panel0.setBackground(new Color(200, 200, 200));
        this.panel0.setBorder(null);
        this.panel0.setText("                           REGLAS               \n\n" +
                "El jugador debe ingresar un valor inicial para comenzar a jugar.\n\n" +
                "Si el jugador acierta las 3 ruletas, su valor se multiplicará por 3.\n\n" +
                "Si el jugador acierta 2 ruletas, su valor se multiplicará por 2.\n\n" +
                "Si el jugador no acierta ninguna de las ruletas, el valor que ingresó se reducirá a la mitad. \n\n" +
                "Para obtener las ganancias es necesario que se RETIRE el juego \n\n");
        this.panel0.setLineWrap(true);
        this.panel0.setFont(new Font("Tahoma", Font.BOLD, 12));
        this.panel0.setOpaque(false);
        this.panel0.setForeground(Color.WHITE);

        this.setResizable(false);

        this.add(envio);
        this.add(salir);
        this.add(nombre);
        this.add(valor);
        this.add(panel0);
        this.add(txtNombre);
        this.add(txtValor);
        this.add(panel);
        this.setResizable(false);
        this.setSize(330, 530);
        this.setTitle("Juego Con Hilos");
        this.setVisible(true);
        setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.salir) {
            this.dispose();
        }
        if (e.getSource() == this.envio) {
            if (this.nombre.getText().equals("")) {
                JOptionPane.showMessageDialog(null," Agregar nombre primero");
            } else {
                if (this.valor.getText().equals("")) {
                    JOptionPane.showMessageDialog(null," Agregar valor de la apuesta primero");
                } else {
                    if (valor.getText().matches("\\d+")) {
                        Window window=new Window(valor.getText(),nombre.getText(),valor.getText());
                        window.setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null," Valor de la apuesta no es numerico");
                    }
                }
            }

        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {

    }
}
