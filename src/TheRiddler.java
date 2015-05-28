import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		JOptionPane.showMessageDialog(null, "Each time you answer a riddle, your score will print out below. Hint: no capital letters.");
		System.out.println(score);

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/the-riddler
	String answer = JOptionPane.showInputDialog(null, "What can be in a pants pocket, even if the pocket is empty?");

		// 4. If they got the answer right, pop up "correct!" and increase the score by one
	if (answer.contains("hole"))
	{
		JOptionPane.showMessageDialog(null, "Correct!");
		score = score + 1;
	System.out.println(score);
	}
	else{
		JOptionPane.showMessageDialog(null, "Sorry, the answer is a hole.");
		System.out.println(score);
	}
	
	String answer2 = JOptionPane.showInputDialog("What word becomes shorter when you add two letters to it?");
	
	if(answer2.contains("short"))
	{
		JOptionPane.showMessageDialog(null, "Correct!");
		score = score + 1;
		System.out.println(score);
	}
	else{
		JOptionPane.showMessageDialog(null, "Sorry, the answer is the word short.");
		System.out.println(score);
	}
	


		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}
