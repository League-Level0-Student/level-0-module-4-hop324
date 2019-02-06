package extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {

	public static void main(String[] args) {
		static int yeet = 0;
		static int yote = 0;
		static int yeetyote = yeet + yote;
		// 1. Get 2 numbers from the user and convert them to integer.
String Kevin  = JOptionPane.showInputDialog("Enter a number");
String Bacon = JOptionPane.showInputDialog("Enter a different number");
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "The question", "Pop-up Title", 0, null,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "+", "-", "*", "/", "=" });
}
		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.

			// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations

	
	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
static void Footloose(int num1, num2) {
	Kevin.parseInt(yeet);
	Bacon.parseInt(yote);
	System.out.println(yeet +"+"+ yote+"="+ yeetyote);
}

	// 4. Create similar methods for subtraction, multiplication and division.
