import java.awt.*;
public class TrialTask extends Task {
	public int trialNumber;
	public int levelTime = 200000;
	public TrialTask(int trialNumber) {
		this.trialNumber = trialNumber;
	}

    public void start() {
    	selectTrials();
    	pickDifficultyLevel();
        startLevel();
        CommonItems.nextButton();
        CommonItems.backButton();
    }

	public void selectTrials() {
		GameMouse.click(650, 270);
	}

	public void pickDifficultyLevel() {
    	Point point = trialPoint();
        int[] difficulty = {5, 5, 5};
        GameMouse.click(point.x, point.y);
        CommonItems.pickDifficultyLevel(difficulty[trialNumber]);
	}

    public Point trialPoint() {
        Point[] point = new Point[3];
        point[0] = new Point(180, 280);
        point[1] = new Point(400, 280);
        point[2] = new Point(630, 280);
    	return point[trialNumber];
    }
    
    public void startLevel() {
        GameMouse.click(680, 430);
        CommonItems.acceptHeroesAndStart(levelTime);
    }
}