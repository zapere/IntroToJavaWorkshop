package day3;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot me = new Robot();

		while (true) {
			String color = JOptionPane.showInputDialog("What color line do you want?");

			if (color.equals("blue")) {
				System.out.println("Blue");
				me.setPenColor(Color.BLUE);
			} else if (color.equals("yellow")) {
				System.out.println("Yellow");
				me.setPenColor(Color.YELLOW);
			} else {
				System.out.println("Red");
				me.setPenColor(Color.RED);
			}
			if (color.equals("")) {
				me.setRandomPenColor();
			}
			// 6. put a loop around your code so that you keep asking the user
			// for
			// more colors & drawing them
			me.setSpeed(100);
			me.setPenWidth(10);
			me.penDown();
			me.move(100);
			me.turn(90);
			me.move(100);
			me.turn(90);
			me.move(100);
			me.move(100);
			me.turn(90);
			me.move(100);
			me.move(100);
			me.turn(90);
			me.move(100);
			me.move(100);
			me.turn(90);

		}
	}
}