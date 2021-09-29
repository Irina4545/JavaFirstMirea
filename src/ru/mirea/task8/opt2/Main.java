package ru.mirea.task8.opt2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main extends JComponent implements KeyListener, ActionListener{

    Image space=new ImageIcon("src/image/space.jpg").getImage();
    public void paint(Graphics g){
        Graphics2D gr=(Graphics2D)g;
        gr.drawImage(space,0,0,null);
    }
    public static void main(String[] args)
    {
        Main t=new Main();
        JFrame f=new JFrame("Космическое окно");
        f.setSize(500,500);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.addKeyListener(t);
        f.add(new Main());
        f.add(t);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {}

    public void keyTyped(KeyEvent e) {}

    public void keyPressed(KeyEvent e) {}

    public void keyReleased(KeyEvent e) {}
}
