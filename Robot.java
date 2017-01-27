import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Robot {
    public static void main(String args[]) {
        // AndySetup.setupEmulator();


        // clickToGetFocus();
        // startLevel();
        // redoLevel(67);

        startGUI();






        // System.out.println(args);
        // int seconds = Integer.parseInt(args[0]);
        // int repetitions = seconds * 50;
        // for (int x = 0; x < repetitions; ++x) {
        //   GameMouse.click(300, 300, 50);
        //  if (x % 20 == 0) {
           // GameMouse.click(100, 550, 20) ;
        //  } 
        // }
        // GameMouse.click(380, 180);
        //GameMouse.clickSimulator();
        // setupEmulator();
        // GameMouse.sleep(1000);
        // doDailyEvents();
        // redoLevel(15);
        // Crusader.completeCrusade();
        // Chests.tryBronzeSeconds(100);
        // GameMouse.dayOfWeek();
        //startOperationQueue();
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

    
    // public static void startOperationQueue() {
    //     Trials.startAllTrials();
    //     GameMouse.operationQueue.start();
    // }
    
    
    /*********** DAILY EVENTS ***********/
    
    // public static void doDailyEvents()  {
    //     // collectMidas();
    //     for (int x = 0; x < 5; ++x) {
    //         Chests.getFreeChest();
    //         if (x < 2) {
    //             TimeRift.startAllTrials();
    //         }
    //         // if (x < 3) {
    //         //     Arena.fightArena();
    //         // }
    //         Trials.startAllTrials();
    //         // if (x < 5) {
    //         //     GameMouse.sleep(200000);
    //         // }
    //     }
    //     Crusader.completeCrusade();
    // }
    
    // public static void collectMidas()  {
    //     GameMouse.click(180, 70);
    //     GameMouse.click(400, 300);
    //     // GameMouse.click X
    //     GameMouse.click(600, 110);
    // }
}
