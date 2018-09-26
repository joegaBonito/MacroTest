package joe;

import java.awt.AWTException;
import java.awt.GraphicsDevice;
import java.awt.MouseInfo;
import java.awt.Robot;

import com.sun.glass.events.KeyEvent;

public class MacroTest{

	  Robot robot = new Robot();

	  public static void main(String[] args) throws AWTException {
	    new MacroTest();
	  }
	  
	  public MacroTest() throws AWTException {
//		  robot.setAutoDelay(40);
//		  robot.setAutoWaitForIdle(true);
//		  for(int i = 0; i < 10; i++) {
//		  type("Hello, world");
//		  robot.delay(40);
//		  robot.keyPress(KeyEvent.VK_ENTER);
//		  robot.keyRelease(KeyEvent.VK_ENTER);
//		  }
		  mousePosition();
	  }
	  
	  private void type(String s) {
	    byte[] bytes = s.getBytes();
	    for (byte b : bytes)
	    {
	      int code = b;
	      // keycode only handles [A-Z] (which is ASCII decimal [65-90])
	      if (code > 96 && code < 123) code = code - 32;
	      robot.delay(40);
	      robot.keyPress(code);
	      robot.keyRelease(code);
	    }
	  }
	  
	  private void mousePosition() {
		  while(true){
		      try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      System.out.println("(" + MouseInfo.getPointerInfo().getLocation().x + 
		              ", " + 
		              MouseInfo.getPointerInfo().getLocation().y + ")");
		    }

	  }
}
