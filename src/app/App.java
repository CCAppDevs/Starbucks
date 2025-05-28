package app;

import java.awt.*;
import javax.swing.*;

public class App extends JFrame {
	private JLabel helloLabel;
	private JButton goButton;
	private FlowLayout flowLayout;

	public App() {
		super("Starbucks App");
		
		System.out.println("App is starting");
		
		// add a flow layout to manage our component positions
		this.flowLayout = new FlowLayout();
		setLayout(this.flowLayout);
		
		// set the window size
		setMinimumSize(new Dimension(800,600));
		
		// ensures the app is the right dimensions
		pack();
		
		// add a label
		this.helloLabel = new JLabel();
		this.helloLabel.setText("toast");
		add(this.helloLabel);
		
		for (int i = 0; i < 100; i++) {
			add(new JLabel("stuff"));
		}
		
		// add a button
		this.goButton = new JButton("go");
		add(this.goButton);
		
		// make the app visible to users
		setVisible(true);
	}

	public static void main(String[] args) {
		new App();
	}

}
