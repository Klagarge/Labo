package lab9_image_processing;
import hevs.graphics.ImageGraphics;

public class ImageProcessing {
	
		
	public static void main(String[] args) {
		final String imageUsed  = "/images/rice.jpg";

		/**
		 * Create the windows from images
		 */
		ImageGraphics org = new ImageGraphics(imageUsed, "Original", -450, -250);
		ImageGraphics cpy = new ImageGraphics(imageUsed, "Copy", 0, -250);
				
		int[][] thePixels = org.getPixelsBW();
		int[][] theCopy = ImageFilters.duplicate(thePixels);

		// Simple copy and display
		cpy.setPixelsBW(theCopy);
	}	
}
