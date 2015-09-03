import org.jointheleague.graphical.robot.Robot;
import org.teachingextensions.logo.Colors;


public class RobotFriend {
public static void main(String[] args) {
	Robot Walter = new Robot ();

	Walter.penDown();
	Walter.setSpeed(5);
	
	Walter.sparkle();
	Walter.move(100);
	Walter.move(-50);
	Walter.turn(90);
	Walter.move(75);
	Walter.turn(90);
	Walter.move(-50);
	Walter.move(100);
	Walter.move(-50);
	Walter.turn(-90);
	Walter.penUp();
	Walter.move(50);
	Walter.penDown();
	Walter.turn(-90);
	Walter.move(-50);
	Walter.move(100);
	Walter.move(-50);
	Walter.turn(90);
	Walter.penUp();
	Walter.move(200);

	

}
}
