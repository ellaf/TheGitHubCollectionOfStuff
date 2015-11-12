import java.util.Random;

import javax.swing.JOptionPane;

public class VotingBoth {
public static void main(String[] args) {
	
	String age = JOptionPane.showInputDialog("How old are you?");
	int ageInt = Integer.parseInt(age);
	
	if(ageInt < 18){
		JOptionPane.showMessageDialog(null, "Nevermind, you're too young.");
		
	}else if(ageInt >= 18){
		JOptionPane.showInputDialog("Who do you think the next President should be?");
	}

	
	
	int i = new Random().nextInt(10);
	System.out.println(i);
}
}
