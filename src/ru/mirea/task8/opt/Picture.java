package ru.mirea.task8.opt;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Picture extends JPanel {

    private static final int HEIGHT = 595;
    private static final int WIDTH = 280;

    private JFrame frame;
    private Timer timer;
    private Image image;

    public Picture() {
        frame = new JFrame("New animation window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.add(this);
        frame.setVisible(true);
        count = 0;
        timer = new Timer();
        timer.schedule(animate, 1,200);
    }

    private int count;
    TimerTask animate = new TimerTask() {

        @Override
        public void run() {
            switch (count) {
                case 0:
                    image = new ImageIcon("src/image/step1.jpg").getImage();
                    break;
                case 1:
                    image = new ImageIcon("src/image/step2.jpg").getImage();
                    break;
                case 2:
                    image = new ImageIcon("src/image/step3.jpg").getImage();
                    break;
                default:
                    break;
            }
            count++;
            if (count == 4) {
                count = 0;
            }
            repaint();
        }
    };

    public void paint(Graphics canvas) {
        canvas.drawImage(image, 0, 0,  null);
    }

    public static void main(String[] args) {
        new Picture();
    }
}