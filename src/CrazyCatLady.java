import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {

String cats = JOptionPane.showInputDialog(null, "How many cats do you have?");

int catsInt = Integer.parseInt(cats);

if(catsInt >= 3){
	JOptionPane.showMessageDialog(null, "You're a crazy cat lady!");
}else if(catsInt < 3 && catsInt > 0){
	playVideo("https://www.youtube.com/watch?v=tntOCGkgt98");
}else if(catsInt == 0){
	playVideo("https://www.youtube.com/watch?v=SKRgktzRvZ0");
}

	
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
