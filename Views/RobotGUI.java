import javax.swing.*;
import java.awt.*;
import java.awt.Dimension;
class RobotGUI extends JFrame {
    private final static int WIDTH = 500; // 1300;
    private final static int HEIGHT = 400; // 850;
    JPanel redoLevelPanel;
    JPanel setupAndyPanel;
    JPanel tesseractPanel;
    BorderLayout borderLayout;
	public RobotGUI() {
		this.setTitle("Heroes Charge Robot");
		this.setSize(WIDTH, HEIGHT);
		this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(900, 0);
        setFocusTraversalKeysEnabled(false);
        requestFocusInWindow();
        requestFocus();

        borderLayout = new BorderLayout();
        this.setLayout(borderLayout);


        addRedoLevelPanel();
        addSetupAndyPanel();
        addTesseractPanel();
    }

    public void addRedoLevelPanel() {
    	redoLevelPanel = new RedoLevelPanel();
		redoLevelPanel.setPreferredSize(new Dimension(500, 70));
        // redoLevelPanel.setLayout(borderLayout);
    	this.add(redoLevelPanel, BorderLayout.NORTH);
    }

    public void addSetupAndyPanel() {
    	setupAndyPanel = new SetupAndyPanel();
		setupAndyPanel.setPreferredSize(new Dimension(500, 70));
        // setupAndyPanel.setLayout(borderLayout);
    	this.add(setupAndyPanel, BorderLayout.SOUTH);
    }

    public void addTesseractPanel() {
        tesseractPanel = new TesseractPanel();
        tesseractPanel.setPreferredSize(new Dimension(500, 200));
        this.add(tesseractPanel, BorderLayout.EAST);
    }
}