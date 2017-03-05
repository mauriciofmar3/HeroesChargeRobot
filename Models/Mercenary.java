class Mercenary {
	public static void sendMercenary() {
		Mercenary.openMercenaryCamp();
		Mercenary.hitRecall();
		Mercenary.hitOK();
		Mercenary.hitDeploy();
		Mercenary.sendFirstHero();
		Mercenary.hitConfirm();
		GameMouse.hitEscape();
		Mercenary.hitAdmiration();
		Mercenary.hitGainStamina();
		GameMouse.hitEscape();
		GameMouse.hitEscape();
	}

	public static void openMercenaryCamp() {
		GameMouse.click(672, 453);
	}

	public static void hitRecall() {
		GameMouse.click(600, 255);
	}

	public static void hitOK() {
		GameMouse.click(400, 405);
	}

	public static void hitDeploy() {
		GameMouse.click(600, 180);
	}

	public static void sendFirstHero() {
		GameMouse.click(240, 200);
	}

	public static void hitConfirm() {
		GameMouse.click(440, 340);
	}

	public static void hitAdmiration() {
		GameMouse.click(700, 250);
	}
	
	public static void hitGainStamina() {
		GameMouse.click(546, 274);
	}
}