import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MagicBallPanel extends JPanel {
	
	// Fields
	private JLabel computerLabel = new JLabel("", SwingConstants.CENTER), instructionsLabel = new JLabel("", SwingConstants.CENTER); // Create computer label and the instructions label
	private JTextField inputField = new JTextField("Enter Question Here", 15); //Question Text Field
	private Ball ball1; // Create a space for the new ball

	// Constructor
	public MagicBallPanel() {
		
		//Make a Ball
		ball1 = new Ball();

		// Set Layout
		setupPanel();
		
	}

	// MEthods
	public void setupPanel() {
		setLayout(new BorderLayout());

		// INSTRUCTION PANEL //
		JPanel instructionPanel = new JPanel();
		instructionsLabel
				.setText("<html><font color = 'blue'>JAVA MAGIC 8 BALL GAME!<br>"
						+ "TYPE IN A QUESTION AND PRESS [<font color = 'gray'>SUBMIT</font>] FOR AN ANSWER!<br>"
						+ "By:</font><font color = 'red'> Peyton Duncan</font></html>");
		instructionsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		instructionsLabel.setFont(new Font("Comic Sans MS",
				Font.CENTER_BASELINE, 15));
		instructionPanel.add(instructionsLabel);
		instructionPanel.setBackground(Color.WHITE);

		add(instructionPanel, BorderLayout.NORTH);

		
		// COMPUTER PANEL //
		JPanel computerPanel = new JPanel();
		computerLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		computerLabel.setText("The Eight Ball is Prepared!");
		computerPanel.add(computerLabel);
		computerPanel.setBackground(Color.WHITE);

		add(computerPanel, BorderLayout.CENTER);

		// USER INPUT PANEL! //
		JPanel userPanel = new JPanel();

		// Makes it so when clicked, the text field is cleared // 
		inputField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				inputField.setText("");
			}
		});
		

		// Makes it so if you press enter, you run the program //
		inputField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ready = ball1.checkIfAnswer(inputField.getText());
				if (ready.equalsIgnoreCase("ready")) {
					ball1.turn();
					computerLabel.setText(ball1.getAnswer());
				} else {
					computerLabel.setText(ball1.checkIfAnswer(inputField
							.getText()));
				}
			}
		});

		// Add input Field //
		userPanel.add(inputField);
		userPanel.setBackground(Color.WHITE);

		// Make Button //
		JButton button = new JButton("Submit");
		
		// button.setMnemonic(KeyEvent.VK_ENTER); /*Optional Mnemonic*/
		
		//Make the Button Listener
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Perform the Action
				String ready = ball1.checkIfAnswer(inputField.getText());
				if (ready.equalsIgnoreCase("ready")) {
					ball1.turn();
					computerLabel.setText(ball1.getAnswer());
				} else if (ready.equals("adm1234567890")) { //Secret Question
					computerLabel.setText("WELCOME ADMIN!"); //Secret Answer
				} else {
					computerLabel.setText(ball1.checkIfAnswer(inputField
							.getText()));
				}
			}
		});
		
		//Add the Button to the panel
		userPanel.add(button);
		
		//Add the User Panel
		add(userPanel, BorderLayout.SOUTH);
		
		//Set Options
		setBackground(Color.WHITE);
	}
	// tosTring
}
