package day3;

//Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	public static void main(String[] args) {

		int random = new Random().nextInt(4);

		JOptionPane.showMessageDialog(null, "" + random);
		JOptionPane.showInputDialog("Enter a question");
		// 5. If the random number is 0
		if (random==(0)) {

		} else {

		}
		// -- tell the user "Yes"

		// 6. If the random number is 1

		// -- tell the user "No"

		// 7. If the random number is 2

		// -- tell the user "Maybe you should ask Google?"

		// 8. If the random number is 3

		// -- write your own answer
	}
}
