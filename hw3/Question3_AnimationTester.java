import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.swing.Timer;

/**
   This program implements an animation that moves
   a car shape.
*/
public class Question3_AnimationTester
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      // creating shapes
      final Question3_MoveableShape shape = new Question3_CarShape(0, 0, CAR_WIDTH);
      final Question3_MoveableShape shape1 = new Question3_CarShape(0, 50, CAR_WIDTH);
      final Question3_MoveableShape shape2 = new Question3_CarShape(0, 100, CAR_WIDTH);
      final Question3_MoveableShape shape3 = new Question3_CarShape(0, 150, CAR_WIDTH);
      
      // adding shapes to an array list
      final ArrayList<Question3_MoveableShape> shapes = new ArrayList<Question3_MoveableShape>();
      shapes.add(shape);
      shapes.add(shape1);
      shapes.add(shape2);
      shapes.add(shape3);
    
      // passing the ArrayList of shapes to ShapeIcon
      Question3_ShapeIcon icon = new Question3_ShapeIcon(shapes,ICON_WIDTH, ICON_HEIGHT);
      
      final JLabel label = new JLabel(icon);
      frame.setLayout(new FlowLayout());
      frame.add(label);

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);

      final int DELAY = 100;
      // Milliseconds between timer ticks
      Timer t = new Timer(DELAY, new
         ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
            		for (Question3_MoveableShape s: shapes) // Moving each shape of the ArrayList
            		{
            			s.translate(1, 0);
            			label.repaint();
            		}
            }
         });
      t.start();
   }

   private static final int ICON_WIDTH = 1000;
   private static final int ICON_HEIGHT = 1000;
   private static final int CAR_WIDTH = 100;
}

