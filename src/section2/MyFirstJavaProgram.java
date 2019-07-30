package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
Robot Tommy=new Robot();	
Tommy.penDown();
Tommy.setSpeed(100);
Tommy.move(100);		
Tommy.turn(90);		
Tommy.move(100);
Tommy.turn(90);	
Tommy.move(100);
Tommy.turn(90);
Tommy.move(100);
	}
}
