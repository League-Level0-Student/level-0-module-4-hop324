package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	static String pet = new String();
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
pet = JOptionPane.showInputDialog("What kind of pet do you want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
for(int g = 100; g > 0; g--) {
			int task = JOptionPane.showOptionDialog(null, "What do you want to do?", "Pet Choices", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Groom", "Walk", "Dance" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
if(task == 0) {
	Groom();
}
else if(task == 1) {
	Walk();
}
else if(task == 2) {
	Dance();
}

if(happinessLevel >= 5) {
	g=0;
	JOptionPane.showMessageDialog(null, "Your pet "  + pet + " loves you");
}
}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	public static void Groom() {
		JOptionPane.showMessageDialog(null, "Your " + pet + " was groomed!");
		happinessLevel++;
	}
	public static void Walk() {
		JOptionPane.showMessageDialog(null, "You walked your pet " + pet);
		happinessLevel++;
	}
	public static void Dance() {
		JOptionPane.showMessageDialog(null, "You stand up and dance like an idiot. Yay?");
		happinessLevel++;
	}
}