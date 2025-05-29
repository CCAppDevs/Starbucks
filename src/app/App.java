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
	private GridBagConstraints constraints;
	private GridLayout leftLayout;
	private BoxLayout rightLayout;
	private BorderLayout footerLayout;
	
	public App() {
		super("Starbucks App");
		
		// add a flow layout to manage our component positions
		this.mainLayout = new GridBagLayout();
		setLayout(this.mainLayout);
		
		// set the window size
		setMinimumSize(new Dimension(800,600));
		setSize(new Dimension(1024,768));

		constraints = new GridBagConstraints();

		
		loadComponents();
		
		// make the app visible to users
		pack();
		setVisible(true);
	}
	
	private void loadComponents() {

		
		
		
		// load panels
		this.leftPanel = new JPanel();
		this.leftPanel.setBackground(Color.GREEN);
		leftLayout = new GridLayout();
		leftLayout.setRows(3);
		leftLayout.setColumns(3);
		this.leftPanel.setLayout(leftLayout);
		
		
		
		this.rightPanel = new JPanel();
		this.rightPanel.setBackground(Color.BLUE);
		rightLayout = new BoxLayout(this.rightPanel, BoxLayout.Y_AXIS);
		this.rightPanel.setLayout(rightLayout);
		
		
		this.footerPanel = new JPanel();
		this.footerPanel.setBackground(Color.RED);
		footerLayout = new BorderLayout();
		this.footerPanel.setLayout(footerLayout);
		
		// TODO: This is not laying out in a 3x3 grid
		this.leftPanel.add(new JButton("1"));
		this.leftPanel.add(new JButton("2"));
		this.leftPanel.add(new JButton("3"));
		this.leftPanel.add(new JButton("4"));
		this.leftPanel.add(new JButton("5"));
		this.leftPanel.add(new JButton("6"));
		this.leftPanel.add(new JButton("7"));
		this.leftPanel.add(new JButton("8"));
		this.leftPanel.add(new JButton("9"));
		
		this.rightPanel.add(new JLabel("Stuff"));
		
		// TODO: fix layout, buttons are overlapping
		this.footerPanel.add(new JButton("Clear"));
		this.footerPanel.add(new JLabel("Price: $0.00"));
		this.footerPanel.add(new JButton("Calculate"));
		
		// TODO: all panels should fill the available space
		
		// add the panels		
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 0;
		constraints.gridy = 0;
		add(this.leftPanel, constraints);
		
		
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 1;
		constraints.gridy = 0;
		add(this.rightPanel, constraints);
		
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.gridwidth = 2;
		add(this.footerPanel, constraints);
	}

	public static void main(String[] args) {
		new App();
	}

}
