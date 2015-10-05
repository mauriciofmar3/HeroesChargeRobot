import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class DailyEvents {    
    public static void doDailyEvents()  {
        collectMidas();
        for (int x = 0; x < 5; ++x) {
            Chests.getFreeChest();
            if (x < 2) {
                TimeRift.startAllTrials();
            }
            if (x < 3) {
                Arena.fightArena();
            }
            Trials.startAllTrials();
            if (x < 5) {
                GameMouse.sleep(200000);
            }
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