import javax.swing.JOptionPane;


public class LittleAlchemy {
public static void main(String[] args) {

	String[] elements = new String[7];

	elements[0] = "Earth";
	elements[1] = "Water";
	elements[2] = "Fire";
	elements[3] = "Air";


	
	JOptionPane.showMessageDialog(null, "Welcome to Alchemist!");
	
	int play = JOptionPane.showConfirmDialog(null, "Would you like to play?");
	// 0 = yes, 1 = no, 2 = cancel
	if(play == 1){
		JOptionPane.showMessageDialog(null, "Okay, then.  Play again some other time!");
		System.exit(0);
	}else if(play == 0){
		JOptionPane.showMessageDialog(null, "Great!  Let's play!");
	}
	
	JOptionPane.showMessageDialog(null, "Okay, let me tell you the rules.");
	JOptionPane.showMessageDialog(null, "RULES: \n 1. Do not use capital letters. \n 2. Have fun!");
	JOptionPane.showMessageDialog(null, "Now that you know the rules, let's get started!");
	
	JOptionPane.showMessageDialog(null, "Okay, so these are your basic starting elements: \n" + elements[0] + "\n" + elements[1] + "\n" + elements[2] + "\n" + elements[3] + "\n");
	JOptionPane.showMessageDialog(null, "Your job is to combine elements to create new elements!  Here, lets give it a try.");
	String test = JOptionPane.showInputDialog(null,"To combine elements, type the elements like this: \n (Element Here) + (Other Element Here) \n Remember, no capital letters!  Practice combining fire and water (in that order) below.");
}
}
