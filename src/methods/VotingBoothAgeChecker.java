package methods;

import javax.swing.JOptionPane;

public class VotingBoothAgeChecker {
public static void main(String[] args) {
	String VoterAge = JOptionPane.showInputDialog(null,"What's your age?");
	int VoterAgeInteger = Integer.parseInt(VoterAge);
	if (VoterAgeInteger >= 18) {
		JOptionPane.showMessageDialog(null,"Please Proceed To The Voting Booth.");
	}
	else{
		JOptionPane.showMessageDialog(null, "You are only " + VoterAge + ". You cannot vote until you are 18!");
	}
	
}
}
