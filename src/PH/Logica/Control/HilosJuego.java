package PH.Logica.Control;

import javax.swing.*;
import java.util.Random;

public class HilosJuego implements Runnable {
    private JLabel text;
    private boolean state;
    private boolean sw;

    public HilosJuego(JLabel text, boolean sw) {
        this.text = text;
        this.sw = sw;
        state = true;
    }

    @Override
    public void run() {
        if (sw) {
            int tiempo = 100;
            int tiempo2 = 0;
            for (int x = new Random().nextInt(8); x <= 9 && state; x++) {
                text.setText("" + x);
                if (x == 1) {
                    text.setIcon(new ImageIcon("src/PH/Presentacion/Recursos/figura1.jpg"));
                }
                if (x == 2) {
                    text.setIcon(new ImageIcon("src/PH/Presentacion/Recursos/figura2.jpg"));
                }
                if (x == 3) {
                    text.setIcon(new ImageIcon("src/PH/Presentacion/Recursos/figura3.jpg"));
                }
                if (x == 4) {
                    text.setIcon(new ImageIcon("src/PH/Presentacion/Recursos/figura4.jpg"));
                }
                if (x == 5) {
                    text.setIcon(new ImageIcon("src/PH/Presentacion/Recursos/figura5.jpg"));
                }
                if (x == 6) {
                    text.setIcon(new ImageIcon("src/PH/Presentacion/Recursos/figura6.jpg"));
                }
                if (x == 7) {
                    text.setIcon(new ImageIcon("src/PH/Presentacion/Recursos/figura7.jpg"));
                }
                if (x == 8) {
                    text.setIcon(new ImageIcon("src/PH/Presentacion/Recursos/figura8.jpg"));
                }
                if (x == 9) {
                    text.setIcon(new ImageIcon("src/PH/Presentacion/Recursos/figura9.jpg"));
                }

                try {

                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (x == 9) {
                    x = 0;
                }
                if (tiempo2 < 2000) {
                    tiempo2 += 10;
                } else {
                    tiempo+=20;
                    if (tiempo == 1000) {
                        stopThread();
                    }
                }
            }
        } else {
            int tiempo = 0;
            for (int x = 0; x >= 9 && state; x--) {
                text.setText("" + x);
                try {
                    Thread.sleep(new Random().nextInt(1800) + 1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (x == 9) {
                    x = 0;
                }
                if (tiempo < 1000) {
                    tiempo += 20;
                } else {
                    stopThread();
                }

                if (tiempo >= 1200) {
                    x = 10;
                }
                System.out.println("tiempo = " + tiempo);
            }

        }
    }

    public void stopThread() {
        state = false;
    }
}

