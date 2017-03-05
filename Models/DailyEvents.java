import java.awt.Color;
class DailyEvents {
	public static String lastTask;
	public static void doDailyEvents() {
        // signin();
        selectDailyEvents();
		for(;;) {
            if (isClaim()) {
                claimDoneTask();
            } else {
                if (takeDailyAction(getTaskString())) {
                    continue;
                } else {
                    if (!scrollToNextTask()) {
                        finishLastTasks();
                        break;
                    }
                }
            }
		}
	}

	public static void selectDailyEvents() {
		GameMouse.click(40, 370);
	}

    static int stuckStrollingCount = 0;
    public static boolean scrollToNextTask() {
        stuckStrollingCount = 0;
        GameMouse.mouseWheel(740, 146, true, new GameMouseWheelListener() {
            public boolean shouldKeepScrolling() {
                Color color = GameMouse.getPixelColor(740, 146);
                return color.getRed() > 100;
            }
        });
        GameMouse.mouseWheel(740, 146, true, new GameMouseWheelListener() {
            public boolean shouldKeepScrolling() {
                Color color = GameMouse.getPixelColor(740, 146);

                if (color.getRed() >= 17 && color.getRed() <= 21 &&
                    color.getGreen() >= 15 && color.getGreen() <= 17 &&
                    color.getBlue() >= 11 && color.getBlue() <= 13) {
                    stuckStrollingCount++;
                } else {
                    stuckStrollingCount = 0;
                }

                return color.getRed() < 100 && stuckStrollingCount <= 50;
            }
        });
        return stuckStrollingCount <= 50;
    }

    public static String getTaskString() {
        Tesseract.takeScreenshot(305, 150, 320, 27);
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
        } else if (taskString.contains("Trial")) {
            DailyEvents.clickGoButton();
            Trials.startAllTrials();
            GameMouse.hitEscape();
            return true;
        } else if (taskString.contains("Cracker")) {
            DailyEvents.clickGoButton();
            Chests.getTenChests();
            GameMouse.hitEscape();
            return true;
        } else if (taskString.contains("Mercenary")) {
            DailyEvents.clickGoButton();
            Mercenary.sendMercenary();
            GameMouse.hitEscape();
            return true;
        } else if (taskString.contains("Cave")) {
            DailyEvents.clickGoButton();
            BootyCave.plunderGold();
            GameMouse.hitEscape();
            return true;
        } else if (taskString.contains("Skills")) {
            DailyEvents.clickGoButton();
            HeroSkills.addDailySkills();
            GameMouse.hitEscape();
            return true;
        } else if (taskString.contains("Defense") || taskString.contains("Outland")) {
            DailyEvents.clickGoButton();
            boolean succeeded = OutlandPortal.startPortal();
            GameMouse.hitEscape();
            return succeeded;
        // } else if (taskString.contains("Arena")) {
        //     DailyEvents.clickGoButton();
        //     Arena.fightArena();
        //     GameMouse.hitEscape();
        //     return false;
        }
        return false;
    }

    public static void doMidas() {
        GameMouse.click(150, 415);
        GameMouse.hitEscape();
    }

    public static void signin() {
        GameMouse.click(40, 200);
        GameMouse.click(666, 460);
        GameMouse.hitEscape();
    }

    public static void finishLastTasks() {
        // Go for grand challenge
        GameMouse.click(688, 222);
        GrandChallenge.fightArena();
        GameMouse.hitEscape();
    }
}