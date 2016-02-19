package day1.robot;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	Robot me = new Robot();
	

	void go() {
		// 4. Make the robot move as fast as possible

		// 5. Set the pen width to 5

		// 6. Do steps #7 to #8 four times...

			// 7. Set the pen color to random
	
		drawSquare();
	
			// 8. Turn the robot 90 degrees to the right

	}

	/* 3. Fill in the code to draw a square inside the method below. */

void drawSquare(){
	for (int i = 0; i < 4; i++) {
		me.setPenWidth(5);
		me.setSpeed(99999999);
		me.setRandomPenColor();
		me.penDown();
		me.move(100);
		me.turn(90);
	}	
	
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
