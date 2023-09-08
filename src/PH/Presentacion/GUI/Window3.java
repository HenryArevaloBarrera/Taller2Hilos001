package PH.Presentacion.GUI;

import PH.Logica.Control.HilosJuego;
import PH.Persistencia.Utilidades.Archivo;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window3 extends JFrame implements ActionListener, ChangeListener {
    private final JLabel panel0;
    private final JLabel panel1;
    private final JLabel panel2;

    private final JLabel usuario;

    private final JButton boton;

    private JTable tabla = null;

    DefaultTableModel modelo = null;
    JScrollPane desplazamiento = null;
    private int valorInicial;
    HilosJuego runOne;
    HilosJuego runTwo;
    HilosJuego runTree;
    private Thread campo1;
    private Thread campo2;
    private Thread campo3;


    ImageIcon nuestroIcono = new ImageIcon("src/PH/Presentacion/Recursos/fondo1.jpg");
    ImageIcon nuestroIcono2 = new ImageIcon("src/PH/Presentacion/Recursos/imagen2.png");
    ImageIcon nuestroIcono3 = new ImageIcon("src/PH/Presentacion/Recursos/imagen1.png");
    ImageIcon nuestroIcono4 = new ImageIcon("src/PH/Presentacion/Recursos/imagen3.png");

    public Window3(String valorApuesta, String nombreParticipante, int valorinicial) {

        Font font = new Font("Arial", Font.PLAIN, 100);
        Font font1 = new Font("Arial", Font.PLAIN, 20);


        this.usuario = new JLabel("HISTORIAL");
        this.usuario.setBounds(190, 10, 150, 50);
        this.usuario.setBackground(new Color(200, 200, 200));
        this.usuario.setBorder(null);
        this.usuario.setFont(font1);
        this.usuario.setForeground(new Color(26, 82, 5, 232));

        this.panel0 = new JLabel();
        this.panel0.setBounds(10, 10, 150, 50);
        this.panel0.setBackground(new Color(200, 200, 200));
        this.panel0.setBorder(null);
        this.panel0.setFont(font);
        this.panel0.setIcon(nuestroIcono4);

        this.panel1 = new JLabel("Dinero inicial :" + valorApuesta);
        this.panel1.setBounds(10, 40, 150, 50);
        this.panel1.setBackground(new Color(200, 200, 200));
        this.panel1.setBorder(null);
        this.panel1.setFont(font);
        this.panel1.setForeground(Color.WHITE);


        this.panel2 = new JLabel("Dinero final :" + valorinicial);
        this.panel2.setBounds(10, 80, 150, 50);
        this.panel2.setBackground(new Color(200, 200, 200));
        this.panel2.setBorder(null);
        this.panel2.setFont(font);
        this.panel2.setForeground(Color.WHITE);


        String[] columnas = {"Jugador", "Dinero Acumulado", "Dinero Inicial"};
        tabla = new JTable();

        modelo = new DefaultTableModel();
        desplazamiento = new JScrollPane(tabla);
        desplazamiento.setBounds(30, 80, 450, 150);

        this.setTitle("HISTORIAL");
        this.setLayout(null);
        modelo.setColumnIdentifiers(columnas);

        desplazamiento.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        desplazamiento.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabla.setFillsViewportHeight(true);
        tabla.setFocusable(false);
        tabla.setModel(modelo);

        this.agregarDatos(modelo);
        this.pack();


        this.boton = new JButton("Inicio");
        this.boton.setBounds(50, 250, 100, 30);
        this.boton.setFont(font1);
        this.boton.setBackground(new Color(230, 230, 230));
        this.boton.addActionListener(this);


        JLabel panel = new JLabel();

        this.add(this.usuario);
        this.add(this.panel0);
        this.add(this.panel1);
        this.add(this.panel2);
        this.add(this.boton);
        this.add(desplazamiento);

        panel.setIcon(nuestroIcono);


        this.setResizable(false);
        this.add(panel);

        this.setSize(530, 330);
        this.setTitle("Juego Con Hilos");
        this.setVisible(true);
        setLocationRelativeTo(null);

    }

    String numero = "";
    Archivo archivo = new Archivo();
    String ruta = "src/PH/Presentacion/Recursos/historialJuego.csv";
    int valorfin = 0;

    private void agregarDatos(DefaultTableModel modelo) {

        modelo.setRowCount(0);

        Object[] datosFila = {"", "", ""};

        modelo.addRow(datosFila);

        for (int x = 0; x < Archivo.GetInfoContenido(ruta).size(); x++) {
            String cadena = Archivo.GetInfoContenido(ruta).get(x);
            String[] parts = cadena.split(",");

            datosFila[0] = parts[0];
            datosFila[1] = parts[1];
            datosFila[2] = parts[2];


            numero = parts[2].replaceAll(";", "");
            valorfin += Integer.parseInt(numero);
            modelo.addRow(datosFila);

        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object componente = e.getSource();
        if (componente.equals(boton)) {
            WindowTwo windowTwo= new WindowTwo();
            windowTwo.isVisible();

            dispose();
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {

    }
}
