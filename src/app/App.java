package app;

import java.awt.*;
import javax.swing.*;

/// Starbucks - This app is a calculator to calculate the cost of a cup of starbucks
/// based on the cost of the ingredients

/* Class Ideas
 * Size of the cup
 * Cost
 * markup?
 * Ingredients
 * 		Types of ingredients
 * 
 * Buttons - Ingredients
 * Buttons - Calculate
 * Label? or something else
 * */ 

public class App extends JFrame {
	private GridBagLayout mainLayout;
	private JPanel leftPanel;
	private JPanel rightPanel;
	private JPanel footerPanel;

	public App() {
		super("Starbucks App");
		
		// add a flow layout to manage our component positions
		this.mainLayout = new GridBagLayout();
		setLayout(this.mainLayout);
		
		// set the window size
		setMinimumSize(new Dimension(800,600));
		setSize(new Dimension(1024,768));

		loadComponents();
		
		// make the app visible to users
		pack();
		setVisible(true);
	}
	
	private void loadComponents() {
		// load panels
		this.leftPanel = new JPanel();
		this.leftPanel.setBackground(Color.GREEN);
		this.rightPanel = new JPanel();
		this.rightPanel.setBackground(Color.BLUE);
		this.footerPanel = new JPanel();
		this.footerPanel.setBackground(Color.RED);
		
		// add the panels
		add(this.leftPanel);
		add(this.rightPanel);
		add(this.footerPanel);
	}

	public static void main(String[] args) {
		new App();
	}

}
