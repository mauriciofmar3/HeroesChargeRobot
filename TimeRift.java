import java.awt.*;
public class TimeRift {
	public static void selectTrials() {
		GameMouse.click(300, 240);
	}
    
    public static void startAllTrials() {
    	selectTrials();
        for(int x = 0; x < 2; x++) {
            startTrial(x);
        }
        CommonItems.backButton();
    }

    public static void startTrial(int x) {
        Point[] point = new Point[2];
        point[0] = new Point(200, 300);
        point[1] = new Point(600, 300);
        int[] difficulty = {4, 4};
        GameMouse.click(point[x].x, point[x].y);
        CommonItems.pickDifficultyLevel(difficulty[x]);
        startLevel();
        CommonItems.nextButton();
    }
    
    public static void startLevel() {
        GameMouse.click(680, 430);
        CommonItems.acceptHeroesAndStart(80000);
    }
}