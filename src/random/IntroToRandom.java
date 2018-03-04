package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class IntroToRandom {
	public static void main(String[] args) {
		
		int r = 0;
		

		Random gen = new Random();
		r = gen.nextInt(50) + 25;
		JOptionPane.showMessageDialog(null, "Your lucky number is " + r + "! Try thinking about it when you feel sad.");
	}
}