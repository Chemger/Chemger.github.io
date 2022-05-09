package com.chemger.gui;

import java.awt.*;

public class TestFrame {

    public static void main(String[] args) {

        Frame frame = new Frame("new window");
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setBackground(Color.LIGHT_GRAY);
        frame.setLocation(200,200);
        frame.setResizable(false);
    }

}
