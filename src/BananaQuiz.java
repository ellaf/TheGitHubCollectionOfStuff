import javax.swing.JOptionPane;
public class BananaQuiz {
public static void main(String[] args) {
	
		String bananas = JOptionPane.showInputDialog("Do you like bananas?");
		if(bananas.equalsIgnoreCase("no")){
		JOptionPane.showMessageDialog(null, "You're crazy!");
		System.exit(0);
		}
		
		String hobby = JOptionPane.showInputDialog("What is your favorite hobby?");
		JOptionPane.showMessageDialog(null, hobby + " is much better with bananas!");
}
}
