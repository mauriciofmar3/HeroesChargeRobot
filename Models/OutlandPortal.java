import java.awt.*;
import java.util.Arrays;
public class OutlandPortal {
    
    public static void startPortal() {
        // selectTrials();
        // int[] trials = trials();
        //     System.out.println("TRIALS " + Arrays.toString(trials));
        // for(int x = trials[0]; x < trials[1]; x++) {
            // startTrial(x);
            // TrialTask task = new TrialTask(x);
            // GameMouse.operationQueue.addTask(task);
            // Trials.pickDifficultyLevel(x);
            // CommonItems.raidAll();
            // GameMouse.hitEscape();
            // GameMouse.hitEscape();
            // GameMouse.hitEscape();
        // }
        System.out.println(OutlandPortal.getPortalString());
    }

    // public void start() {
    //     pickDifficultyLevel();
    //     // startLevel();
    //     // CommonItems.nextButton();
    //     // CommonItems.backButton();
    // }

    public static void selectTrials() {
        GameMouse.click(650, 270);
    }

    public static void pickDifficultyLevel(int trialNumber) {
        System.out.println("TRIAL NUMBER " + trialNumber);
        Point point = trialPoint(trialNumber);
        int[] difficulty = {4, 3, 4};
        GameMouse.click(point.x, point.y);
        CommonItems.pickDifficultyLevel(difficulty[trialNumber]);
    }

    public static Point trialPoint(int trialNumber) {
        Point[] point = new Point[3];
        point[0] = new Point(180, 280);
        point[1] = new Point(400, 280);
        point[2] = new Point(630, 280);
        return point[trialNumber];
    }
    
    // public void startLevel() {
    //     GameMouse.click(680, 430);
    //     CommonItems.acceptHeroesAndStart(levelTime);
    // }

    public static String getPortalString() {
        Tesseract.takeScreenshot(130, 410, 180, 27);
        GameMouse.sleep(2000);
        String result = Tesseract.parseScreenshotString();
        return result;
    }

    public static int[] getDifficulty(String portal) {
        if (portal.contains("Raged Blood")) {
            return null;
        }
        return null;

        // return new int[] {0, 3};
        // System.out.println("DAY OF THE WEEK" + GameMouse.dayOfWeek());
        // switch(GameMouse.dayOfWeek()) {
        //     case 0:
        //         return new int[] {0, 3};
        //     case 1:
        //         return new int[] {1, 2};
        //     case 2:
        //         return new int[] {0, 1};
        //     case 3:
        //         return new int[] {2, 3};
        //     case 4:
        //         return new int[] {1, 2};
        //     case 5:
        //         return new int[] {0, 1};
        //     case 6:
        //         return new int[] {2, 3};
        // }
        // return null;
    } 
}