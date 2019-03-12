import javax.swing.Timer;
import java.awt.event.*;

/**
 * Tester class of 2nd question.
 * @author chitsimrangill
 *
 */
public class Question2_timer 
{
	/**
	 * Uses Timer object to print "Hello, World" once per second.
	 * @param args
	 */
	public static void main(String[] args)
	{
		ActionListener listener = event -> System.out.println("Hello, World");
		final int DELAY = 1000;
		Timer t = new Timer(DELAY, listener);
		t.start();
	}

}
