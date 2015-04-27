import java.awt.*;
public class Crusader {
    static Point[] level;
    static Point[] treasure;
    public static void completeCrusade() {
        setupCrusade();
        for (int x = 0; x < 15; ++x) {
            startLevel(x);
            collectTreasure(x);
            if (x == 4 || x == 10) {
                dragScreen();
            }
        }
    }

    public static void dragScreen() {
        GameMouse.drag(700, 300, 100, 300);
        GameMouse.drag(700, 300, 100, 300);
    }

    public static void startLevel(int x) {
        GameMouse.click(level[x].x, level[x].y);
        CommonItems.acceptChallenger();
        CommonItems.acceptHeroesAndStart(45000);
        CommonItems.nextButton();
    }

    public static void collectTreasure(int x) {
        GameMouse.click(treasure[x].x, treasure[x].y);
        GameMouse.sleep(1500);
        if (x % 3 == 2) {
            CommonItems.hitLowerOK();
        } else {
            CommonItems.hitOK();
        }
    }

    public static void setupCrusade() {
        level = new Point[16];
        treasure = new Point[16];
        level[0] = new Point(160, 280);
        treasure[0] = new Point(125, 360);
        level[1] = new Point(230, 400);
        treasure[1] = new Point(375, 405);
        level[2] = new Point(400, 330);
        treasure[2] = new Point(435, 205);
        level[3] = new Point(580, 260);
        treasure[3] = new Point(515, 355);
        level[4] = new Point(600, 400);
        treasure[4] = new Point(745, 345);
        level[5] = new Point(170, 320);
        treasure[5] = new Point(250, 400);
        level[6] = new Point(380, 400);
        treasure[6] = new Point(350, 325);
        level[7] = new Point(310, 260);
        treasure[7] = new Point(400, 205);
        level[8] = new Point(500, 260);
        treasure[8] = new Point(500, 380);
        level[9] = new Point(620, 390);
        treasure[9] = new Point(660, 250);
        level[10] = new Point(750, 250);
        treasure[10] = new Point(745, 340);
        level[11] = new Point(320, 400);
        treasure[11] = new Point(415, 380);
        level[12] = new Point(440, 290);
        treasure[12] = new Point(490, 200);
        level[13] = new Point(630, 250);
        treasure[13] = new Point(610, 320);
        level[14] = new Point(540, 400);
        treasure[14] = new Point(690, 390);
    }
}