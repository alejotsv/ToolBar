package com.java21days;

import javax.swing.*;
import java.awt.*;

public class ToolBar extends JFrame {
    Dimension dim = new Dimension(300, 300);

    ToolBar(String title, String[] icons){
        super(title);
        JPanel panel = new JPanel();
        setSize(dim);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(panel);
        setVisible(true);

    }
}
