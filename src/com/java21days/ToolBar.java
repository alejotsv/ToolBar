package com.java21days;

import javax.swing.*;

public class ToolBar extends JFrame {

    ToolBar(String title, String[] icons){
        super(title);
        JPanel panel = new JPanel();


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(panel);
        setVisible(true);
        pack();

    }
}
