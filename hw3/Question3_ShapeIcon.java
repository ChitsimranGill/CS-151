import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
   An icon that contains a moveable shape.
*/
public class Question3_ShapeIcon implements Icon
{

	/**
	 * Creates a ShapeIcon object
	 * @param shapes - ArrayList of movable shapes
	 * @param width - width of the icon
	 * @param height - height of the icon
	 */
   public Question3_ShapeIcon(ArrayList<Question3_MoveableShape> shapes, int width, int height)
   {
	  this.shapes = shapes; 
      this.width = width;
      this.height = height;
   }
   
   public int getIconWidth()
   {
      return width;
   }

   public int getIconHeight()
   {
      return height;
   }

   /**
    * Paints all the movable shapes that are in the ArrayList.
    */
   public void paintIcon(Component c, Graphics g, int x, int y)
   {
      Graphics2D g2 = (Graphics2D) g;
      for (Question3_MoveableShape s: shapes)
      {
      s.draw(g2);
      }
   }

   private int width;
   private int height;
   private ArrayList<Question3_MoveableShape> shapes; // ArrayList of movable shapes
}



