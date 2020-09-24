package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lotterynumber {
public static void main(String[] args) {
	Random ran = new Random();
	int randomChoice1 = ran.nextInt(10);
	int randomChoice2 = ran.nextInt(10);
	int randomChoice3 = ran.nextInt(10);
	int randomChoice4 = ran.nextInt(10);
	int randomChoice5 = ran.nextInt(10);
	int randomChoice6 = ran.nextInt(10);
	
	JOptionPane.showMessageDialog(null, +randomChoice1+","+randomChoice2+","+randomChoice3+","+randomChoice4+","+randomChoice5+","+randomChoice6);
	
	
	
}
}
