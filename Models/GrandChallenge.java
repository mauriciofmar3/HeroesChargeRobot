import java.awt.*;
class GrandChallenge {
	public static void fightArena() {

		// Color c = GameMouse.getPixelColor(686, 245);
		// System.out.println(c);
		for (int x = 0;;++x) {
			selectChallenge();
			if (x == 0) {
				CommonItems.clickTeamPreset();
				CommonItems.clickUsePreset();
			}
			CommonItems.acceptHeroesStartAutofight();
        	CommonItems.nextButton();
        	collectSingleChest();
        	if (hasNext()) {
        		nextChallenge();
        	} else {
        		break;
        	}
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

	public static boolean hasNext() {
		Color c = GameMouse.getPixelColor(686, 245);
		return 
			c.getRed() == 0 &&
			c.getGreen() == 191 &&
			c.getBlue() == 255;
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

	public static void collectSingleChest() {
		GameMouse.sleep(3000);
		fourthTreasureChest();
		GameMouse.sleep(1000);
		GameMouse.hitEscape();

	}
}