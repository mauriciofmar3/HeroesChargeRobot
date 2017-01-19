import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class TesseractPanel extends JPanel {
	boolean isPlundering;
	public TesseractPanel() {
		this.setBackground(Color.blue);
		isPlundering = false;

		addPlunderButton();
		addMousePositionButton();
		addTakeScreenshotButton();
		addPlunderGoldButton();
		addGrandChallengeButton();
		addResultsTextArea();
		closeWhenDoneCheckBox();
	}

	JCheckBox closeWhenDoneCheckBox;
	public void closeWhenDoneCheckBox() {
		closeWhenDoneCheckBox = new JCheckBox();
		this.add(closeWhenDoneCheckBox);
	}

	JTextArea resultsTextArea;
	public void addResultsTextArea() {
		resultsTextArea = new JTextArea();
		resultsTextArea.setPreferredSize(new Dimension(100, 50));
		resultsTextArea.setLineWrap(true);  
		resultsTextArea.setWrapStyleWord(true);
		resultsTextArea.setEditable(true);
		resultsTextArea.setHighlighter(null);
		resultsTextArea.setText("0");
		this.add(resultsTextArea);
	}

	JButton getMousePositionButton;
	public void addMousePositionButton() {
		getMousePositionButton = new JButton();
		getMousePositionButton.setText("Get Mouse Position");
		getMousePositionButton.setPreferredSize(new Dimension(130, 50));
		this.add(getMousePositionButton);
		getMousePositionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("get mouse position");
				GameMouse.sleep(2000);
				int[] position = GameMouse.getMousePosition();
				resultsTextArea.setText(position[0] + " " + position[1]);
			}
		});
	}

	JButton plunderButton;
	public void addPlunderButton() {
		plunderButton = new JButton();
		plunderButton.setText("Plunder");
		plunderButton.setPreferredSize(new Dimension(130, 50));
		this.add(plunderButton);
		plunderButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Plunder Forever");
				GameMouse.clickToGetFocus();
				if (isPlundering) {
					Plunder.canPlunder = false;
				} else {
					Plunder.canPlunder = true;
					Plunder.startInfinitePlunder();
				}
				isPlundering = !isPlundering;
			}
		});
	}

	JButton plunderGoldButton;
	public void addPlunderGoldButton() {
		plunderGoldButton = new JButton();
		plunderGoldButton.setText("Booty Cave");
		plunderGoldButton.setPreferredSize(new Dimension(130, 50));
		this.add(plunderGoldButton);
		plunderGoldButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GameMouse.clickToGetFocus();
				BootyCave.plunderGold();
				closeIfChecked();
				// CommonItems.fightDone();
			}
		});
	}

	JButton takeScreenshotButton;
	public void addTakeScreenshotButton() {
		takeScreenshotButton = new JButton();
		takeScreenshotButton.setText("Take Screenshot");
		takeScreenshotButton.setPreferredSize(new Dimension(130, 50));
		this.add(takeScreenshotButton);
		takeScreenshotButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("double click");
				GameMouse.click(340, 30, 200);
				GameMouse.click(340, 30, 200);
				GameMouse.click(340, 30, 200);
				GameMouse.click(340, 30, 200);
				// Tesseract.takeScreenshot(365, 425, 70, 25);
			}
		});
	}

	JButton addGrandChallengeButton;
	public void addGrandChallengeButton() {
		addGrandChallengeButton = new JButton();
		addGrandChallengeButton.setText("Grand Challenge");
		addGrandChallengeButton.setPreferredSize(new Dimension(130, 50));
		this.add(addGrandChallengeButton);
		addGrandChallengeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("grand challenge");
				GameMouse.clickToGetFocus();
				GrandChallenge.fightArena(getTextInt() == 0 ? 5 : getTextInt());
			}
		});
	}

	public String getText() {
		return resultsTextArea.getText();
	}

	public int getTextInt() {
		try {
			return Integer.parseInt(getText());
		} catch (Exception e) {

		}
		return 0;
	}

	public boolean shouldClose() {
		return closeWhenDoneCheckBox.isSelected();
	}

	public void closeIfChecked() {
		if (shouldClose()) {
			GameMouse.closeProgram();
		}
	}
}