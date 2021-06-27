package org.TugasUAS;
import javax.swing.*;

public class RunFormQueue {

        public static void main(String[] args) {
            JFrame jFrame = new JFrame("Form Aplikasi Antrian");
            jFrame.setContentPane(new FormQueue().getRootPanel());
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.setLocationRelativeTo(null);
            jFrame.setSize(500, 400);
            jFrame.setVisible(true);
        }
    }

