class BootyCave {
	public static boolean lastResult = true;
	public static int sameResultCounter = 0;

	public static void plunderGold() {
		for (;;) {
			int enemyPower = detectCurrentEnemyPower();
			System.out.println(enemyPower);
			int plunderCount = plunderCount();
			if (plunderCount < 2) {
				sameResultCounter = 0;
				return;
			}
			if (enemyPower < 50000 && enemyPower > 10000) {
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
		// GameMouse.closeProgram();
	}

	public static int plunderCount() {
		Tesseract.takeScreenshot(672, 85, 62, 24);
		
		// GameMouse.sleep(2000);
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
		// AndySetup.enlargeAndy();
		// Tesseract.takeScreenshot(485, 560, 110, 40);
		// AndySetup.resizeAndy();
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
}