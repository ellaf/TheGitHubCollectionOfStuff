import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;


public class ObedientTortoise {
public static void main(String[] args) {

	String shape = JOptionPane.showInputDialog("What shape would you like me to draw?  I can draw a square, a triangle, or a circle.");
	String color = JOptionPane.showInputDialog("And what color would you like you shape to be?  I can draw red, orange, yellow, green, blue, purple, or pink.");
	if(shape.equalsIgnoreCase("square") && color.equalsIgnoreCase ("red")){
		Tortoise.setPenColor(Color.RED);
		drawSquare();
	}else if(shape.equalsIgnoreCase("triangle") && color.equalsIgnoreCase ("red")){
		Tortoise.setPenColor(Color.RED);
		drawTriangle();
	}else if(shape.equalsIgnoreCase("circle") && color.equalsIgnoreCase ("red")){
		Tortoise.setPenColor(Color.RED);
		drawCircle();
	}else if(shape.equalsIgnoreCase("square") && color.equalsIgnoreCase ("orange")){
		Tortoise.setPenColor(Color.ORANGE);
		drawSquare();
	}else if(shape.equalsIgnoreCase("triangle") && color.equalsIgnoreCase ("orange")){
		Tortoise.setPenColor(Color.ORANGE);
		drawTriangle();
	}else if(shape.equalsIgnoreCase("circle") && color.equalsIgnoreCase ("orange")){
		Tortoise.setPenColor(Color.ORANGE);
		drawCircle();
	}else if(shape.equalsIgnoreCase("square") && color.equalsIgnoreCase ("yellow")){
		Tortoise.setPenColor(Color.YELLOW);
		drawSquare();
	}else if(shape.equalsIgnoreCase("triangle") && color.equalsIgnoreCase ("yellow")){
		Tortoise.setPenColor(Color.YELLOW);
		drawTriangle();
	}else if(shape.equalsIgnoreCase("circle") && color.equalsIgnoreCase ("yellow")){
		Tortoise.setPenColor(Color.YELLOW);
		drawCircle();
	}else if(shape.equalsIgnoreCase("square") && color.equalsIgnoreCase ("green")){
		Tortoise.setPenColor(Color.GREEN);
		drawSquare();
	}else if(shape.equalsIgnoreCase("triangle") && color.equalsIgnoreCase ("green")){
		Tortoise.setPenColor(Color.GREEN);
		drawTriangle();
	}else if(shape.equalsIgnoreCase("circle") && color.equalsIgnoreCase ("green")){
		Tortoise.setPenColor(Color.GREEN);
		drawCircle();
	}else if(shape.equalsIgnoreCase("square") && color.equalsIgnoreCase ("blue")){
		Tortoise.setPenColor(Color.BLUE);
		drawSquare();
	}else if(shape.equalsIgnoreCase("triangle") && color.equalsIgnoreCase ("blue")){
		Tortoise.setPenColor(Color.BLUE);
		drawTriangle();
	}else if(shape.equalsIgnoreCase("circle") && color.equalsIgnoreCase ("blue")){
		Tortoise.setPenColor(Color.BLUE);
		drawCircle();
	}else if(shape.equalsIgnoreCase("square") && color.equalsIgnoreCase ("purple")){
		Tortoise.setPenColor(Color.MAGENTA);
		drawSquare();
	}else if(shape.equalsIgnoreCase("triangle") && color.equalsIgnoreCase ("purple")){
		Tortoise.setPenColor(Color.MAGENTA);
		drawTriangle();
	}else if(shape.equalsIgnoreCase("circle") && color.equalsIgnoreCase ("purple")){
		Tortoise.setPenColor(Color.MAGENTA);
		drawCircle();
	}else if(shape.equalsIgnoreCase("square") && color.equalsIgnoreCase ("pink")){
		Tortoise.setPenColor(Color.PINK);
		drawSquare();
	}else if(shape.equalsIgnoreCase("triangle") && color.equalsIgnoreCase ("pink")){
		Tortoise.setPenColor(Color.PINK);
		drawTriangle();
	}else if(shape.equalsIgnoreCase("circle") && color.equalsIgnoreCase ("pink")){
		Tortoise.setPenColor(Color.PINK);
		drawCircle();
	}else if(shape.equalsIgnoreCase("circle") && color.equalsIgnoreCase ("pink")){
		Tortoise.setPenColor(Color.PINK);
		drawCircle();
	}else if(shape.equalsIgnoreCase("") && color.equalsIgnoreCase ("")){
		drawChevron();
		
	}
	
}

private static void drawChevron() {
	Tortoise.setSpeed(10);
	Tortoise.turn(67.5);
	Tortoise.move(100);
	Tortoise.turn(45);
	Tortoise.move(100);
	Tortoise.turn(167.5);
	Tortoise.move(95);
	Tortoise.turn(-20);
	Tortoise.move(95);
}

private static void drawCircle() {
	Tortoise.setSpeed(10);
	for (int i = 0; i < 360; i++) {
		Tortoise.move(1);
		Tortoise.turn(1);
	}
}

private static void drawTriangle() {
	Tortoise.setSpeed(5);
	for (int i = 0; i < 3; i++) {
		Tortoise.move(50);
		Tortoise.turn(120);
	}
}

private static void drawSquare() {
	Tortoise.setSpeed(5);
	for (int i = 0; i < 4; i++) {
		Tortoise.move(50);
		Tortoise.turn(90);
	}
}
}
