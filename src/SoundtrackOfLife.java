import java.net.URI;

import javax.swing.JOptionPane;

public class SoundtrackOfLife {

	public static void main(String[] args) {

		// 1. Adjust this pop-up to find out what mood the user is in.
		int userMood = JOptionPane.showOptionDialog(null, "What is your current mood?", "The Mood Analyzer", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Happy", "Sad", "Bored", "Unicorn-y", "Stressed"}, null);
		
		// 2. Their answer is stored in the userMood variable. Print it out.
System.out.println(userMood);
		// 3. If they are in a stressed mood, use the playVideo method to play a calming song from YouTube.
if(userMood == 0){
playVideo("https://www.youtube.com/watch?v=y6Sxv-sUYtM");
}else if(userMood == 1){

}else if(userMood == 2){
playVideo("https://www.youtube.com/watch?v=q7uyKYeGPdE");
}else if(userMood == 3){
playVideo("https://www.youtube.com/watch?v=qRC4Vk6kisY");
}else if(userMood == 4){

}else if(userMood == 5){

}
		// 4. Play different songs for other moods.

		// If you are seeing ads at the beginning of your videos, install Adblock.

	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


