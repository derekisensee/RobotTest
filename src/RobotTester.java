import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class RobotTester {
	Robot rob = new Robot();
	
	public static void main (String[] args) throws AWTException {
		new RobotTester();
	}
	
	public RobotTester() throws AWTException {
		rob.mouseMove(500, 130);
	}

}
