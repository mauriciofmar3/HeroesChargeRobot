import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class Emulator {
    public static void setupEmulator() {
        spotlight();
        GameMouse.type("andy");
        GameMouse.hitEnter();
        GameMouse.sleep(20000);
        GameMouse.drag(200, 30, 189, 30);
        GameMouse.drag(1256, 874, 800, 550);

        // GameMouse.drag(1439, 899, 800, 550);
        GameMouse.drag(580, 291, 200, 291);
        GameMouse.click(45, 155);
        GameMouse.sleep(30000);
    }

    public static void spotlight() {
        GameMouse.click(1375, 10);
    }
}