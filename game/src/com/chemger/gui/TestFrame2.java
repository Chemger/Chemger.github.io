package com.chemger.gui;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFrame2 {



    public static void main(String[] args) {
        MyFrame frame1 = new MyFrame(100, 100, 600, 400, Color.cyan);

        frame1.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

        frame1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                MyFrame1 frame = (MyFrame1) e.getSource();
                Point point = new Point(e.getPoint());
            }
        });
    }

}

class MyFrame extends Frame{
    static int id = 0;
    public MyFrame(int x, int y, int width, int height, Color color){
        super("MyFrame" +(++id));
        setBackground(color);
        setBounds(x,y,width,height);
        setVisible(true);
    }

}