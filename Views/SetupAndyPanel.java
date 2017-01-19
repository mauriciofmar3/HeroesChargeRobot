import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class SetupAndyPanel extends JPanel {
	JButton resizeAndyButton;
	JButton startAndyButton;
	JButton closeAndyButton;
	public SetupAndyPanel() {
		addStartAndyListener();
		addResizeAndyButton();
		addCloseAndyButton();

	}

	public void addStartAndyListener() {
		startAndyButton = new JButton();
		startAndyButton.setText("Start Andy");
		this.add(startAndyButton);
		startAndyButton.setPreferredSize(new Dimension(100, 50));
		startAndyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AndySetup.startAndy();
			}
		});
	}

	public void addResizeAndyButton() {
		resizeAndyButton = new JButton();
		resizeAndyButton.setText("Resize Andy");
		this.add(resizeAndyButton);
		resizeAndyButton.setPreferredSize(new Dimension(100, 50));
		resizeAndyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AndySetup.resizeAndy();
			}
		});
	}

	public void addCloseAndyButton() {
		closeAndyButton = new JButton();
		closeAndyButton.setText("Close Andy");
		this.add(closeAndyButton);
		closeAndyButton.setPreferredSize(new Dimension(100, 50));
		closeAndyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AndySetup.closeAndy();
			}
		});
	}
}