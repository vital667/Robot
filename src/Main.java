import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Main {
    Robot robot = new Robot();

    public Main() throws AWTException {
    }

    public static void main(String[] args) {

        try {
            Robot robot = new Robot();
            robot.delay(500);
            for (int i = 0; i < 5; i++) {
                robot.keyPress(KeyEvent.VK_H);
                robot.keyPress(KeyEvent.VK_E);
                robot.keyPress(KeyEvent.VK_L);
                robot.keyPress(KeyEvent.VK_L);
                robot.keyPress(KeyEvent.VK_O);
                robot.keyPress(KeyEvent.VK_O);
                robot.keyPress(KeyEvent.VK_SPACE);
                robot.keyPress(KeyEvent.VK_W);
                robot.keyPress(KeyEvent.VK_O);
                robot.keyPress(KeyEvent.VK_R);
                robot.keyPress(KeyEvent.VK_L);
                robot.keyPress(KeyEvent.VK_D);
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.delay(500);
            }

            robot.keyPress(KeyEvent.VK_E);
            robot.delay(200);
            robot.keyPress(KeyEvent.VK_C);
            robot.delay(200);
            robot.keyPress(KeyEvent.VK_H);
            robot.delay(200);
            robot.keyPress(KeyEvent.VK_O);
            robot.delay(200);
            for (int i = 1; i < 5; i++) {
                robot.keyPress(KeyEvent.VK_PERIOD);
                robot.keyPress(KeyEvent.VK_SPACE);
                robot.delay(800);
            }

            click(500, 500);

        } catch (AWTException e) {
            e.printStackTrace();
        }
    }


    public static void click(int x, int y) throws AWTException {
        Robot bot = new Robot();
        bot.mouseMove(x, y);
        bot.mousePress(InputEvent.BUTTON1_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_MASK);
    }
}