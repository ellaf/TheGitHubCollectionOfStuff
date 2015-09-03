import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class DontForgetTheLyrics {
	/*
	 * For this game, we'll play the start of a song, and the player has to guess the rest of the lyrics.
	 * 
	 * 1. To record a sound clip, open Audacity and record your song.
	 * 
	 * 2. Click File -> Export Audio, and save your file on the Desktop.
	 * 
	 * 3. Drag your file from the Desktop into the "default package" under "src".
	 */
	
	public static void main(String[] args) {
		// 4. Make a pop-up to explain the game.
JOptionPane.showMessageDialog(null, "Welcome to the Don't Forget the Lyrics: Disney Edition Game!");
JOptionPane.showMessageDialog(null, "In this game, I'll play a song for you.  Then, you write in the next lyric. Ready? Let's play!");
		// 5. Use the playSound method to play your song.
playSound("MakeAManOutOfYou.wav");
		// 6. Make a pop-up for the player to type their answer.
String Mulan = JOptionPane.showInputDialog("Alright, what do you think the next line is?");
if (Mulan.contains ("tranquil")){
	JOptionPane.showMessageDialog(null, "Nice job! You got it!");
}else if (Mulan.contains ("forest")){
	JOptionPane.showMessageDialog(null, "Nice job! You got it!");
}else if (Mulan.contains ("Tranquil")){
	JOptionPane.showMessageDialog(null, "Nice job! You got it!");
}else if (Mulan.contains ("Forest")){
	JOptionPane.showMessageDialog(null, "Nice job! You got it!");
}else{
		JOptionPane.showMessageDialog(null, "Sorry, that's not it.  The next line was: 'Tranquil as a forest'.");
}
String Again = JOptionPane.showInputDialog("Want to play again?");
if(Again.contains ("yes")){
JOptionPane.showMessageDialog(null, "Great! Alright, here's another song!");
}else if(Again.contains ("Yes")){
	JOptionPane.showMessageDialog(null, "Great! Alright, here's another song!");
}else{
	System.exit(0);
}
		// 7. If they answered correctly, tell them that they were right.

		// 8. Otherwise, tell them they are wrong, and give them the answer.

		// 9. Record another sound and repeat steps 5-8.

		// 10. [optional] Add a points variable that will calculate their final score.
	}

	public static void playSound(String fileName) {
		AudioClip audioClip = JApplet.newAudioClip(new DontForgetTheLyrics().getClass().getResource(fileName));
		audioClip.play();
	}
}
