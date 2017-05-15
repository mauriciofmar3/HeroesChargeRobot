import java.awt.*;
class GuildRaid {
	public static Point[][] raidPositions;
	public static void raidAll() {
		makeRaidPositions();
		navigateToLastRaid();
		for (int x = 0; x < raidPositions.length; ++x) {
			for (int y = 0; y < raidPositions[x].length; ++y) {
				Point point = raidPositions[x][y];
				GameMouse.click(point.x, point.y);
				Color color = GameMouse.getPixelColor(660, 425);
				System.out.println(color);
				if (color.getGreen() >= 150) {
					doRaidLevel();
					GameMouse.click(point.x, point.y);
					doRaidLevel();
					break;
				} else {
					GameMouse.hitEscape();
				}
			}
			// click on back button
			GameMouse.click(40, 290);
		}
		GameMouse.hitEscape();
	}

	public static void doRaidLevel() {
		// click do level
		GameMouse.click(660, 434);
		CommonItems.clickTeamPreset();
		CommonItems.clickUsePreset();
        CommonItems.acceptHeroesStartAutofight();
        // click next after fight
        GameMouse.click(630, 430);
	}

	public static void navigateToLastRaid() {
		// click Raid Instances
		GameMouse.click(490, 442);
		hitGoUntilSucceed();
		hitNextChapterABunch();
	}

	public static void hitNextChapterABunch() {
		for (int x = 0; x < 20; ++x) {
			// hit right arrow button
			GameMouse.click(770, 300, 200);
		}
	}

	public static void hitGoUntilSucceed() {
		for (;;) {
			// click Go Button
			GameMouse.click(620, 270);
			if (hasGoButton()) {
				scrollToNextChapter(205, 200);
			} else {
				return;
			}
		}
	}

	public static boolean hasGoButton() {
		Tesseract.takeScreenshot(595, 258, 45, 25);
		String result = Tesseract.parseScreenshotString();
		return result.equals("Go");
	}

	public static void scrollToNextChapter(int x, int y) {
		GameMouse.mouseWheel(x, y, true, new GameMouseWheelListener() {
    		public boolean shouldKeepScrolling() {
        		Color color = GameMouse.getPixelColor(x, y);
        		return color.getRed() > 100;
    		}
		});
		GameMouse.mouseWheel(x, y, true, new GameMouseWheelListener() {
    		public boolean shouldKeepScrolling() {
        		Color color = GameMouse.getPixelColor(x, y);
        		return color.getRed() < 100;
    		}
		});
	}

	public static void makeRaidPositions() {
		raidPositions = new Point[][] {
			new Point[] {
				new Point(297, 403),
				new Point(404, 320),
				new Point(213, 281),
				new Point(150, 174),
				new Point(405, 187),
				new Point(636, 221),
				new Point(686, 311)
			},
			new Point[] {
				new Point(218, 338),
				new Point(451, 396),
				new Point(638, 407),
				new Point(518, 283),
				new Point(303, 282),
				new Point(369, 190),
				new Point(609, 181)
			}, 
			new Point[] {
				new Point(552, 387),
				new Point(383, 388),
				new Point(251, 416),
				new Point(422, 276),
				new Point(594, 211),
				new Point(351, 210)
			}, 
			new Point[] {
				new Point(401, 378),
				new Point(524, 378),
				new Point(578, 288),
				new Point(325, 267),
				new Point(182, 206),
				new Point(427, 202),
				new Point(673, 225)
			}, 
			new Point[] {
				new Point(229, 194),
				new Point(170, 374),
				new Point(312, 310),
				new Point(483, 394),
				new Point(698, 387),
				new Point(609, 181)
			}
		};
	}
}