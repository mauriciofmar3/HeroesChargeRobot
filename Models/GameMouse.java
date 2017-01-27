import java.util.*;
import java.awt.Robot;
import java.awt.event.*;
import java.awt.*;

public class GameMouse {
    public static OperationQueue operationQueue;
    static {
        operationQueue = new OperationQueue();
    }

    public static void click(int x, int y) {
        click(x, y, 2500);
    }

    public static void click(int x, int y, int sleep) {
        try {
            Robot bot = new Robot();
            bot.mouseMove(x, y);
            bot.mousePress(InputEvent.getMaskForButton(1));
            bot.mouseRelease(InputEvent.getMaskForButton(1));
            Thread.sleep(sleep);
        } catch (Exception e) { }
    }

    public static void drag(int x1, int y1, int x2, int y2) {
        drag(x1, y1, x2, y2, 1000);
    }

    public static void drag(int x1, int y1, int x2, int y2, int sleepTime) {
        try {
            Robot bot = new Robot();
            bot.mouseMove(x1, y1);
            Thread.sleep(sleepTime);
            bot.mousePress(InputEvent.getMaskForButton(1));
            Thread.sleep(sleepTime);
            bot.mouseMove(x2, y2);
            Thread.sleep(sleepTime);
            bot.mouseRelease(InputEvent.getMaskForButton(1));
            Thread.sleep(1500);
        } catch (Exception e) { }
    }

    public static void clickSimulator() {
        click(40, 510, 750);
    }
    
    public static void clickToGetFocus() {
        GameMouse.click(500, 500);
    }

    public static void sleep(int sleepTime) {
        try {
            Thread.sleep(sleepTime);
            // if (sleepTime > 2100) {
            //     clickSimulator();
            // }
        } catch (Exception e) { }
    }

    public static void type(String s) {
        try {
            Robot bot = new Robot();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isUpperCase(c)) {
                    bot.keyPress(KeyEvent.VK_SHIFT);
                }
                bot.keyPress(Character.toUpperCase(c));
                bot.keyRelease(Character.toUpperCase(c));

                if (Character.isUpperCase(c)) {
                    bot.keyRelease(KeyEvent.VK_SHIFT);
                }
            }
            sleep(1000);
        } catch (Exception e) { }
    }

    public static void hitEnter() {
        try {
            Robot bot = new Robot();
            bot.keyPress(KeyEvent.VK_ENTER);
            bot.keyRelease(KeyEvent.VK_ENTER);
        } catch (Exception e) { }
    }


    public static int dayOfWeek() {
        final Calendar c = Calendar.getInstance();
        return c.get(Calendar.DAY_OF_WEEK) - 1;
    }

    public static void addTask(Task task) {
        operationQueue.addTask(task);
    }

    public static int[] getMousePosition() {
        Point point = MouseInfo.getPointerInfo().getLocation();
        int[] ret = new int[2];
        ret[0] = point.x;
        ret[1] = point.y;
        return ret;
    }

    public static void closeProgram() {
        AndySetup.closeAndy();
        System.exit(0);
    }
}