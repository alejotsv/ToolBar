package com.java21days;

import javax.swing.*;
import java.awt.*;

public class ToolBar extends JFrame {
    Dimension dim = new Dimension(300, 300);

    ToolBar(String title, String[] icons){
        super(title);
        JPanel panel = new JPanel();
        setSize(dim);
        JTextArea textArea = new JTextArea(10, 40);
        JScrollPane scrollPane = new JScrollPane(
                textArea,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED
        );
        panel.add(scrollPane);

        JToolBar toolBar = new JToolBar();
        JButton[] buttons = createButtons(icons);
        addButtonsToToolBar(toolBar, buttons);
        panel.add(toolBar);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(panel);
        setVisible(true);
        pack();
    }

    JButton[] createButtons(String[] icons){
        JButton[] buttons = new JButton[icons.length];
        for(int i=0; i<icons.length; i++){
            ImageIcon icon = new ImageIcon(getClass().getResource("res/" + icons[i]));
            String text = icons[i].split("\\.")[0];
            String finalText= text.replaceFirst(text.substring(0,1), text.substring(0,1).toUpperCase());
            JButton btn = new JButton(finalText, icon);
            buttons[i] = btn;
        }
        return buttons;
    }

    void addButtonsToToolBar(JToolBar toolBar, JButton[] buttons){
        for(int i=0; i<buttons.length; i++){
            toolBar.add(buttons[i]);
        }
    }

}
