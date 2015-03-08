package com.b4sunrise;

import javax.swing.*;

/**
 * @author Mehdi Afsari Kashi
 * @version 1.0.0
 *          <p/>
 *          Creation Date:  2015/03/08
 * @since 1.0.0
 */
public class Launcher {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Exercise1 exercise1 = new Exercise1();
            }
        });
    }
}
