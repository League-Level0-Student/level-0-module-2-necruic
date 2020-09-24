package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class votingbooth {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("how old are you?");
	int ageint = Integer.parseInt(age);
	if(ageint >=18){
		JOptionPane.showInputDialog("who will you vote for?");
	}else {
		JOptionPane.showMessageDialog(null, "your opinion doesn't matter");
	}
}
}