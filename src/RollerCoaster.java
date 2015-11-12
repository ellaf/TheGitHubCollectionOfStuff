import javax.swing.JOptionPane;

public class RollerCoaster {
public static void main(String[] args) {
	
	String height = JOptionPane.showInputDialog("How tall are you in feet?");
	int heightInt = Integer.parseInt(height);
	
	if(heightInt < 4 ){
		
	JOptionPane.showMessageDialog(null, "Sorry, you're not tall enough.");
	}else if(heightInt >= 4){
		JOptionPane.showMessageDialog(null, "You can ride!");
	}
	
}
}
