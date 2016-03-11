package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		String me = JOptionPane.showInputDialog("Do you know how to write code?");
				if ((me.equals("Yes")) || (me.equals("yes"))) {
			JOptionPane.showMessageDialog(null, "You will rule the world!");
		} else {
			JOptionPane.showMessageDialog(null, "Good luck washing dishes!");
		}

	}
}
