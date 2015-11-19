import java.net.URI;

import javax.swing.JOptionPane;

public class UnBirthday {
public static void main(String[] args) {
int birthday = JOptionPane.showConfirmDialog(null, "Is it your birthday today?");
if(birthday == 0){
playVideo("https://www.youtube.com/watch?v=qCJSNMqub8g");
}else if(birthday == 1){
	playVideo("https://www.youtube.com/watch?v=RdsZT7WKjW8");
}



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