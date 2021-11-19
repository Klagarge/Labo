package lab4;
public class StringFunctions {
	/**
	 * @param s
	 * @return The length (number of letters) of the String s
	 */
	public static int stringLength(String s){
		return s.length();
	}
	
	/**
	 * Example : 
	 * 	stringCharAt("hello", 0) returns 'h'
	 * 	stringCharAt("hello", 1) returns 'e'
	 * @param s 
	 * @param pos
	 * @return The char at position pos in s
	 */
	public static char stringCharAt(String s, int pos){
		return s.charAt(pos);
	}
}
