package section3;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
	
		String input = JOptionPane.showInputDialog("name?");
		JOptionPane.showMessageDialog(null, "Hi " + input);

	}

}
