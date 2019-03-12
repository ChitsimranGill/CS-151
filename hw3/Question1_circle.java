import java.awt.*;
import java.awt.geom.*;
import javax.swing.Icon;

/**
 * Creates a circle object and implements Icon.
 * Contains paintIcon method.
 * @author chitsimrangill
 *
 */
public class Question1_circle implements Icon
{
	private int size; // size of the circle
	public Color c1 = Color.RED; // color of the circle
	
	/**
	 * Constructor of the class.
	 * It creates a circle object.
	 * @param aSize - radius of the circle
	 */
	public Question1_circle(int aSize)
	{
		size = aSize;
	}
	
	/**
	 * Gets the width of the icon.
	 */
	public int getIconWidth()
	{
		return size;
	}
	
	/**
	 * Gets the height of the icon.
	 */
	public int getIconHeight()
	{
		return size;
	}
	
	/**
	 * Paints the icon.
	 */
	public void paintIcon(Component c, Graphics g, int x, int y)
	{
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double cirlce = new Ellipse2D.Double(x,y,size,size);
		g2.setColor(c1);
		g2.fill(cirlce);
	}
	
	
	
}
