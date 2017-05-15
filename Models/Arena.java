import java.awt.*;
public class Arena {
	public static void fightArena() {
		selectArena();
		if (isCoolingDown()) {
			return;
		}
		selectFight();
		CommonItems.acceptHeroesAndStart();
		CommonItems.failedButton();
		// GameMouse.hitEscape();
	}

	public static void selectArena() {
		GameMouse.click(250, 270);
	}

	public static void selectFight() {
		GameMouse.click(690, 433);
	}

	public static boolean isCoolingDown() {
        Tesseract.takeScreenshot(175, 320, 90, 30);
        GameMouse.sleep(2000);
        String result = Tesseract.parseScreenshotString();
        System.out.println(result);
        return result.contains("Cooldown");
	}
}