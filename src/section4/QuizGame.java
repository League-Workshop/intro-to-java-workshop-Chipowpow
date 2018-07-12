package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		
		// 2.  Ask the user a question 
				String dog =JOptionPane.showInputDialog(null, "What's your favorite Animal??");
		
		// 3.  Use an if statement to check if their answer is correct
		if(dog.equalsIgnoreCase ("dog")) {
			score++;
			
		}
		
		
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
	
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
	String food =JOptionPane.showInputDialog(null, "What's your favorite Food??");
	if(food.equalsIgnoreCase ("Spaghetti")) {
		score++;
	}
		JOptionPane.showMessageDialog(null, "Your score is " + score);
		
		// 6.  After all the questions have been asked, print the user's score 
	
	}
		
	}

