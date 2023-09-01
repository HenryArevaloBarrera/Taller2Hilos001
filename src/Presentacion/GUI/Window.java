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
    private final JButton return1;


    ImageIcon nuestroIcono = new ImageIcon("src/Presentacion/Recursos/fondo1.jpg");
    ImageIcon nuestroIcono2 = new ImageIcon("src/Presentacion/Recursos/imagen2.png");
    ImageIcon nuestroIcono3 = new ImageIcon("src/Presentacion/Recursos/imagen1.png");

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


        this.return1 = new JButton();
        this.return1.setBounds(450, 50, 50, 200);
        this.return1.setFont(font1);
        this.return1.setBackground(new Color(230, 230, 230));
        this.return1.addActionListener(this);
        return1.setIcon(nuestroIcono3);
        return1.setBorderPainted(false);

        JLabel panel = new JLabel();
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

    }

    public static void main(String[] args) {
        new Window();
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