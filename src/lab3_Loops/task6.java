package lab3_Loops;
import hevs.graphics.FunGraphics;
import java.awt.Color;

public class task6 {

    public static void main(String[] args) {
        int width = 400;
        int height = 400;
        boolean condition = false;
        FunGraphics display = new FunGraphics(width, height);

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                condition = false;
                int dist_x = Math.abs(i-200);
                int dist_y = Math.abs(j-200);
                int distance = (int) Math.sqrt( Math.pow(dist_x, 2) + Math.pow(dist_y, 2));
                // pythagore pour distance
                if (distance < 100) {
                    condition = true;
                }

                if (condition) {
                    display.setPixel(i, j, Color.BLUE);
                } else {
                    display.setPixel(i, j, Color.RED);
                }
            }
        }
    }
    
}
