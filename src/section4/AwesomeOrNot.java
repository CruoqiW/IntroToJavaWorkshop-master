package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {
public static void main(String[] args) {
	

	// 1. Make a main method that includes all the steps below…

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int Random = new Random().nextInt(4);
	// 3. Print out this variable
System.out.println(Random);
	// 4. Get the user to enter something that they think is awesome
JOptionPane.showInputDialog("What do you think is awesome");
// 5. If the random number is 0

	// -- tell the user whatever they entered is awesome!
if(Random == 0){JOptionPane.showMessageDialog(null, "Whatever you enter is awesome ");

}
	// 6. If the random number is 1

	// -- tell the user whatever they entered is ok.
if(Random == 1) {JOptionPane.showMessageDialog(null, "Whatever you enter is ok");

}
	// 7. If the random number is 2

	// -- tell the user whatever they entered is boring.
if(Random == 2) {JOptionPane.showMessageDialog(null, "Whatever you enter is boring");

}
	// 8. If the random number is 3

	// -- write your own answer
if(Random == 3) {JOptionPane.showMessageDialog(null, "Write your own answer");
}}}
