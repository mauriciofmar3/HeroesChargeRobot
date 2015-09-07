import java.awt.*;
public class Trials {
    
    public static void startAllTrials() {
        int[] trials = trials();
        for(int x = trials[0]; x < trials[1]; x++) {
            // startTrial(x);
            TrialTask task = new TrialTask(x);
            GameMouse.operationQueue.addTask(task);
        }
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