package lab3_Loops;
import hevs.graphics.FunGraphics;
import java.awt.Color;

public class task5 {
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
        final int WIDTH = 256;
		final int HEIGHT = 256;

		// Create and set the windows up
		FunGraphics display = new FunGraphics(WIDTH, HEIGHT);
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                display.setPixel(i, j, new Color(i, 0, j));
                wait(1);
            }
        }
    }
}
