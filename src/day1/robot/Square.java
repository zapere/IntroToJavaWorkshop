package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Square {
public static void main(String [] args) {
Robot Kat = new Robot();
Robot Me = new Robot();
Kat.penDown();
Kat.setSpeed(3000);
Me.penDown();
Me.setSpeed(3000);
for (int i = 0; i < 700; i++) {
	Kat.move(150);
	Kat.turn(90);
	Kat.setRandomPenColor();
	Me.move(150);
	Me.turn(90);
	Me.setRandomPenColor();
}
}
}
