import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Code4Life {

	// 2. If it's less than 2, tell them to stop watching YouTube and write code
	// instead.

	// 3. If it's more than 5, play the Batman theme song.

	public static void main(String[] args) {
	
			
			String hoursOfCode = JOptionPane.showInputDialog("How many hours have you spent coding this week?");
			int hoursOfCodeInt = Integer.parseInt(hoursOfCode);

			if(hoursOfCodeInt>=3 && hoursOfCodeInt<5){
JOptionPane.showMessageDialog(null, "You are a Code Ninja!");
	}else if(hoursOfCodeInt<=2){
				JOptionPane.showMessageDialog(null, "Stop watching YouTube and start writing code!");
			}else if(hoursOfCodeInt>=5){
				playBatmanTheme();
			}

				
				
				
				
				
				
			}	
		

	private static void playBatmanTheme() {
			try {
				AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/batman.wav"));
				Clip clip = AudioSystem.getClip();
				clip.open(audioInputStream);
				clip.start();
				Thread.sleep(60002);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

}
