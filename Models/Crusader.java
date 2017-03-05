import java.awt.*;
public class Crusader {
    static Point[] level;
    static Point[] treasure;
    public static void completeCrusade(int startingLevel) {
        setupCrusade();
        for (int x = startingLevel; x < 15; ++x) {
            FightStatus status = startLevel(x);
            if (status == FightStatus.LOST) {
                break;
            }
            collectTreasure(x);
        }
    }

    public static void dragScreen() {
        GameMouse.drag(700, 300, 100, 300);
        GameMouse.drag(700, 300, 100, 300);
    }

    public static FightStatus startLevel(int x) {
        GameMouse.click(level[x].x, level[x].y);
        CommonItems.acceptChallenger();
        FightStatus status = CommonItems.acceptHeroesStartAutofight();
        CommonItems.nextButton();
        return status;
    }

    public static void collectTreasure(int x) {
        GameMouse.click(treasure[x].x, treasure[x].y);
        GameMouse.hitEscape();
    }

    public static void setupCrusade() {
        level = new Point[16];
        treasure = new Point[16];
        level[0] = new Point(256, 211);
        treasure[0] = new Point(145, 323);
        level[1] = new Point(240, 392);
        treasure[1] = new Point(405, 405);
        level[2] = new Point(585, 349);
        treasure[2] = new Point(401, 393);
        level[3] = new Point(524, 396);
        treasure[3] = new Point(400, 323);
        level[4] = new Point(407, 239);
        treasure[4] = new Point(400, 173);
        level[5] = new Point(771, 185);
        treasure[5] = new Point(400, 200);
        level[6] = new Point(450, 310);
        treasure[6] = new Point(400, 400);
        level[7] = new Point(550, 400);
        treasure[7] = new Point(400, 400);
        level[8] = new Point(580, 360);
        treasure[8] = new Point(400, 340);
        level[9] = new Point(275, 300);
        treasure[9] = new Point(396, 244);
        level[10] = new Point(360, 177);
        treasure[10] = new Point(400, 178);
        level[11] = new Point(613, 210);
        treasure[11] = new Point(400, 223);
        level[12] = new Point(550, 260);
        treasure[12] = new Point(400, 330);
        level[13] = new Point(355, 410);
        treasure[13] = new Point(475, 430);
        level[14] = new Point(625, 415);
        treasure[14] = new Point(625, 240);
    }
}