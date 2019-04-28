
import java.awt.Rectangle;
import java.lang.reflect.Array;

/**
 * Implements the dump Array method.
 * @author chitsimrangill
 *
 */
public class hw5 
{
	
	/**
	 * Prints the elements of array using reflection
	 * @param arg - the array that needs to be dumped
	 */
	public static void dumpArray(Object arg)
	{
		if(Array.getLength(arg)==0) // if empty
		{
			System.out.println("[]");
			return;
		}
		
		StringBuffer strBuff = new StringBuffer("[");
		
		for(int i =0; i<Array.getLength(arg)-1;i++) // inserts comma
		{
			String s1 = Array.get(arg, i).toString();
			strBuff.append(s1);
			strBuff.append(", ");
		}
		String s1 = Array.get(arg, Array.getLength(arg)-1).toString()+"]";
		System.out.println(strBuff+s1);
	}
	
	/**
	 * Tests the dumpArray method
	 * @param args
	 */
	public static void main(String[] args)
	{
		Object[] arr0 = {6,"hi",12, new Rectangle(10,20)}; //first array
		dumpArray(arr0);
		System.out.println();
		
		int[] arr1 = {}; // second array
		dumpArray(arr1);
		System.out.println();
		
		int[] arr2 = {10,26,31}; //third array
		dumpArray(arr2);
		System.out.println();
		
		
		Rectangle[] arr3 = {new Rectangle(20,40),new Rectangle(15,55)}; // fourth array
		dumpArray(arr3);
		System.out.println();
		
		Rectangle[] arr4 = {new Rectangle(40,100),new Rectangle(),new Rectangle(10,60)}; //fifth array
		dumpArray(arr4);
	}
}
