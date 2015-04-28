import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class Robot {
    public static void main(String args[]) {
        GameMouse.click(380, 180);
        // setupEmulator();
        // GameMouse.sleep(1000);
        doDailyEvents();
        // redoLevel(14);
        // Crusader.completeCrusade();
        // Chests.tryBronzeSeconds(100);

    }
    
    public static void setupEmulator() {
        // spotlight();
        // GameMouse.type("andy");
        // GameMouse.hitEnter();
        // GameMouse.sleep(20000);

        GameMouse.drag(1439, 899, 800, 550);
        GameMouse.drag(580, 291, 200, 291);
        GameMouse.click(45, 140);
        GameMouse.sleep(30000);
    }

    public static void spotlight() {
        GameMouse.click(1375, 10);
    }
    
    public static void redoLevel(int repeat) {
        for(int x = 0; x < repeat; ++x) {
            redoLevel();
        }
        CommonItems.backButton();
        CommonItems.backButton();
    }
    
    public static void startLevel() {
        GameMouse.click(640, 320);
        GameMouse.click(640, 320);
        CommonItems.acceptHeroesAndStart();
    }
    
    public static void redoLevel() {
        GameMouse.click(380, 180);
        GameMouse.click(710, 200);
        GameMouse.click(710, 200);
        CommonItems.nextButton();
        CommonItems.acceptHeroesAndStart(100000);
    }
    
    /*********** DAILY EVENTS ***********/
    
    public static void doDailyEvents()  {
        collectMidas();
        for (int x = 0; x < 5; ++x) {
            Chests.getFreeChest();
            Trials.startAllTrials();
            if (x < 3) {
                Arena.fightArena();
                if (x < 2) {
                    TimeRift.startAllTrials();
                }
            }
            GameMouse.sleep(300000);
        }
        Crusader.completeCrusade();
    }
    
    public static void collectMidas()  {
        GameMouse.click(180, 70);
        GameMouse.click(400, 300);
        // GameMouse.click X
        GameMouse.click(600, 110);
    }
}