import javax.swing.JOptionPane;


public class AreYouHappy {
public static void main(String[] args) {
	
Object[] options = {"Yes",
        "No"};
int happiness = JOptionPane.showConfirmDialog(null,
"Are you happy?");


if (happiness == 1) {
	Object[] options2 = {"Yes",
    "No"};
int happiness2 = JOptionPane.showConfirmDialog(null,
"Do you want to be happy?");
if (happiness2 == 1){
	JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
}else if(happiness2 == 0){
	JOptionPane.showMessageDialog(null, "Change something.");
}
}else if(happiness == 0) {
	JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
}





}
}
