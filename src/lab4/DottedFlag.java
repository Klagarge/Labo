package lab4;
import hevs.graphics.FunGraphics;
import hevs.utils.Input;

import java.awt.Color;

/**
 * Class using {@link FunGraphics} class to draw a dotted Flag.
 */
public class DottedFlag {

	// Constant parameters
	final static int GRAPHICS_WIDTH = 640;
	final static int GRAPHICS_HEIGHT = 480;
	final static int DOT_DISTANCE = 20;
	final static int DOT_RADIUS = 8;
	final static int STARTING_POSITION_X = 10;
	final static int STARTING_POSITION_Y = 10;

	// Display surface to draw on
	public static FunGraphics display;

	public static void drawDisc(int radius, int Cx, int Cy){
		display.setColor(Color.red);
		
		// Draws a red disc
		for (int x = 0; x < GRAPHICS_WIDTH; x++){
			for (int y = 0; y < GRAPHICS_HEIGHT; y++){
				double distance = (Cx - x) * (Cx - x) + (Cy - y) * (Cy - y);
				
				if (distance <= radius*radius){
					display.setPixel(x, y);
				}
			}
		}
	}

	public static void fastDrawDisc(int radius, int Cx, int Cy){
		display.setColor(Color.red);

		
		// Draws a red disc
		for (int x = Cx-radius; x <= Cx+radius; x++){
			for (int y = Cy-radius; y <= Cy+radius; y++){
				double distance = (Cx - x) * (Cx - x) + (Cy - y) * (Cy - y);
				
				if (distance <= radius*radius){
					display.setPixel(x, y);
				}
			}
		}
	}

	public static void fastDrawDisc(int radius, int Cx, int Cy, Color c){
		display.setColor(c);
		

		
		// Draws a red disc
		for (int x = Cx-radius; x <= Cx+radius; x++){
			for (int y = Cy-radius; y <= Cy+radius; y++){
				double distance = (Cx - x) * (Cx - x) + (Cy - y) * (Cy - y);
				
				if (distance <= radius*radius){
					display.setPixel(x, y);
				}
			}
		}
	}
	
	/**
	 * Program entry point
	 */
	public static void main(String[] args) {

		System.out.print("Please select \"fast\" or \"slow\" method: ");
		String s = Input.readString();

		// Create and set the windows up
		display = new FunGraphics(GRAPHICS_WIDTH, GRAPHICS_HEIGHT);
		
		// int Cx=GRAPHICS_WIDTH/2;
		// int Cy=GRAPHICS_HEIGHT/2;
		int radius=8;
		
		display.setColor(Color.red);

		long begin = System.currentTimeMillis();

		if (s.equals("slow")) {

			for (int y = 0; y < GRAPHICS_HEIGHT; y++) {
				for (int x = 0; x < GRAPHICS_WIDTH; x++) {
					if ( (x+10)%(+20)==0 && (x<(GRAPHICS_WIDTH-radius-10)) ) {
						if ( (y+30)%(+20)==0 && (y<(GRAPHICS_HEIGHT-radius-30)) ) {
							drawDisc(radius, x+10, y+30);
						}
					}
				}
			}

		} else if (s.equals("fast")) {
			
			for (int y = 0; y < GRAPHICS_HEIGHT; y++) {
				for (int x = 0; x < GRAPHICS_WIDTH; x++) {
					if ( (x+10)%(+20)==0 && (x<(GRAPHICS_WIDTH-radius-10)) ) {
						if ( (y+30)%(+20)==0 && (y<(GRAPHICS_HEIGHT-radius-30)) ) {
							fastDrawDisc(radius, x+10, y+30);
						}
					}
				}
			}

		} else {
			System.out.println("please select \"fast\" or \"slow\" method");
			System.exit(0);
		}

		long result = System.currentTimeMillis()-begin;
		System.out.println("Drawing took " + result + " ms");

		display.clear();

		int ligne = 0;
		Color c;

		for (int y = 0; y < GRAPHICS_HEIGHT; y++) {
			int colonne = 1;
			for (int x = 0; x < GRAPHICS_WIDTH; x++) {
				if ( (x+10)%(+20)==0 && (x<(GRAPHICS_WIDTH-radius-10)) ) {
					colonne ++;
					ligne++;
					if ( (y+30)%(+20)==0 && (y<(GRAPHICS_HEIGHT-radius-30)) ) {
						ligne++;

						if (ligne%2 == 0) {
							if (colonne%2==0) {
								c = Color.blue;
							} else {
								c = Color.black;
							}
						} else {
							if (colonne%2==0) {
								c = Color.red;
							} else {
								c = Color.green;
							}
						}
						fastDrawDisc(radius, x+10, y+30, c);
					}
				}
			}
		}
	}
}