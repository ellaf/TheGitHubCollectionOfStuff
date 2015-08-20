// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class SpiralMaker {

	public static void main(String[] args) {
		
		Tortoise.setSpeed(10);
		
		// 3. Make a variable to hold the number of sides and set it to 0
		int sides = (0);
		
		// 4. Ask the user which spiral they would like (square, triangle, or pentagon)
		
		String shape = JOptionPane.showInputDialog("Which spiral would you like? \n -Square \n -Triangle \n -Pentagon \n -Hexagon \n -Heptagon \n -Octogon");
		
		
		// 5. Set the number of sides depending on what the user entered (multiple lines of code)
		
		if(shape.equalsIgnoreCase ("Square"))
		{
			
			shapeBuilding(4);
		}
		
		if(shape.equalsIgnoreCase ("Triangle"))
		{
			shapeBuilding(3);
		}
		
		if(shape.equalsIgnoreCase ("Pentagon"))
		{
			shapeBuilding(5);
		}
		
		if(shape.equalsIgnoreCase ("Hexagon"))
		{
			shapeBuilding(6);
		}
		
		if(shape.equalsIgnoreCase ("Heptagon"))
		{
			shapeBuilding(7);
		}
		if(shape.equalsIgnoreCase ("Octogon"))
		{
			shapeBuilding(8);
		}else{
			JOptionPane.showMessageDialog(null, "Sorry, I don't know how to draw a " + shape + ".");
		}
		
			
		
		// 6. If the user enters something else, say "Sorry, I don't know how to draw a ..."
	
		
		// 1. Make the Tortoise draw a square spiral shape. If you get stuck, use these instructions: http://bit.ly/YJUOkn
		
		
		
		
		// 2. Change your code to turn the square spiral into a triangle spiral
		
		
		
	}

	private static void shapeBuilding(int sides) {
		for (int i = 0; i < 100; i++) {
			Tortoise.move(9*i);
			Tortoise.turn(360/sides);
		}
	}

}

