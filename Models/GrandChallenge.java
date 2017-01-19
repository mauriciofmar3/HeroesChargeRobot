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
}