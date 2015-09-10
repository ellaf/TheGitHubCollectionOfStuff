import javax.swing.JOptionPane;

/**
 * Teacher's Note: 
 * Have the kids play with the Speak & Spell. 
 * The first Speak & Spell was introduced at the summer Consumer Electronics Show in June 1978, making it 
 * one of the earliest handheld electronic devices with a visual display to use interchangeable game cartridges. 
 * Discuss with students how you would make this program. 
 * Allow them to code it themselves, or use this recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
	
	JOptionPane.showMessageDialog(null, "WARNING: Mispronunciation may be present in this game. :)");
		
speak("Spell interrogative");
String answer = JOptionPane.showInputDialog("Spell the word here:");
if(answer.equalsIgnoreCase("interrogative")){
	JOptionPane.showMessageDialog(null, "Correct! The word is interrogative!");
}else{
	JOptionPane.showMessageDialog(null, "Sorry! The word is interrogative, not " + answer + ".");
}

String playAgain = JOptionPane.showInputDialog("Play Again?");
keepGoing(playAgain);

speak("Spell verisimilitude");
String answer2 = JOptionPane.showInputDialog("Spell the word here:");
if(answer2.equalsIgnoreCase("verisimilitude")){
	JOptionPane.showMessageDialog(null, "Correct! The word is verisimilitude!");
}else{
	JOptionPane.showMessageDialog(null, "Sorry! The word is verisimilitude, not " + answer + ".");
}

String playAgain2 = JOptionPane.showInputDialog("Play Again?");
keepGoing(playAgain2);

speak("Spell ramifications.  Remember, this one is plural!");
String answer3 = JOptionPane.showInputDialog("Spell the word here:");
if(answer3.equalsIgnoreCase("ramifications")){
	JOptionPane.showMessageDialog(null, "Correct! The word is ramifications!");
}else{
	JOptionPane.showMessageDialog(null, "Sorry! The word is ramifications, not " + answer + ".");
}

String playAgain3 = JOptionPane.showInputDialog("Play Again?");
keepGoing(playAgain3);

speak("Spell fuliginous");
String answer4 = JOptionPane.showInputDialog("Spell the word here:");
if(answer4.equalsIgnoreCase("fuliginous")){
	JOptionPane.showMessageDialog(null, "Correct! The word is fuliginous!");
}else{
	JOptionPane.showMessageDialog(null, "Sorry! The word is fuliginous, not " + answer + ".");
}

String playAgain4 = JOptionPane.showInputDialog("Play Again?");
keepGoing(playAgain4);

speak("Spell mediterranean");
String answer5 = JOptionPane.showInputDialog("Spell the word here:");
if(answer5.equalsIgnoreCase("mediterranean")){
	JOptionPane.showMessageDialog(null, "Correct! The word is mediterranean!");
}else{
	JOptionPane.showMessageDialog(null, "Sorry! The word is mediterranean, not " + answer + ".");
}

String playAgain5 = JOptionPane.showInputDialog("Play Again?");
keepGoing(playAgain5);

speak("Spell changeable");
String answer6 = JOptionPane.showInputDialog("Spell the word here:");
if(answer6.equalsIgnoreCase("changeable")){
	JOptionPane.showMessageDialog(null, "Correct! The word is changeable!");
}else{
	JOptionPane.showMessageDialog(null, "Sorry! The word is changeable, not " + answer + ".");
}

String playAgain6 = JOptionPane.showInputDialog("Play Again?");
keepGoing(playAgain6);

speak("Spell daiquiri");
String answer7 = JOptionPane.showInputDialog("Spell the word here:");
if(answer7.equalsIgnoreCase("daiquiri")){
	JOptionPane.showMessageDialog(null, "Correct! The word is daiquiri!");
}else{
	JOptionPane.showMessageDialog(null, "Sorry! The word is daiquiri, not " + answer + ".");
}

String playAgain7 = JOptionPane.showInputDialog("Play Again?");
keepGoing(playAgain7);

speak("Spell fiery");
String answer8 = JOptionPane.showInputDialog("Spell the word here:");
if(answer8.equalsIgnoreCase("fiery")){
	JOptionPane.showMessageDialog(null, "Correct! The word is fiery!");
}else{
	JOptionPane.showMessageDialog(null, "Sorry! The word is fiery, not " + answer + ".");
}

String playAgain8 = JOptionPane.showInputDialog("Play Again?");
keepGoing(playAgain8);

speak("Spell inoculate");
String answer9 = JOptionPane.showInputDialog("Spell the word here:");
if(answer9.equalsIgnoreCase("inoculate")){
	JOptionPane.showMessageDialog(null, "Correct! The word is inoculate!");
}else{
	JOptionPane.showMessageDialog(null, "Sorry! The word is inoculate, not " + answer + ".");
}

String playAgain9 = JOptionPane.showInputDialog("Play Again?");
keepGoing(playAgain9);

speak("Spell liaison");
String answer10 = JOptionPane.showInputDialog("Spell the word here:");
if(answer10.equalsIgnoreCase("liaison")){
	JOptionPane.showMessageDialog(null, "Correct! The word is liaison!");
}else{
	JOptionPane.showMessageDialog(null, "Sorry! The word is liaison, not " + answer + ".");
}

String playAgain10 = JOptionPane.showInputDialog("Play Again?");
keepGoing(playAgain10);

speak("Spell maneuver");
String answer11 = JOptionPane.showInputDialog("Spell the word here:");
if(answer11.equalsIgnoreCase("maneuver")){
	JOptionPane.showMessageDialog(null, "Correct! The word is maneuver!");
}else{
	JOptionPane.showMessageDialog(null, "Sorry! The word is maneuver, not " + answer + ".");
}

speak("That's the end of the game. I hope you had fun!");


		// 3. If the user spelled the word correctly, speak "correct"

		// 4. Otherwise say "wrong"

		// 5. repeat the process for other words
		
	}

	private static void keepGoing(String playAgain) {
		if (playAgain.contains("yes")) {
			speak("Great! Let's spell another word!");
		}else if(playAgain.contains("Yes")){
			speak("Great! Let's spell another word!");
		}else if(playAgain.contains("YES")){
			speak("Great! Let's spell another word!");
		}else{
		speak("Okay, see you another time!");
			System.exit(0);
		}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
