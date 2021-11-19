package dumpThings;

import hevs.graphics.FunGraphics;
import java.awt.Color;
import java.util.Calendar;

public class dickClock {
    
    final static int GRAPHICS_WIDTH = 640;
    final static int GRAPHICS_HEIGHT = 480;
    final static int STARTING_POSITION_X = 320;
    final static int STARTING_POSITION_Y = 240;

    // Display surface to draw on
    public static FunGraphics display;

    public static void fastdrawDisc(int radius, int Cx, int Cy){

        // Draws a red disc
        for (int x =Cx-radius; x <(radius + Cx); x++){
            for (int y = Cy-radius; y < (radius + Cy); y++){
                double distance = (Cx - x) * (Cx - x) + (Cy - y) * (Cy - y);

                if (distance <= radius*radius){
                    display.setPixel(x, y);
                }
            }
        }
    }

    public static void drawShaft(int Cx, int Cy, int diameter, int length, double angle ){

        int Xx=Cx+(int)((double)((diameter/2.0)*Math.cos(angle*Math.PI/180.0)));
        int Yy=Cy+(int)((double)((diameter/2.0)*Math.sin(angle*Math.PI/180.0)));

        

        int XTop=Xx+(int)(length*Math.cos(angle*Math.PI/180.0-Math.PI/2.0));
        int YTop=Yy+(int)(length*Math.sin(angle*Math.PI/180.0-Math.PI/2.0));

        for (int j=0;j<diameter;j++) {
            int a = (int)((double)(j*Math.cos(angle*Math.PI/180.0)));
            int b = (int)((double)(j*Math.sin(angle*Math.PI/180.0)));
            display.drawLine(Xx-a, Yy-b,XTop-a,YTop-b );
        }

        XTop=Cx-(int)((double)((diameter/2.0)*Math.cos(angle*Math.PI/180.0)));
        YTop=Cy-(int)((double)((diameter/2.0)*Math.sin(angle*Math.PI/180.0)));

        
        for (int k=0; k<length;k++) {
            int a = (int)((double)(k*Math.cos(angle*Math.PI/180.0+Math.PI/2.0)));
            int b = (int)((double)(k*Math.sin(angle*Math.PI/180.0+Math.PI/2.0)));
            
            display.drawLine(Xx-a, Yy-b,XTop-a,YTop-b );
        }


    }

    public static void drawPenis(int Cx, int Cy, double angle, Color c, int ballsize, int length, int diameter) {
        display.setColor(c);
        int b=(int)((ballsize-2)*Math.cos((180-angle)*Math.PI/180.0));
        int a=(int)((ballsize-2)*Math.sin((180-angle)*Math.PI/180.0));
        int e=(int)(length*Math.cos((90-angle)*Math.PI/180.0));
        int f=(int)(length*Math.sin((90-angle)*Math.PI/180.0));
        fastdrawDisc(ballsize, Cx+b, Cy-a);
        fastdrawDisc(ballsize, Cx-b, Cy+a);
        fastdrawDisc(diameter/2, Cx+e, Cy-f);
        drawShaft(Cx, Cy, diameter, length, angle);
    }

    

    public static void wait(int ms){
        try{
            Thread.sleep(ms);
        }
        catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }

    

    public static void main(String[] args) {
    display = new FunGraphics(GRAPHICS_WIDTH, GRAPHICS_HEIGHT);
    double seconds1=0;

    for (int n=0;n<360; n+=30) {
        drawShaft(STARTING_POSITION_X, STARTING_POSITION_Y, 5, 120, n);
    }
    while(true) {
        Calendar rightNow = Calendar.getInstance();
        int hour = rightNow.get(Calendar.HOUR);
        int minutes=rightNow.get(Calendar.MINUTE);
        int secondes=rightNow.get(Calendar.SECOND);
        
        double Hour=hour;
        double Minute=minutes;
        Hour=(Hour+Minute/60)*30;
        Minute=Minute*6;
        if(seconds1!=secondes) {
            display.setColor(Color.WHITE);
            fastdrawDisc(110, STARTING_POSITION_X, STARTING_POSITION_Y);
            drawPenis(STARTING_POSITION_X, STARTING_POSITION_Y, Hour, Color.red, 20, 70, 20);
            drawPenis(STARTING_POSITION_X, STARTING_POSITION_Y, Minute, Color.blue, 15, 100, 15);
            drawPenis(STARTING_POSITION_X, STARTING_POSITION_Y, secondes*6, Color.pink, 8, 45+secondes, 10);
        
        }
        seconds1=secondes;
        //display.setColor(Color.white);
        //drawPenis(STARTING_POSITION_X, STARTING_POSITION_Y, i/10.0, Color.WHITE);
        //fastdrawDisc(120, STARTING_POSITION_X, STARTING_POSITION_Y);
    }
    }
}
