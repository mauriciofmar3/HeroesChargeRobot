class Plunder {
	public static boolean canPlunder = true;

	public static void startInfinitePlunder() {
		for (;canPlunder;) {
			int enemyPower = detectCurrentEnemyPower();
			System.out.println(enemyPower);
			if (enemyPower < 50000) {
				System.out.println("YES");
				plunder();
			} else {
				System.out.println("NO");
				searchAgain();
			}
		}
	}

	public static void plunder() {
		clickPlunder();
        CommonItems.acceptHeroesStartAutofight(40000);
        CommonItems.nextButton();
        searchAgain();
	}

	public static void clickPlunder() {
		GameMouse.click(675, 429);
	}

	public static void searchAgain() {
		clickSearchAgain();
		// GameMouse.sleep(2000);
	}

	public static void clickSearchAgain() {
		GameMouse.click(540, 430);
	}

	public static int detectCurrentEnemyPower() {
		Tesseract.takeScreenshot(365, 425, 70, 25);
		GameMouse.sleep(1000);
		String result = Tesseract.parseScreenshot();
		int numResult = Integer.MAX_VALUE;
		try {
			numResult = Integer.parseInt(result);
		} catch (Exception e) { 
		}
		return numResult;
	}
}