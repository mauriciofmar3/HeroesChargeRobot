import java.awt.*;
public class Chests {

	public static void getTenChests() {
		// hit buy 10
		GameMouse.click(180, 480);

		for (int x = 0; x < 2 * 10; ++x) {
			// hit ok a bunch of times to clear heroes from chests
			GameMouse.click(470, 430, 100);
		}
	}


	public static void tryBronzeSeconds(int seconds) {
		for (int x = 0; x < seconds * 10; ++x) {
			tenBronze(100);
		}
	}

	public static void tenBronze(int sleep) {
		GameMouse.click(370, 430, sleep);
	}
}