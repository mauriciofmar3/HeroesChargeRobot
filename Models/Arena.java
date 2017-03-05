import java.awt.*;
public class Arena {
	public static void fightArena() {
		selectArena();
		selectFight();
		CommonItems.acceptHeroesAndStart();
		CommonItems.failedButton();
		GameMouse.hitEscape();
	}

	public static void selectArena() {
		GameMouse.click(60, 400);
	}

	public static void selectFight() {
		GameMouse.click(660, 440);
	}
}