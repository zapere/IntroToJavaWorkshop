package day3;

import javax.swing.JOptionPane;

public class UnBirthday {
	public static void main(String[] args) {
		String days = JOptionPane.showInputDialog("When is your birthday?");
		if (days.equals("April seventh")) {
			JOptionPane.showMessageDialog(null, "Happy birthday!");
		} else if (days.equals("4/7")) {
			JOptionPane.showMessageDialog(null, "Happy birthday!");
		} else if (days.equals("never")) {
			JOptionPane.showInputDialog("Well how are you here and alive?!... Whats your real birthday?");
		} else if (days.equals("april seventh")) {
			JOptionPane.showMessageDialog(null, "Happy birthday!");
		} else {
			JOptionPane.showMessageDialog(null, "Happy UNBirthday!");
		}
	}
}
