package com.b4sunrise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Mehdi Afsari Kashi
 * @version 1.0.0
 *
 *          Creation Date:  2015/03/08
 * @since 1.0.0
 */
public class Exercise1 extends JFrame {

    private TextPanel textPanel;
    private JButton jButton;


    public Exercise1(){
        initComponent();
    }

    public void initComponent(){
        textPanel = new TextPanel();
        jButton = new JButton("Click Me");
        setLayout(new BorderLayout());
        add(jButton, BorderLayout.SOUTH);
        add(textPanel, BorderLayout.CENTER);

        setTitle("Hello World");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(500, 500));

        setVisible(true);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               textPanel.appendText("Hello\n");
            }
        });
    }

}
