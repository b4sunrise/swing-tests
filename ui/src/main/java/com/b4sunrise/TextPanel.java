package com.b4sunrise;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * @author Mehdi Afsari Kashi
 * @version 1.0.0
 *          <p/>
 *          Creation Date:  2015/03/08
 * @since 1.0.0
 */
public class TextPanel extends JPanel {

    private JTextArea jTextArea;

    public TextPanel(){
        jTextArea = new JTextArea();
        setLayout(new BorderLayout());
        add(new JScrollPane(jTextArea), BorderLayout.CENTER);

    }


    public void appendText(String text){
        jTextArea.append(text);
    }

}
