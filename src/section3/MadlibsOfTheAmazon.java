package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null,"If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
String adjective=JOptionPane.showInputDialog("Type Below a Random Adjective");
		// Get the user to enter a type of liquid
String liquid=JOptionPane.showInputDialog("Type Here a Random Liquid");
		// Get the user to enter a body part
String bodypart=JOptionPane.showInputDialog("Type Here a Random Body Part");

		// Get the user to enter a verb
String verb=JOptionPane.showInputDialog("Type Here a Random Verb");
		// Get the user to enter a place
String place=JOptionPane.showInputDialog("Type Here a Random Location");
		// Fit the user's words into this sentence, and save it in a String:
		 

JOptionPane.showMessageDialog(null,"Piranhas are more "+adjective+" during the day, so cross the river at\n" + 
		"		 night. Piranhas are attracted to fresh"+liquid+"  and will most\n" + 
		"		 likely take a bite out of your"+bodypart+"  if you" +verb+" Whatever\n" + 
		"		 you do, if you have an open wound, try to find another way to get\n" + 
		"		 back to the"+place+" Good luck!");

	}
}

