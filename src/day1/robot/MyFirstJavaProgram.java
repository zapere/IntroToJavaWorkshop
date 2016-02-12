package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot TGFU = new Robot();
TGFU.setSpeed(3000);
TGFU.moveTo(250, 500);
TGFU.penDown();
TGFU.setPenWidth(30);
TGFU.setPenColor(10, 0, 10);
TGFU.move(300);
TGFU.turn(90);
TGFU.setPenColor(10, 200, 200);
TGFU.move(300);
TGFU.turn(90);
TGFU.setPenColor(10, 0, 10);
TGFU.move(300);
TGFU.turn(90);
TGFU.setPenColor(10, 200, 200);
TGFU.move(300);
TGFU.turn(90);
TGFU.move(150);
TGFU.turn(90);
TGFU.move(150);
TGFU.turn(90);
TGFU.move(150);
TGFU.turn(180);
TGFU.move(300);
TGFU.turn(180);
TGFU.move(150);
TGFU.turn(270);
TGFU.move(150);
		
		
	}
}
