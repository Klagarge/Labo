package lab3;
import hevs.graphics.FunGraphics;
//import java.awt.Color;

public class task7 {
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
        
        int width = 1000;
        int height = 1000;
        int delay = 1;
        int tps_total = 600000;
        FunGraphics display = new FunGraphics(width, height);

        
        for (double i = 0; i < (tps_total/delay); i+= 0.01) {
            display.setPixel( (int)(400*Math.sin(i) / (1+Math.cos(i)*Math.cos(i))+500) , (int)((400*Math.sin(i)*Math.cos(i)) / (1+Math.cos(i)*Math.cos(i))+500));
            wait(delay); 
            //mieux par gestion du framreate (voir sur le site https://inf1.begincoding.net/la-librairie-fungraphics-2/)
        }


    }
}
