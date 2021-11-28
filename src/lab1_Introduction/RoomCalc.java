package lab1_Introduction;
public class RoomCalc
{
	public static void main(String args[])
	{
		// Declares three variables to store the dimensions
		double width = 0;
		double height = 0;
		double length = 0;

		/* 
		 * For each dimension, display a message, 
		 * gets the value from the user
		 * and store the value in the corresponding variable
		 */
		System.out.println("Volume calculator, by Rémi Heredero");
		
		System.out.print("Enter width (m) : ");
		width = Input.readDouble();
		
		System.out.print("Enter length (m) : ");
		length = Input.readDouble();
		
		System.out.print("Enter height (m) : ");
		height = Input.readDouble();
		
		// Perform the computation
		double vol = 0;
		vol = width  * length * height;
		
		// Compute the volume and displays it
		System.out.println("The corresponding volume is " + vol + " m^3 big");
		System.out.println("The corresponding volume is " + vol/0.00454609 + " gallon");
		
		System.out.println("Goodbye and thank you");
    }
}
