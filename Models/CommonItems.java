import java.awt.*;
public class CommonItems {
    public static void pickDifficultyLevel(int x) {
        Point[] point = new Point[6];
        point[0] = new Point(200, 250);
        point[1] = new Point(400, 260);
        point[2] = new Point(600, 260);
        point[3] = new Point(200, 400);
        point[4] = new Point(400, 400);
        point[5] = new Point(600, 400);
        GameMouse.click(point[x].x, point[x].y);
    }

    public static void acceptHeroesAndStart() {
        acceptHeroesAndStart(27000);
    }

    public static void hitOK() {
        GameMouse.click(400, 377);
    }

    public static void hitLowerOK() {
        GameMouse.click(400, 421);
    }

    public static void backButton() {
        GameMouse.click(70, 80);
    }

    public static void nextButton() {
        GameMouse.click(689, 431);
    }

    public static void failedButton() {
        GameMouse.click(685, 395);
    }

    public static void acceptHeroesStartAutofight(int throttleTime) {
        GameMouse.click(670, 470);
        GameMouse.sleep(2500);
        autoFight();
        // GameMouse.sleep(throttleTime);
        waitUntilFightDone();
    }

    public static void acceptHeroesAndStart(int throttleTime) {
        GameMouse.click(670, 470);
        // GameMouse.sleep(4000);
        // GameMouse.click(740, 460);
        // GameMouse.sleep(th/rottleTime);
        waitUntilFightDone();
    }

    public static void acceptChallenger() {
        GameMouse.click(408, 372);
    }

    public static void autoFight() {
        GameMouse.click(750, 490);
    }

    public static void startLevel() {
        GameMouse.click(660, 440);
        CommonItems.acceptHeroesAndStart();
    }
    
    public static void redoLevel() {
        GameMouse.click(700, 300);
        startLevel();
    }

    public static void redoLevel(int repeat) {
        for(int x = 0; x < repeat; ++x) {
            redoLevel();
        }
    }

    public static void waitUntilFightDone() {
        for(;;) {
            if (fightDone()) {
                return;
            }
        }
    }

    public static boolean fightDone() {
        boolean won = checkFightStatus(535, 225, 60, 25);
        if (won) {
            System.out.println("won " + won);
            return true;
        }
        boolean lost = checkFightStatus(690, 215, 60, 25);
        System.out.println("lost " + lost);
        return lost;
    }

    public static boolean checkFightStatus(int x, int y, int width, int height) {
        Tesseract.takeScreenshot(x, y, width, height);
        
        GameMouse.sleep(2000);
        String result = Tesseract.parseScreenshotString();
        // if (result.length() >= 2) {
        //     result = result.substring(0, result.length() - 2);
        // }
        System.out.println("RESULT " + result);
        return result.contains("Stats");
    }
}