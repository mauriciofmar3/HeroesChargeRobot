import java.awt.*;
public class CommonItems {
    public static void pickDifficultyLevel(int x) {
        Point[] point = new Point[6];
        point[0] = new Point(230, 260);
        point[1] = new Point(400, 260);
        point[2] = new Point(570, 260);
        point[3] = new Point(230, 411);
        point[4] = new Point(400, 411);
        point[5] = new Point(570, 411);
        GameMouse.click(point[x].x, point[x].y);
    }

    public static void acceptHeroesAndStart() {
        acceptHeroesAndStart(60000);
    }

    public static void hitOK() {
        GameMouse.click(400, 350);
    }

    public static void hitLowerOK() {
        GameMouse.click(400, 370);
    }

    public static void backButton() {
        GameMouse.click(70, 80);
    }

    public static void nextButton() {
        GameMouse.click(700, 440);
    }

    public static void failedButton() {
        GameMouse.click(685, 395);
    }

    public static void acceptHeroesAndStart(int throttleTime) {
        GameMouse.click(710, 460);
        GameMouse.click(740, 460);
        GameMouse.sleep(throttleTime);
    }

    public static void acceptChallenger() {
        GameMouse.click(590, 320);
    }
}