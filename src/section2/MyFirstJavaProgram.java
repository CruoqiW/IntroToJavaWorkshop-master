package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		Robot r2=new Robot();
		r2.miniaturize();
		r2.setSpeed(500);
	r2.move(500);
	for(int i=0; i<4;i++) {
		r2.turn(90);
		r2.move(10);
		
	}
	
	
		
		
	}
}
