package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {
	public static void main(String[] args) {
		String nickels = new String();
		String quarters = new String();
		String dimes = new String();
double quarts = 0;
double nicks = 0;
double dims = 0;
double total = 0;
		// Ask the user how many nickels they have
nickels = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
nicks = Integer.parseInt(nickels);
		// Ask the user how many dimes they have, and convert their answer
dimes = JOptionPane.showInputDialog("How many dimes do you have?");
dims = Integer.parseInt(dimes);
		// Ask the user how many quarters they have, and convert their answer
quarters = JOptionPane.showInputDialog("Quarters?");
quarts = Integer.parseInt(quarters);
		// Calculate how much money the user has and save it in a double variable 
quarts *= .25;
dims /= 10;
nicks *=.5;
total = quarts + nicks + dims;
		// Tell the user how much money they have
System.out.println("You have: " + total + "cents");

	}
}

