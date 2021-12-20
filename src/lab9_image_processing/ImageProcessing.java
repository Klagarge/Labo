package lab9_image_processing;
import hevs.graphics.ImageGraphics;

public class ImageProcessing {
	
		
	public static void main(String[] args) {
		//final String imageUsed  = "/images/rice.jpg";
		final String imageUsed  = "/images/imageProcessing.jpg";
		final String imageUsed2  = "/images/imageProcessing_empty.jpg";

		/**
		 * Create the windows from images
		 */
		ImageGraphics org = new ImageGraphics(imageUsed, "Original", -450, -200);
		ImageGraphics cpy = new ImageGraphics(imageUsed2, "Copy", 0, -200);
				
		int[][] thePixels = org.getPixelsBW();
		int[][] theCopy = ImageFilters.duplicate(thePixels);

		//Simple copy and display
		org.setPixelsBW(thePixels);
		cpy.setPixelsBW(theCopy);
	}	
}
