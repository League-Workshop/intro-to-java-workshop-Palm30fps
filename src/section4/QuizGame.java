package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score=0;
		JOptionPane.showMessageDialog(null,"Play This Game with Volume!");
		// 2.  Ask the user a question 
				String quiz = JOptionPane.showInputDialog(" How many lives does a cat have? ");
		// 3.  Use an if statement to check if their answer is correct
		if(quiz.equals("9")){
			speak("Correct");
			score=score+1;
			}
		else {
			speak("Wrong try again next time");}
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		 catch (Exception e) {
			 e.printStackTrace();
		 }
	}
	}