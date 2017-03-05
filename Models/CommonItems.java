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

    public static void nextButton() {
        GameMouse.click(689, 431);
    }

    public static void failedButton() {
        GameMouse.click(685, 395);
    }

    public static FightStatus acceptHeroesStartAutofight() {
        GameMouse.click(670, 470);
        GameMouse.sleep(2500);
        autoFight();
        return waitUntilFightDone();
    }

    public static FightStatus acceptHeroesAndStart() {
        GameMouse.click(670, 470);
        return waitUntilFightDone();
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

    public static void raidAll() {
        GameMouse.click(666, 250);
    }

    public static void clickTeamPreset() {
        GameMouse.click(660, 100);
    }

    public static void clickUsePreset() {
        GameMouse.click(660, 180);
    }

    public static void goToNextPreset() {
        GameMouse.mouseWheel(700, 135, true, new GameMouseWheelListener() {
            public boolean shouldKeepScrolling() {
                Color color = GameMouse.getPixelColor(700, 135);
                return color.getRed() > 100;
            }
        });
        GameMouse.mouseWheel(700, 135, true, new GameMouseWheelListener() {
            public boolean shouldKeepScrolling() {
                Color color = GameMouse.getPixelColor(700, 135);
                return color.getRed() < 100;
            }
        });
    }

    public static FightStatus waitUntilFightDone() {
        for(;;) {
            FightStatus fightStatus = fightDone();
            if (fightStatus == FightStatus.WON || fightStatus == FightStatus.LOST) {
                return fightStatus;
            }
        }
    }

    public static FightStatus fightDone() {
        boolean won = checkFightStatus(535, 225, 60, 25);
        if (won) {
            // System.out.println("won " + won);
            return FightStatus.WON;
        }
        boolean lost = checkFightStatus(690, 215, 60, 25);
        // System.out.println("lost " + lost);
        return lost ? FightStatus.LOST : FightStatus.FIGHTING;
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