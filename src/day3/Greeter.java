package day3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String Me = JOptionPane.showInputDialog(null, "Whats your name?");
			JOptionPane.showMessageDialog(null, "Hi," +  Me);
		String Elijah = JOptionPane.showInputDialog(null, "How old are you");
		JOptionPane.showMessageDialog(null, "Nice!" + Me);
		
}
}
