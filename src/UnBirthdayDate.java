import java.net.URI;

import javax.swing.JOptionPane;

public class UnBirthdayDate {
public static void main(String[] args) {
	
String birthday = JOptionPane.showInputDialog("When is your birthday? \n \n Write it like this: month / day \n For example: 05/16 ");
	if(birthday.contains("11") && birthday.contains("18")){
	playVideo("https://www.youtube.com/watch?v=qCJSNMqub8g");
	}else{
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
