package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int x = 0;
		// 2. Ask the user a question
		String a = JOptionPane.showInputDialog("What is 1+1");
		// 3. Use an if statement to check if their answer is correct
		if (a.equals("2")) {
			JOptionPane.showMessageDialog(null, "correct");
		} else {
			JOptionPane.showMessageDialog(null, "wrong");
			// 4. if the user's answer is correct

			// -- add one to their score
			x = 1;
			// 5. Create more questions by repeating steps 1, 2, and 3 below.
			String question1 = JOptionPane.showInputDialog("What is 1+2");
			String question2 = JOptionPane.showInputDialog("What is 1+3");
			String question3 = JOptionPane.showInputDialog("What is 1+4");
			if (question1.equals("3")) {
				JOptionPane.showMessageDialog(null, "correct");
			} else {
				JOptionPane.showMessageDialog(null, "wrong");

			}
		}

		// 6. After all the questions have been asked, print the user's score

	}
}
