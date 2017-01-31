class GrandChallenge {
	public static void fightArena(int count) {
		for (int x = 0; x < count; ++x) {
			selectChallenge();
			CommonItems.acceptHeroesStartAutofight(30000);
        	CommonItems.nextButton();
        	nextChallenge();
		}
	}

	public static void selectChallenge() {
		GameMouse.click(625, 423);
	}

	public static void nextChallenge() {
		GameMouse.click(688, 248);
	}

	public static void downButton() {
		GameMouse.click(686, 344);
	}

	public static void fourthTreasureChest() {
		GameMouse.click(567, 322);
	}

	public static void okButton() {
		GameMouse.click(400, 360);
	}

	public static void collectGrandChallenge(int count) {
		for (int x = 0; x < count; ++x) {
			fourthTreasureChest();
			GameMouse.sleep(1000);
			okButton();
			downButton();
			GameMouse.sleep(1000);
		}
	}
}