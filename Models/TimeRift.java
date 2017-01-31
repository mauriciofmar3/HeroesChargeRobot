import java.awt.*;
public class TimeRift {
	public static void selectTrials() {
		GameMouse.click(300, 240);
	}
    
    public static void startAllTrials() {
    	// selectTrials();
        int[] trials = trials();
        for(int x = trials[0]; x < trials[1]; x++) {
            startTrial(x);
        }
        // CommonItems.backButton();
    }

    public static void startTrial(int x) {
        Point[] point = new Point[2];
        point[0] = new Point(250, 300);
        point[1] = new Point(560, 300);
        int[] difficulty = {3, 4};
        GameMouse.click(point[x].x, point[x].y);
        CommonItems.pickDifficultyLevel(difficulty[x]);
        TimeRift.clickRaidAll();
        GameMouse.hitEscape();
        GameMouse.hitEscape();
        GameMouse.hitEscape();

        // startLevel();
        // CommonItems.nextButton();
    }

    public static void clickRaidAll() {
        GameMouse.click(666, 250);
    }
    
    public static void startLevel() {
        GameMouse.click(680, 430);
        CommonItems.acceptHeroesAndStart(200000);
    }

    public static int[] trials() {
        // return new int[] {0, 2};
        switch(GameMouse.dayOfWeek()) {
            case 0:
                return new int[] {0, 2};
            case 1:
                return new int[] {0, 1};
            case 2:
                return new int[] {1, 2};
            case 3:
                return new int[] {0, 1};
            case 4:
                return new int[] {1, 2};
            case 5:
                return new int[] {0, 1};
            case 6:
                return new int[] {1, 2};
        }
        return null;
    } 
}