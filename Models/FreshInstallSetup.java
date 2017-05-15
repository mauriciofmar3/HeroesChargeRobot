import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class FreshInstallSetup {
    public static void simulateFreshSetup() {
        for (int x = 0;; ++x) {
            GameMouse.click(400, 480, 100);
            GameMouse.click(685, 435, 100);
            GameMouse.click(677, 137, 100);
            GameMouse.click(700, 290, 100);
            Point mousePoint = MouseInfo.getPointerInfo().getLocation();
            if (mousePoint.x != 700 || mousePoint.y != 290) {
                return;
            }
        }
    }
}