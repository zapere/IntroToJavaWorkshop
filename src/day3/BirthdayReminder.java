package day3;

import javax.swing.JOptionPane;

public class BirthdayReminder {
	// Copyright Wintriss Technical Schools 2013

	public static void main(String[] args) {

		String momsBirthday = "August 7th";
		String dadsBirthday = "July 29";
		String myBirthday = "June 12th";

		String family = JOptionPane.showInputDialog("Whos Birthday did you forget this time?");

		JOptionPane.showMessageDialog(null, "How do you keep forgetting " + family +" birthday");
		if (family.equals("moms")) {
			JOptionPane.showMessageDialog(null, "Her birthday is on " + momsBirthday);
		} else if (family.equals("dads")) {
			JOptionPane.showMessageDialog(null, "His birthday is on " + dadsBirthday);
		}

		else if (family.equals("mine")) {
			JOptionPane.showMessageDialog(null, "Are you kidding me its your birthday! Its on " + myBirthday);
		}

		else {
			JOptionPane.showMessageDialog(null, "Sorry pal dont remember that one!");
		}
	}
}
