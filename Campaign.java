import java.awt.*;
public class Campaign {
	public static void selectCampaign() {
		GameMouse.click(460, 300);
	}

	public static void selectNormalMode() {
		selectMode(0);
	}

	public static void selectHardMode() {
		selectMode(1);
	}

	public static void selectRaidMode() {
		selectMode(2);
	}

	public static void selectMode(int mode) {
		int y = 160;
		int x = 300 + (mode * 100);
		GameMouse.click(x, y);
	}
}

