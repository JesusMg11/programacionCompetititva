package pacman;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

public class Panel extends javax.swing.JPanel {

    boolean arriba = false, abajo = false, derecha = true, izquierda = false, turbo = false;
    boolean farriba = false, fabajo = true, fderecha = false, fizquierda = false;
    int boca = 250;
    int fx = 50, fy = 50;
    boolean comida1 = false;
    int x = 11, y = 11, ori = 35, hil = 3;

    public Panel() {
        initComponents();
    }

    public Panel(int a, int b) {
        initComponents();
        setSize(600, 600);
        Hilo.start();
        Hilo2.start();
        Hilofantasma.start();
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 600, 600);

        g.setColor(Color.GREEN);
        g.fillRect(0, 0, 600, 10);
        g.fillRect(0, 0, 10, 600);
        g.fillRect(584, 0, 10, 600);
        g.fillRect(0, 562, 600, 10);

        g.fillRect(90, 60, 10, 150);
        g.fillRect(170, 60, 10, 150);
        g.fillRect(250, 60, 10, 150);
        g.fillRect(330, 60, 10, 150);
        g.fillRect(410, 60, 10, 150);
        g.fillRect(490, 60, 10, 150);

        g.fillRect(90, 340, 10, 150);
        g.fillRect(170, 340, 10, 150);
        g.fillRect(250, 340, 10, 150);
        g.fillRect(330, 340, 10, 150);
        g.fillRect(410, 340, 10, 150);
        g.fillRect(490, 340, 10, 150);

        g.fillRect(0, 270, 150, 10);
        g.fillRect(450, 270, 150, 10);

        g.setColor(Color.YELLOW);
        g.fillArc(x, y, 30, 30, ori, boca);

