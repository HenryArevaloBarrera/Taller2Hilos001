package PH.Presentacion.GUI;


import PH.Logica.Control.HilosJuego;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Window extends JFrame implements ActionListener, ChangeListener {
    private final JLabel panel0;
    private final JLabel valor;
    private final JLabel panel1;
    private final JLabel panel2;
    private final JLabel panel3;
    private final JButton boton;
    private final JButton boton1;
    private final JButton boton2;
    private final JButton return1;

    private Thread campo1;
    private Thread campo2;
    private Thread campo3;


    ImageIcon nuestroIcono = new ImageIcon("src/PH/Presentacion/Recursos/fondo1.jpg");
    ImageIcon nuestroIcono2 = new ImageIcon("src/PH/Presentacion/Recursos/imagen2.png");
    ImageIcon nuestroIcono3 = new ImageIcon("src/PH/Presentacion/Recursos/imagen1.png");
    ImageIcon nuestroIcono4 = new ImageIcon("src/PH/Presentacion/Recursos/imagen3.png");

    public Window(String valorApuesta, String nombreParticipante) {
        Font font = new Font("Arial", Font.PLAIN, 100);
        Font font1 = new Font("Arial", Font.PLAIN, 20);

        this.valor = new JLabel("" + valorApuesta);
        this.valor.setBounds(90, 10, 80, 50);
        this.valor.setBackground(new Color(200, 200, 200));
        this.valor.setBorder(null);
        this.valor.setFont(font1);
        this.valor.setForeground(Color.WHITE);

        this.panel0 = new JLabel();
        this.panel0.setBounds(10, 10, 80, 50);
        this.panel0.setBackground(new Color(200, 200, 200));
        this.panel0.setBorder(null);
        this.panel0.setFont(font);
        this.panel0.setIcon(nuestroIcono4);


        this.panel1 = new JLabel("1");
        this.panel1.setBounds(70, 80, 100, 100);
        this.panel1.setBackground(new Color(200, 200, 200));
        this.panel1.setBorder(null);
        this.panel1.setFont(font);
        this.panel1.setForeground(Color.WHITE);

        this.panel2 = new JLabel("2");
        this.panel2.setBounds(190, 80, 100, 100);
        this.panel2.setBackground(new Color(200, 200, 200));
        this.panel2.setBorder(null);
        this.panel2.setFont(font);
        this.panel2.setForeground(Color.WHITE);


        this.panel3 = new JLabel("3");
        this.panel3.setBounds(310, 80, 100, 100);
        this.panel3.setBackground(new Color(200, 200, 200));
        this.panel3.setBorder(null);
        this.panel3.setFont(font);
        this.panel3.setForeground(Color.WHITE);


        this.boton = new JButton("STOP");
        this.boton.setBounds(70, 200, 100, 50);
        this.boton.setFont(font1);
        this.boton.setBackground(new Color(230, 230, 230));
        this.boton.addActionListener(this);

        this.boton1 = new JButton("STOP");
        this.boton1.setBounds(190, 200, 100, 50);
        this.boton1.setFont(font1);
        this.boton1.setBackground(new Color(230, 230, 230));
        this.boton1.addActionListener(this);

        this.boton2 = new JButton("STOP");
        this.boton2.setBounds(310, 200, 100, 50);
        this.boton2.setFont(font1);
        this.boton2.setBackground(new Color(230, 230, 230));
        this.boton2.addActionListener(this);


        this.return1 = new JButton();
        this.return1.setBounds(450, 50, 50, 200);
        this.return1.setFont(font1);
        this.return1.setBackground(new Color(230, 230, 230));
        this.return1.addActionListener(this);
        return1.setIcon(nuestroIcono3);
        return1.setBorderPainted(false);

        JLabel panel = new JLabel();
        this.add(this.valor);
        this.add(this.panel0);
        this.add(this.panel1);
        this.add(this.panel2);
        this.add(this.panel3);
        this.add(this.boton);
        this.add(this.boton1);
        this.add(this.boton2);
        this.add(this.return1);
        panel.setIcon(nuestroIcono);


        this.setResizable(false);
        this.add(panel);

        this.setSize(530, 330);
        this.setTitle("Juego Con Hilos");
        this.setVisible(true);

        HilosJuego runOne = new HilosJuego(panel1, true);

        HilosJuego runTwo = new HilosJuego(panel2, true);

        HilosJuego runTree = new HilosJuego(panel3, true);
        campo1 = new Thread(runOne);
        campo2 = new Thread(runTwo);
        campo3 = new Thread(runTree);


    }

    public static void main(String[] args) {
        new Window("", "");
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.return1) {
            return1.setIcon(nuestroIcono2);
            Timer timer = new Timer(500, new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    return1.setIcon(nuestroIcono3);
                }
            });
            timer.setRepeats(false);
            timer.start();

            campo1.start();
            campo2.start();
            campo3.start();



        }
        if (e.getSource() == this.boton1) {

        }
        if (e.getSource() == this.boton2) {

        }

    }

    @Override
    public void stateChanged(ChangeEvent e) {

    }

}