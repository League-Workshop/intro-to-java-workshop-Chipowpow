package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String input = JOptionPane.showInputDialog("What is your name??");

		// 2. If they say "yes", tell them they will rule the world.
		if( input.equals("Tyden"))
		{
			JOptionPane.showMessageDialog(null, "Hi, Your Awesome " + input);
			
		}
	
		

		// 3. Otherwise, wish them good luck washing dishes.
		else {
			JOptionPane.showMessageDialog(null, "Your Name Stinks, change is to Tyden! ");
		}
	}

	}


