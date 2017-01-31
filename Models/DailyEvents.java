class DailyEvents {
	public static String lastTask;
	public static void doDailyEvents() {
        selectDailyEvents();
		for(;;) {
            if (isClaim()) {
                claimDoneTask();
            } else {
                if (takeDailyAction(getTaskString())) {
                    return;
                } else {
                    scrollToNextTask();
                }
            }
			// String taskString = getTaskString();
            // boolean isClaim = isClaim();
            // System.out.println("TASK STRING " + taskString + " IS CLAIM " + isClaim);
            // scrollToNextTask(); 
		}
	}

	public static void selectDailyEvents() {
		GameMouse.click(40, 370);
	}

    public static void scrollToNextTask() {
        GameMouse.mouseWheel(500, 200, -4450);
    }

    public static String getTaskString() {
        Tesseract.takeScreenshot(300, 140, 300, 50);
        GameMouse.sleep(2000);
        String result = Tesseract.parseScreenshotString();
        return result;
    }

    public static boolean isClaim() {
        Tesseract.takeScreenshot(650, 170, 70, 25);
        GameMouse.sleep(2000);
        String result = Tesseract.parseScreenshotString();
        return result.contains("Claim");
    }

    public static void claimDoneTask() {
        // hit claim button
        GameMouse.click(680, 184);
    	// hit done button
    	GameMouse.click(410, 333);
    }

    public static void clickGoButton() {
        // hit claim button
        GameMouse.click(680, 210);
    }

    740 150
    public static boolean takeDailyAction(String taskString) {
    	if (taskString.contains("Midas")) {
            DailyEvents.clickGoButton();
            DailyEvents.doMidas();
            return true;
        } else if (taskString.contains("Embark")) {
            DailyEvents.clickGoButton();
            Crusader.completeCrusade(0);
            GameMouse.hitEscape();
            return true;
        } else if (taskString.contains("Lord")) {
            DailyEvents.clickGoButton();
            TimeRift.startAllTrials();
            GameMouse.hitEscape();
            return true;
        }
        return false;
    }

    public static void doMidas() {
        GameMouse.click(150, 415);
        GameMouse.hitEscape();
    }
}