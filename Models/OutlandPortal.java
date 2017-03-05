import java.awt.*;
import java.util.Arrays;
public class OutlandPortal {
    
    public static boolean startPortal() {
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
        String portalString = OutlandPortal.getPortalString();
        System.out.println(portalString);
        int difficultyLevel = getDifficulty(portalString);
        if (difficultyLevel < 0) {
            return false;
        }
        // click today's portal
        GameMouse.click(230, 290);
        CommonItems.pickDifficultyLevel(difficultyLevel);
        CommonItems.raidAll();
        GameMouse.hitEscape();
        GameMouse.hitEscape();
        GameMouse.hitEscape();
        return true;
    }    

    public static String getPortalString() {
        Tesseract.takeScreenshot(130, 410, 180, 27);
        GameMouse.sleep(2000);
        String result = Tesseract.parseScreenshotString();
        return result;
    }

    public static int getDifficulty(String portal) {
        if (portal.contains("Raged Blood")) {
            return -1;
        } else if (portal.contains("Burning") || portal.contains("Phoenix")) {
            return 4;
        } else if (portal.contains("Lord") || portal.contains("Caves")) {
            return 2;
        } else if (portal.contains("Robot") || portal.contains("Fighter")) {
            return 4;
        }
        return -1;
    } 
}