        if (comida1 == false) {
            g.setColor(Color.BLUE);
            g.fillArc(fx, fy, 30, 30, 0, 360);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 205, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 173, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    Thread Hilo = new Thread() {
        public void run() {
            try {
                while (true) {
                    boca++;
                    if (boca == 380) {
                        boca = 250;
                    }
                    pintar();
                    bordes();
                    obstaculos();
                    morir();
                    if (comida1 == false) {
                        favanzar();
                        fbordes();
                        fobstaculos();
                    }
                    sleep(2);
                }
            } catch (Exception ex) {
            }
        }
    };
    Thread Hilofantasma = new Thread() {
        public void run() {
            try {
                while (true) {
                    direcciones();
                    Thread.sleep(2000);
                }
            } catch (Exception e) {;
            }
        }
    };

    Thread Hilo2 = new Thread() {
        public void run() {
            try {
                while (true) {
                    avanzar();
                    orientacion();
                    sleep(hil);
                }
            } catch (Exception ex) {
            }
        }
    };

    public void pintar() {
        super.repaint();
    }

    public void avanzar() {
        if (arriba) {
            y -= 1;
        }
        if (derecha) {
            x += 1;
        }
        if (abajo) {
            y += 1;
        }
        if (izquierda) {
            x -= 1;

        }

        super.repaint();
    }

    public void favanzar() {
        if (farriba) {
            fy -= 1;
        }
        if (fderecha) {
            fx += 1;
        }
        if (fabajo) {
            fy += 1;
        }
        if (fizquierda) {
            fx -= 1;
        }
        super.repaint();
    }

    public void limpiar() {
        derecha = false;
        izquierda = false;
        arriba = false;
        abajo = false;
    }

    public void bordes() {
        boolean s = false;
        if (x <= 10) {
            x = 12;
            s = true;
        }
        if (y <= 10) {
            y = 12;
            s = true;
        }
        if (x >= 554) {
            x = 552;
            s = true;
        }
        if (y >= 532) {
            y = 530;
            s = true;
        }

        if (s == true) {
            limpiar();
        }
    }

    public void fbordes() {
        boolean s = false;
        if (fx <= 10) {
            fx = 12;
            s = true;
        }
        if (fy <= 10) {
            fy = 12;
            s = true;
        }
        if (fx >= 554) {
            fx = 552;
            s = true;
        }
        if (fy >= 532) {
            fy = 530;
            s = true;
        }

        if (s == true) {
            direcciones();
        }
    }

    public void orientacion() {
        if (derecha) {
            ori = 35;
        }
        if (arriba) {
            ori = 110;
        }
        if (izquierda) {
            ori = 195;
        }
        if (abajo) {
            ori = 285;
        }
        pintar();
    }

    public void velocidad() {
        if (turbo == true) {
            hil = 3;
            turbo = false;
        } else {
            //hil=1;
            hil = 3;
            turbo = true;
        }

    }

    public void obstaculos() {
        if (y >= 30 && y <= 210) {
            boolean s = false;
            if (x >= 60 && x <= 100) {
                s = true;
            }
            if (x >= 140 && x <= 180) {
                s = true;
            }
            if (x >= 220 && x <= 260) {
                s = true;
            }
            if (x >= 300 && x <= 340) {
                s = true;
            }
            if (x >= 380 && x <= 420) {
                s = true;
            }
            if (x >= 460 && x <= 500) {
                s = true;
            }
            if (s) {
                if (derecha) {
                    x -= 1;
                }
                if (izquierda) {
                    x += 1;
                }
                if (abajo) {
                    y -= 1;
                }
                if (arriba) {
                    y += 1;
                }
                limpiar();
            }

        }

        if (y >= 310 && y <= 490) {
            boolean s = false;
            if (x >= 60 && x <= 100) {
                s = true;
            }
            if (x >= 140 && x <= 180) {
                s = true;
            }
            if (x >= 220 && x <= 260) {
                s = true;
            }
            if (x >= 300 && x <= 340) {
                s = true;
            }
            if (x >= 380 && x <= 420) {
                s = true;
            }
            if (x >= 460 && x <= 500) {
                s = true;
            }
            if (s) {
                if (derecha) {
                    x -= 1;
                }
                if (izquierda) {
                    x += 1;
                }
                if (abajo) {
                    y -= 1;
                }
                if (arriba) {
                    y += 1;
                }
                limpiar();
            }
        }
        if (y >= 240 && y <= 280) {
            boolean s = false;
            if (x < 150) {
                s = true;
            }
            if (x > 420) {
                s = true;
            }
            if (s) {
                if (derecha) {
                    x -= 1;
                }
                if (izquierda) {
                    x += 1;
                }
                if (abajo) {
                    y -= 1;
                }
                if (arriba) {
                    y += 1;
                }
                limpiar();
            }

        }

    }

    public void direcciones() {
        fderecha = false;
        fizquierda = false;
        farriba = false;
        fabajo = false;
        int n = (int) (Math.random() * 4) + 1;
        switch (n) {
            case 1:
                fderecha = true;
                break;
            case 2:
                fizquierda = true;
                break;
            case 3:
                farriba = true;
                break;
            case 4:
                fabajo = true;
                break;
        }
    }

    public void fobstaculos() {
        if (fy >= 30 && fy <= 210) {
            boolean s = false;
            if (fx >= 60 && fx <= 100) {
                s = true;
            }
            if (fx >= 140 && fx <= 180) {
                s = true;
            }
            if (fx >= 220 && fx <= 260) {
                s = true;
            }
            if (fx >= 300 && fx <= 340) {
                s = true;
            }
            if (fx >= 380 && fx <= 420) {
                s = true;
            }
            if (fx >= 460 && fx <= 500) {
                s = true;
            }
            if (s) {
                if (fderecha) {
                    fx -= 1;
                }
                if (fizquierda) {
                    fx += 1;
                }
                if (abajo) {
                    fy -= 1;
                }
                if (arriba) {
                    fy += 1;
                }
                direcciones();
            }

        }

        if (fy >= 310 && fy <= 490) {
            boolean s = false;
            if (fx >= 60 && fx <= 100) {
                s = true;
            }
            if (fx >= 140 && fx <= 180) {
                s = true;
            }
            if (fx >= 220 && fx <= 260) {
                s = true;
            }
            if (fx >= 300 && fx <= 340) {
                s = true;
            }
            if (fx >= 380 && fx <= 420) {
                s = true;
            }
            if (fx >= 460 && fx <= 500) {
                s = true;
            }
            if (s) {
                if (fderecha) {
                    fx -= 1;
                }
                if (fizquierda) {
                    fx += 1;
                }
                if (fabajo) {
                    fy -= 1;
                }
                if (farriba) {
                    fy += 1;
                }
                direcciones();
            }
        }
        if (fy >= 240 && fy <= 280) {
            boolean s = false;
            if (fx < 150) {
                s = true;
            }
            if (fx > 420) {
                s = true;
            }
            if (s) {
                if (fderecha) {
                    fx -= 1;
                }
                if (fizquierda) {
                    fx += 1;
                }
                if (fabajo) {
                    fy -= 1;
                }
                if (farriba) {
                    fy += 1;
                }
                direcciones();
            }

        }

    }

    public void morir() {
        if (comida1 == false) {
            if (x >= fx - 30 && x <= fx + 5) {
                if (y >= fy - 30 && y <= fy + 5) {
                    x = 11;
                    y = 11;
                    limpiar();
                    derecha = true;
                    comida1 = true;
                }
            }
        }else{
            JOptionPane.showMessageDialog(this, "YA GANASTE");
            System.exit(0);
        }
    }
}
