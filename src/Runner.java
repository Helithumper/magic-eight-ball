import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Runner {
	public static void main(String[] args) {
		
		//Create Frame and set options
		JFrame frame = new JFrame("MAGIC 8-BALL");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.CYAN);
		frame.setMinimumSize(new Dimension(200, 200));
		
		//Set Icon in up-left corner
		ImageIcon img = new ImageIcon("8ballicon.png");
		frame.setIconImage(img.getImage());
		
		//Add Panels to the Frame
		MagicBallPanel mbp = new MagicBallPanel();
		JPanel gamePanel = new JPanel();
		gamePanel.setBackground(Color.LIGHT_GRAY);
		gamePanel.add(mbp);

		//Get the Frame running
		frame.getContentPane().add(gamePanel);
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);

	}
}
