import java.awt.*;
public class Trials {
	public static void selectTrials() {
		GameMouse.click(650, 270);
	}
    
    public static void startAllTrials() {
    	selectTrials();
        for(int x = 0; x < 3; x++) {
            startTrial(x);
        }
        CommonItems.backButton();
    }

    public static void startTrial(int x) {
        Point[] point = new Point[3];
        point[0] = new Point(180, 280);
        point[1] = new Point(400, 280);
        point[2] = new Point(630, 280);
        int[] difficulty = {3, 4, 3};
        GameMouse.click(point[x].x, point[x].y);
        CommonItems.pickDifficultyLevel(difficulty[x]);
        startLevel();
        CommonItems.nextButton();
    }
    
    public static void startLevel() {
        GameMouse.click(680, 430);
        CommonItems.acceptHeroesAndStart(100000);
    }
}