package day3;

//Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	public static void main(String[] args) {

		int random = new Random().nextInt(4);
		String answer = JOptionPane.showInputDialog("Enter a question");
		if (answer.contains("rich")) {
			JOptionPane.showMessageDialog(null, "have fun with that!");
		} else if (random == (0)) {
			JOptionPane.showMessageDialog(null, "yes");
		} else if (random == (1)) {
			JOptionPane.showMessageDialog(null, "no");
		} else if (random == (2)) {
			JOptionPane.showMessageDialog(null, "maybe you should ask google! xD");
		} else if (random == (3)) {
			JOptionPane.showInputDialog("write your own answer");
		}

	}
}