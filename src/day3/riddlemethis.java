package day3;

import javax.swing.JOptionPane;

public class riddlemethis {

	public static void main(String[] args) {

		int score = 0;
		String me = JOptionPane.showInputDialog("What is at the end of a rainbow?");
		if (me.equals("w")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score = score + 1;

		} else {
			JOptionPane.showMessageDialog(null, "Cmon try harder you are wrong! The answer is w.");
		}

		// 6. Add some more riddles
		String you = JOptionPane.showInputDialog("What is coming but never arrives?");		if (you.equals("tomorrow")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score = score + 1;
		} else {
			JOptionPane.showMessageDialog(null, "Cmon try harder you are wrong! The answer is tomorrow");
		}
		JOptionPane.showMessageDialog(null, "Your score is currently " + score);
	}
}
