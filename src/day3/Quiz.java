package day3;

import javax.swing.JOptionPane;

public class Quiz {
	public static void main(String[] args) {
		String me = JOptionPane.showInputDialog("Where are you right now?");
		if (me.equals("the library")) {
			JOptionPane.showMessageDialog(null, "good job you're not lost!");
		} else {
			JOptionPane.showMessageDialog(null, "are you lost?");
		}
		String you = JOptionPane.showInputDialog("If you look out the right window what do you see?");
		if (you.equals("a tall building")) {
			JOptionPane.showConfirmDialog(null, "Good you can see!");
		} else {
			JOptionPane.showMessageDialog(null, "Are you going blind?");
		}
	}
}
