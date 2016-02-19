package day3;

import javax.swing.JOptionPane;

public class Creeper {
public static void main(String[] args) {
	String you = JOptionPane.showInputDialog(null, "Whats your name?");
	JOptionPane.showMessageDialog(null, "Hi"+you);
	String Me = JOptionPane.showInputDialog(null, "Where do you live?");
	JOptionPane.showMessageDialog(null, "I know you live at:" + Me);
	String elijah = JOptionPane.showInputDialog(null, "How old are you?");
    JOptionPane.showMessageDialog(null, "And now I know your "+elijah +you);
    eat strafe
}
}
