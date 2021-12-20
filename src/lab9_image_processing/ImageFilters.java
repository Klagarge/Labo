package lab9_image_processing;
/**
 * This class implements the various image filters
 * @author Pierre-André Mudry
 * @date 2012
 * @version 1.0 
 */
public class ImageFilters {

	/** 
	 * Simply duplicates every pixel from the source image
	 * @param a
	 * @return
	 */
	public static int[][] duplicate(int[][] a) {
		/**
		 * Write your code hereunder
		 */
		int[][] foo = a.clone();
		
		return foo;				
	}

	/**
	 * Dichotomy of the image
	 * @param a
	 * @param threshold 
	 * @return
	 */
	public static int[][] threshold(int[][] a, int threshold) {
		return a;
	}
	
	/**
	 * Mean filter that blurs the image a bit
	 * @param a
	 * @return
	 */
	public static int[][] mean(int[][] a) {
		return a;
	}

	
	/**
	 * Derivative of the image
	 * @param a
	 * @return
	 */
	public static int[][] derivative(int[][] a) {
		return a;
	}

	/**
	 * Sobel filter of the image
	 * @param a
	 * @param intensity
	 * @return
	 */
	public static int[][] sobel(int[][] a, double intensity) {
		return a;
	}

}
