import java.awt.*;
import javax.swing.*;

/**
 * Tester class of question 1.
 * Creates a frame with 3 buttons - red, green, and blue. The frame also contains a circle.
 * On clicking the button the color of circle changes to respective color of the button.
 * @author chitsimrangill
 *
 */
public class Question1_frame 
{
	private static JLabel label; // label
	private static Question1_circle cir = new Question1_circle(40); // circle used in frame
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		
		JButton redButton = new JButton("Red"); // red button
		redButton.addActionListener(event -> cir.c1 = Color.RED); // changes color
		redButton.addActionListener(event -> label.repaint()); // repaints circle
		
		JButton greenButton = new JButton("Green"); // green button
		greenButton.addActionListener(event -> cir.c1 = Color.GREEN); // changes color
		greenButton.addActionListener(event -> label.repaint()); // repaints circle
		
		JButton blueButton = new JButton("Blue"); // blue button
		blueButton.addActionListener(event -> cir.c1 = Color.BLUE); // changes color
		blueButton.addActionListener(event -> label.repaint()); // repaints circle
		
		label = new JLabel(cir); // label
		
		//adding buttons in frame
		frame.setLayout(new FlowLayout());
		frame.add(label);
		frame.add(redButton);
		frame.add(greenButton);
		frame.add(blueButton);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
