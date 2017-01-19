import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class RedoLevelPanel extends JPanel {
	JButton startLevelButton;
	JButton crusadeButton;
	JTextArea repeatNumberTextArea;
	public RedoLevelPanel() {
		this.setBackground(Color.red);


		addStartLevelButton();
		addCrusadeButton();
		addTextArea();
	}

	public String getText() {
		return repeatNumberTextArea.getText();
	}

	public int getTextInt() {
		try {

			return Integer.parseInt(getText());
		} catch (Exception e) {

		}
		return 0;
	}

	public void addTextArea() {
		repeatNumberTextArea = new JTextArea();
		this.add(repeatNumberTextArea);
		repeatNumberTextArea.setPreferredSize(new Dimension(100, 50));
		repeatNumberTextArea.setLineWrap(true);  
		repeatNumberTextArea.setWrapStyleWord(true);
		repeatNumberTextArea.setEditable(true);
		repeatNumberTextArea.setHighlighter(null);
	}

	public void addStartLevelButton() {
		startLevelButton = new JButton();
		this.add(startLevelButton);
		startLevelButton.setText("Start Level");
		startLevelButton.setPreferredSize(new Dimension(100, 50));
		startLevelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				redoLevels();
			}
		});
	}

	public void addCrusadeButton() {
		crusadeButton = new JButton();
		this.add(crusadeButton);
		crusadeButton.setText("Start Crusade");
		crusadeButton.setPreferredSize(new Dimension(100, 50));
		crusadeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GameMouse.clickToGetFocus();
				Crusader.completeCrusade(getTextInt());
			}
		});
	}

	public void redoLevels() {
        GameMouse.clickToGetFocus();
        CommonItems.startLevel();
        CommonItems.redoLevel(67);
	}
}