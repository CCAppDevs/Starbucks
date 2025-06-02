package app;

import java.awt.*;
import java.awt.event.*;

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
	private GridBagLayout leftLayout;
	private BoxLayout rightLayout;
	private BorderLayout footerLayout;
	
	public App() {
		super("Starbucks App");
		
		// add a flow layout to manage our component positions
		this.mainLayout = new GridBagLayout();
		setLayout(this.mainLayout);
		this.setBackground(Color.GREEN);
		
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
		this.leftPanel.setPreferredSize(new Dimension(400, 400));
		leftLayout = new GridBagLayout();
		this.leftPanel.setLayout(leftLayout);

		GridBagConstraints c = new GridBagConstraints();
		
		this.rightPanel = new JPanel();
		this.rightPanel.setBackground(Color.BLUE);
		rightLayout = new BoxLayout(this.rightPanel, BoxLayout.Y_AXIS);
		this.rightPanel.setLayout(rightLayout);
		
		
		this.footerPanel = new JPanel();
		this.footerPanel.setBackground(Color.RED);
		footerLayout = new BorderLayout();
		this.footerPanel.setLayout(footerLayout);
		
		int counter = 1;
		for (int y = 0; y < 3; y++) {
			for (int x = 0; x < 3; x++) {
				c.gridx = x;
				c.gridy = y;
				c.insets = new Insets(10, 10, 10, 10);
				JButton ingredientButton = new JButton(String.valueOf(counter));
				ingredientButton.addActionListener(evt -> handleButton(evt, "Toast"));
				// lets make it tell me what button was pressed
				this.leftPanel.add(ingredientButton, c);
				counter++;
			}
		}

		
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
	
	public void handleButton(ActionEvent evt, String message) {
		System.out.println("Button Clicked" + message);
	}

	public static void main(String[] args) {
		new App();
	}

}
