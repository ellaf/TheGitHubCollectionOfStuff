// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

import java.awt.Color;


import org.teachingextensions.logo.Colors;
//import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;


public class TortoiseColorChooser {
	public static void main(String[] args) {
int Angles = (180/3);
	Tortoise.setAnimal(Animals.Unicorn);
	Tortoise.setSpeed(10);

		//3. ask the user what color they would like the tortoise to draw
	String Color = JOptionPane.showInputDialog(null, "What color would you like the unicorn to draw with? The options are: pink, blue, red, and yellow. Or, try a random color (write random)!");
		//4. use an if/else statement to set the pen color that the user requested
if (Color.equals ("pink")) {
	Tortoise.setPenColor(Colors.Pinks.LightPink);
}
else if (Color.equals ("blue")) {
	Tortoise.setPenColor(Colors.Blues.CornflowerBlue);
}
else if (Color.equals ("red")) {
	Tortoise.setPenColor(Colors.Reds.FireBrick);
}
else if (Color.equals ("yellow")) {
	Tortoise.setPenColor(Colors.Yellows.Gold);
}
else if (Color.equals ("random")) {
	Tortoise.setPenColor(Colors.getRandomColor());
}
//5. if the user doesn’t enter anything, choose a random color

//6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
	Tortoise.setPenWidth(1);
		
	//1. make the tortoise draw a shape (this will take more than one line of code)
for (int i = 0; i < 1000; i++) {
	Tortoise.turn(Angles);
 Tortoise.move(i);
 Tortoise.turn(Angles + 2);
	
}



	}
}
