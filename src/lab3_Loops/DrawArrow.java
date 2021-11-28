package lab3_Loops;
import hevs.graphics.FunGraphics;
import java.awt.Color;

/**
 * Class using FunGraphics class to draw an arrow.
 */
public class DrawArrow {
	public static void wait(int ms)
{
    try
    {
        Thread.sleep(ms);
    }
    catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    }
}
	public static void main(String[] args) {
		final int WIDTH = 640;
		final int HEIGHT = 480;

		// Create and set the windows up
		FunGraphics display = new FunGraphics(WIDTH, HEIGHT);

		//Set the drawing color to black
		display.setColor(Color.black);
		
		/*
		 * Here, you have to modify the code to draw an arrow using setPixel()
		 */

		 for (int i = 0; i < 100; i++) {
			 display.setPixel(200+i, 200);;
			 wait(10);
		 }
		for (int i = 0; i < 20; i++) {
			display.setPixel(300-i, 200+i);
			wait(10);
		}
		for (int i = 0; i < 20; i++) {
			display.setPixel(300-i, 200-i);
			wait(10);
		}
	}
}
