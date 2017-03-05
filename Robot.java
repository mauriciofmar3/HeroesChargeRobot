import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Robot {
    public static void main(String args[]) {
        startGUI();
    }

    public static void startGUI() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // @SuppressWarnings("unused")
                Robot robot = new Robot();
            }
        });
    }
    
    public Robot() {
        RobotGUI gui = new RobotGUI();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.requestFocusInWindow();
        gui.requestFocus();
    }
}
