package Presentacion.GUI;


import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Window extends JFrame implements ActionListener, ChangeListener {

    private final JLabel panel1;
    private final JLabel panel2;
    private final JLabel panel3;
    private final JButton boton;
    private final JButton boton1;
    private final JButton boton2;

    public Image imagenfonndo;
    public URL fondo;


    public Window() {
        Font font = new Font("Arial", Font.PLAIN, 100);
        Font font1 = new Font("Arial", Font.PLAIN, 20);

        this.panel1 = new JLabel("1");
        this.panel1.setBounds(70, 80, 100, 100);
        this.panel1.setBackground(new Color(200, 200, 200));
        this.panel1.setBorder(null);
        this.panel1.setFont(font);


        this.panel2 = new JLabel("2");
        this.panel2.setBounds(190, 80, 100, 100);
        this.panel2.setBackground(new Color(200, 200, 200));
        this.panel2.setBorder(null);
        this.panel2.setFont(font);


        this.panel3 = new JLabel("3");
        this.panel3.setBounds(310, 80, 100, 100);
        this.panel3.setBackground(new Color(200, 200, 200));
        this.panel3.setBorder(null);
        this.panel3.setFont(font);


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

        JPanel panel = new JPanel();
        this.add(this.panel1);
        this.add(this.panel2);
        this.add(this.panel3);
        this.add(this.boton);
        this.add(this.boton1);
        this.add(this.boton2);


        this.setResizable(false);
        this.add(panel);

        this.setSize(500, 330);
        this.setTitle("Juego Con Hilos");
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new Window();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.boton) {

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