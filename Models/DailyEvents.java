class DailyEvents {
	public static String lastTask;
	public static void doDailyEvents() {
        selectDailyEvents();
		for(;;) {
			String taskString = getTaskString();
            boolean isClaim = isClaim();
            System.out.println("TASK STRING " + taskString + " IS CLAIM " + isClaim);
            scrollToNextTask(); 
		}
	}

	public static void selectDailyEvents() {
		GameMouse.click(40, 370);
	}

    public static void scrollToNextTask() {
        GameMouse.drag(500, 300, 500, 190, 3000);
    }

    public static String getTaskString() {
        Tesseract.takeScreenshot(300, 150, 300, 30);
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
    	GameMouse.click(600, 200);
    	// hit done button
    	GameMouse.click(400, 250);
    }

    public static void takeDailyAction(String taskString) {
    	// if ()
    }
}