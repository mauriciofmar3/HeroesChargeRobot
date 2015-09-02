import java.awt.*;
public class Trials {
	public static void selectTrials() {
		GameMouse.click(650, 270);
	}
    
    public static void startAllTrials() {
    	selectTrials();
        int[] trials = trials();
        for(int x = trials[0]; x < trials[1]; x++) {
            startTrial(x);
        }
        CommonItems.backButton();
    }

    public static void startTrial(int x) {
        Point[] point = new Point[3];
        point[0] = new Point(180, 280);
        point[1] = new Point(400, 280);
        point[2] = new Point(630, 280);
        int[] difficulty = {5, 5, 5};
        GameMouse.click(point[x].x, point[x].y);
        CommonItems.pickDifficultyLevel(difficulty[x]);
        startLevel();
        CommonItems.nextButton();
    }
    
    public static void startLevel() {
        GameMouse.click(680, 430);
        CommonItems.acceptHeroesAndStart(200000);
    }

    public static int[] trials() {
        // return new int[] {0, 3};
        switch(GameMouse.dayOfWeek()) {
            case 0:
                return new int[] {0, 3};
            case 1:
                return new int[] {1, 2};
            case 2:
                return new int[] {2, 3};
            case 3:
                return new int[] {0, 1};
            case 4:
                return new int[] {1, 2};
            case 5:
                return new int[] {2, 3};
            case 6:
                return new int[] {0, 1};
        }
        return null;
    } 
}