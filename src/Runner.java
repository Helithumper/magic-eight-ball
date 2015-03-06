import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Runner {
	public static void main(String[] args){
		//System.out.println("WELCOME TO THE MAGIC 8 BALL");
		//Magic8BallPanel m8bp = new Magic8BallPanel();
		//Make a frame
		JFrame frame = new JFrame("MAGIC 8-BALL");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.CYAN);
		frame.setMinimumSize(new Dimension(200,200));
		ImageIcon img = new ImageIcon("8ballicon.png");
		frame.setIconImage(img.getImage());
		//frame.setVisible(true);
		//frame.setSize(new Dimension(600,400));
		//frame.setTitle("MAGIC 8-BALL");
		MagicBallPanel mbp = new MagicBallPanel();
		JPanel gamePanel = new JPanel();
		//mbp.setBackground(Color.BLACK);
		gamePanel.setBackground(Color.LIGHT_GRAY);
		//gamePanel.setMinimumSize(new Dimension(700,300));
		gamePanel.add(mbp);

		//frame.add(gamePanel);
		//gamePanel.add(m8bp);
		//frame.add(m8bp);
		frame.getContentPane().add(gamePanel);
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
		/*Boolean isRunning = true;
		Scanner reader = new Scanner(System.in);
		while(isRunning){
		Ball ball1 = new Ball();
		ball1.turn();
		Boolean isQuestion = false;
		while(!isQuestion){
		System.out.println("PLEASE ENTER A QUESTION!");
		
		String input;
		
		
		System.out.println("Would you like to try again?");
		String input2 = reader.nextLine();
		if(input2.equalsIgnoreCase("NO")){
			break;
		}
		
		}
	}
	*/}}

