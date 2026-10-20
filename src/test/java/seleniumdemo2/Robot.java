package seleniumdemo2;

//import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Robot {

    public static void main(String[] args)
            throws Exception {

    	java.awt.Robot  robot = new java.awt.Robot();

        // Press Windows + R
        robot.keyPress(KeyEvent.VK_WINDOWS);
        robot.keyPress(KeyEvent.VK_R);

        robot.keyRelease(KeyEvent.VK_R);
        robot.keyRelease(KeyEvent.VK_WINDOWS);

        Thread.sleep(1000);

        // Type NOTEPAD
        robot.keyPress(KeyEvent.VK_N);
        robot.keyRelease(KeyEvent.VK_N);

        robot.keyPress(KeyEvent.VK_O);
        robot.keyRelease(KeyEvent.VK_O);

        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_T);

        robot.keyPress(KeyEvent.VK_E);
        robot.keyRelease(KeyEvent.VK_E);

        robot.keyPress(KeyEvent.VK_P);
        robot.keyRelease(KeyEvent.VK_P);

        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);

        robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_D);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        Thread.sleep(1000);
        
        //window to close
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_W);
        
        robot.keyRelease(KeyEvent.VK_W);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        
        Thread.sleep(1000);
        
        //Dont save
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        
        Thread.sleep(500);
       // robot.keyPress(KeyEvent.VK_ENTER);
       // robot.keyRelease(KeyEvent.VK_ENTER);
    }
}