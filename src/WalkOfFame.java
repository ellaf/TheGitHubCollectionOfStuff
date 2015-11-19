import org.teachingextensions.logo.Tortoise;

public class WalkOfFame {
public static void main(String[] args) {
Tortoise.setSpeed(10);


for (int x = 0; x < 10; x++) {
	

	Tortoise.penUp();
	Tortoise.turn(90);
	Tortoise.move(100);
	Tortoise.turn(90);
	Tortoise.move(52);
	Tortoise.turn(180);
	Tortoise.penDown();


for (int i = 0; i < 5; i++) {

Tortoise.turn(72);
	Tortoise.move(20);
}
Tortoise.move(32);
for (int t = 0; t < 5; t++) {
	
Tortoise.turn(144);
Tortoise.move(82);
}
}


}
}