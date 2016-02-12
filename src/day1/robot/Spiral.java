package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
	
		
		Robot troll = new Robot();
		troll.penDown();
		troll.setSpeed(10);
		for (int i = 0; i < 99999999; i++) {
			troll.setRandomPenColor();		
			troll.setRandomPenColor();
			troll.move(5*i);
			troll.turn(50);
			troll.setPenWidth(i);
		}
	}
}
