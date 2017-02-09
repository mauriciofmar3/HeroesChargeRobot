
import java.awt.*;
class BootyCave {
	public static boolean lastResult = true;
	public static int sameResultCounter = 0;

	public static void plunderGold() {
		System.out.println("SETUP ALL CAVES");
		setupAllCaves();
		System.out.println("CLAIM ALL EXTRA");
		claimAllExtra();
		System.out.println("PLUNDER ALL BOOTY");
		for (;;) {
			int enemyPower = detectCurrentEnemyPower();
			System.out.println(enemyPower);
			int plunderCount = plunderCount();
			if (plunderCount < 2) {
				sameResultCounter = 0;
				return;
			}
			if (enemyPower < 54000 && enemyPower > 10000) {
				System.out.println("YES");
				sameResultCounter = lastResult == true ? sameResultCounter + 1 : 0;
				lastResult = true;
				plunder();
			} else {
				System.out.println("NO");
				sameResultCounter = lastResult == false ? sameResultCounter + 1 : 0;
				lastResult = false;
				searchAgain();
			}
			if (sameResultCounter >= 15) {
				 GameMouse.closeProgram();
			}
			System.out.println("counter " + sameResultCounter + " lastResult " + lastResult);
		}
	}

	public static int plunderCount() {
		Tesseract.takeScreenshot(672, 85, 62, 24);
		String result = Tesseract.parseScreenshot();
		if (result.length() >= 2) {
			result = result.substring(0, result.length() - 2);
		}
		System.out.println("RESULT " + result);
		int numResult = Integer.MAX_VALUE;
		try {
			numResult = Integer.parseInt(result);
		} catch (Exception e) { 
		}
		return numResult;
	}

	public static void plunder() {
		clickPlunder();
        CommonItems.acceptHeroesAndStart(25000);
        CommonItems.nextButton();
        clickSearch();
	}

	public static void clickPlunder() {
		GameMouse.click(600, 310);
	}

	public static void searchAgain() {
		clickSearch();
		clickSearch();
		GameMouse.sleep(2000);
	}

	public static void clickSearch() {
		GameMouse.click(107, 517);
	}

	public static int detectCurrentEnemyPower() {
		clickCave();
		Tesseract.takeScreenshot(255, 370, 65, 25);
		
		GameMouse.sleep(2000);
		String result = Tesseract.parseScreenshot();
		int numResult = Integer.MAX_VALUE;
		try {
			numResult = Integer.parseInt(result);
		} catch (Exception e) { 
		}
		return numResult;
	}

	public static void clickCave() {
		GameMouse.click(383, 319);

	}
	/************ Claim All Extra Lanterns ***************/

	public static void claimAllExtra() {
		// click History Logs
		GameMouse.click(720, 465);
		while(needsClaiming()) {
			claimAndGoToNext();
		}
		GameMouse.hitEscape();
	}

	public static boolean needsClaiming() {
		Tesseract.takeScreenshot(577, 177, 60, 20);
		String result = Tesseract.parseScreenshotString();
		System.out.println(result.equals("Claim"));
		return result.equals("Claim");
	}

	public static void claimAndGoToNext() {
		// click claim
		GameMouse.click(607, 187);
		// click OK
		GameMouse.click(400, 360);
		goToNextClaim();
	}

	public static void goToNextClaim() {
		GameMouse.mouseWheel(745, 146, true, new GameMouseWheelListener() {
    		public boolean shouldKeepScrolling() {
        		Color color = GameMouse.getPixelColor(745, 146);
        		return color.getRed() > 100;
    		}
		});
		GameMouse.mouseWheel(745, 146, true, new GameMouseWheelListener() {
    		public boolean shouldKeepScrolling() {
        		Color color = GameMouse.getPixelColor(745, 146);
        		return color.getRed() < 100;
    		}
		});
	}

	/************ Set caves ***************/

	public static void setupAllCaves() {
		if (needsSeetingUp()) {
			collectAllResources();
			setupAllDigs();
		} else {
			for (int x = 0; x < 4; ++x) {
				// click right arrow 
				GameMouse.click(760, 290);
			}
		}
		// click plunder gold
		GameMouse.click(400, 300);
		GameMouse.sleep(1500);
		// plunderGold();
	}

	public static void setupAllDigs() {
			for (int x = 0; x < 4; ++x) {
				setupDig(x);
			}
	}

	public static void setupDig(int position) {
		// click dig
		GameMouse.click(200, 300);
		// click gold mine
		GameMouse.click(310, 275);
		// click dig time 10 hours
		GameMouse.click(545, 270);
		// click Team preset
		GameMouse.click(560, 100);
		for (int x = 0; x < position + 1; ++x) {
			goToNextPreset();
		}
		// click Use
		GameMouse.click(660, 180);
		// click OK
		GameMouse.click(680, 466);
		// for (int x = 0; x < 4; ++x) {
			// click right arrow 
			GameMouse.click(760, 290);
		// }
	}

	public static void collectAllResources() {
			for (int x = 0; x < 4; ++x) {
				GameMouse.click(400, 320);
				GameMouse.sleep(1000);
			}
	}

	public static boolean needsSeetingUp() {
		Tesseract.takeScreenshot(500, 137, 100, 30);
		String result = Tesseract.parseScreenshotString();
		return result.equals("");
	}

	public static void goToNextPreset() {
		GameMouse.mouseWheel(700, 135, true, new GameMouseWheelListener() {
    		public boolean shouldKeepScrolling() {
        		Color color = GameMouse.getPixelColor(700, 135);
        		return color.getRed() > 100;
    		}
		});
		GameMouse.mouseWheel(700, 135, true, new GameMouseWheelListener() {
    		public boolean shouldKeepScrolling() {
        		Color color = GameMouse.getPixelColor(700, 135);
        		return color.getRed() < 100;
    		}
		});
	}
}