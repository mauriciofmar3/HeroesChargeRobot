import java.awt.*;
public class Chests {
	public static void tryBronzeSeconds(int seconds) {
		for (int x = 0; x < seconds * 10; ++x) {
			tenBronze(100);
		}
	}

	public static void getFreeChest() {
		chooseChest();
		chooseBronzeChest();
		freeBronze();
		GameMouse.sleep(5000);
		GameMouse.click(500, 475);
		CommonItems.backButton();
	}

	public static void chooseChest() {
		GameMouse.click(550, 400);
	}

	public static void chooseBronzeChest() {
		GameMouse.click(260, 440);
	}

	public static void freeBronze() {
		GameMouse.click(260, 310);
	}

	public static void tenBronze(int sleep) {
		GameMouse.click(300, 457, sleep);
	}
}