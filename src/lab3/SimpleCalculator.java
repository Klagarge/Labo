package lab3;
/**
 * This class offers a simple calculator which computes three standard
 * operations on two numbers entered with the console
 * 
 * @author Pierre-Andre Mudry (pandre.mudry@hevs.ch)
 * @author Pierre Roduit (pierre.roduit@hevs.ch)
 * @version 2.1
 * @date October 11th 2017
 * 
 */
public class SimpleCalculator {

	/**
	 * Starting point of the program
	 */
	public static void main(String[] args) {
		int x = 0, y = 0;
		boolean loop = true;

		// Integer used to choose the operator type
		String operatorType = "0";
		
		while (loop) {
				// Display the kind of operations that we can handle
			System.out.println("Choose now the operator, by entering a number between 1 and 3:\n"
							+ "1 - Addition\n"
							+ "2 - Subtraction\n"
							+ "3 - Multiplication\n"
							+ "quit - Quitter\n");

			// Read the operator from the console
			System.out.print("Enter your choice : ");
			operatorType = Input.readString();
			if (operatorType.equals("quit")) {
				System.out.println("finishing");
				break;
			} else {
				System.out.println("debug1");
				System.out.println(operatorType);
			}

			// Display the message
			System.out.println("Take care to enter only integer numbers !");
			System.out.print("Enter first integer: ");

			// Read the two numbers from the console
			x = Input.readInt();
			System.out.print("Enter the second integer: ");
			y = Input.readInt();

			// Decision tree (The place where you will insert a switch operator)

			switch (operatorType) {
				case "1":
					// Display a text and the result of the operation
					System.out.println("Result of the addition is: " + (x + y));
					break;

				case "2":
					// Display a text and the result of the operation
					System.out.println("Result of the subtraction is: " + (x - y));
					break;

				case "3":
					// Display a text and the result of the operation
					System.out.println("Result of the multiplication is: " + (x * y));
					break;
			
				default:
					// Display an error message
					System.out.println("You did not enter a correct number for the operation.");
					break;
			}
		}
	}
		
}