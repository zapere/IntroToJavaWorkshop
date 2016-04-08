package day3;

import javax.swing.JOptionPane;

public class MorningZombie {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Wake up");
		JOptionPane.showMessageDialog(null, "Brush your teeth");
		JOptionPane.showMessageDialog(null, "Take a shower");
		JOptionPane.showMessageDialog(null, "Put some clothes on");
		String eat = JOptionPane.showInputDialog("What do you want for breakfast?");
		JOptionPane.showMessageDialog(null, "Ok! Ill make you some " + eat);
		JOptionPane.showMessageDialog(null, "Get socks and shoes on");
		JOptionPane.showMessageDialog(null, "Grab your phone");
		JOptionPane.showMessageDialog(null, "Get ready to go to school");
		JOptionPane.showMessageDialog(null, "Hate school");
		JOptionPane.showMessageDialog(null, "Now go to sleep");
	}
}
