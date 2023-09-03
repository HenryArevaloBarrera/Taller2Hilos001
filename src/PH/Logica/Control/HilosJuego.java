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
            int tiempo = 0;
            for (int x = 0; x <= 9 && state; x++) {
                text.setText("" + x);
                try {
                    Thread.sleep(tiempo);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (x == 9) {
                    x = 0;
                }
                tiempo += 20;

            }
        } else {
            int tiempo = 0;
            for (int x = 0; x >= 9 && state; x--) {
                text.setText("" + x);
                try {
                    Thread.sleep(new Random().nextInt(200) + 1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (x == 9) {
                    x = 0;
                }
                tiempo += 20;
            }
        }
    }

    public void stopThread() {
        state = false;
    }
}

