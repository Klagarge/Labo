package lab2_DataTypes;
import java.io.*;

/**
 * A class with functions to manipulate text strings. Based on 
 * an old <code>TextTools</code> version that hid all the strings
 * in static variables inside the class. This has all been removed and
 * now everything is explicit and exposed.
 * 
 * @author Pierre-Andre Mudry, pandre.mudry@hevs.ch
 */

public class TextTools {
	/**
	 * Get a line of text from the console.
	 */
	public static String readText() {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.print("Enter a text : ");
		try {
			return stdin.readLine();
		} catch (Exception ex) {
			return "";
		}
	}

	/**
	 * Get an integer value from the console. Can read octal and hexadecimal
	 * formats as well
	 */
	public static int readInt() {
		System.out.print("Enter an integer value in decimal, octal or hexadecimal format : ");
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		try {
			String s = stdin.readLine();
			if (s.startsWith("0x") || s.startsWith("0X")) {
				return Integer.parseInt(s.substring(2), 16);
			} else if (s.startsWith("0")) {
				return Integer.parseInt(s.substring(1), 8);
			} else {
				return Integer.parseInt(s, 10);
			}
		} catch (Exception ex) {
			return 0;
		}
	}

	/**
	 * Get a double value from the console.
	 */
	public static double readDouble() {
		System.out.print("Enter a double value : ");
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		try {
			return Double.parseDouble(stdin.readLine());
		} catch (Exception ex) {
			return 0;
		}
	}

	/**
	 * Read a boolean value (true, false) from the console.
	 */
	public static boolean readBoolean() {
		System.out.print("Enter a boolean value : ");
		BufferedReader stdin = new BufferedReader(new InputStreamReader(
				System.in));
		try {
			return (Boolean.valueOf(stdin.readLine())).booleanValue();
		} catch (Exception ex) {
			return false;
		}
	}

	/**
	 * Get a char from the console.
	 */
	public static char readChar() {
		System.out.print("Enter a character : ");
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		try {
			return stdin.readLine().charAt(0);
		} catch (Exception ex) {
			return '\0';
		}
	}

	/**
	 * Reverse the given string <code>input</code> ...
	 * 
	 * @param input
	 *            as string : the given string
	 */
	public static String reverse(String input) {
		String output = new String("");

		for (int i = 0; i < input.length(); i++) {
			output = output + input.charAt(input.length() - (i + 1));
		}
		
		return output;
	}

	/**
	 * Converts all of the characters in this String to upper case.
	 * 
	 * @param input as string : the given string
	 */
	public static String toUpperCase(String input) {
		return input.toUpperCase();
	}

	/**
	 * Converts all of the characters in this String to lower case.
	 * 
	 * @param input as string : the given string
	 */
	public static String toLowerCase(String input) {
		return input.toLowerCase();
	}

	/**
	 * Converts the first character of this String to upper case.
	 * 
	 * @param input
	 *            as string : the given string
	 */
	public static String capitalize(String input) {
		String output = String.valueOf(input.charAt(0)).toUpperCase();

		for (int i = 1; i < input.length(); i++) {
			output = output + input.charAt(i);
		}

		return output;
	}

	/**
	 * Inverts a complete String
	 * @param input
	 * @return the inverted String
	 */
	public static String invert(String input){
		return invert(input, input.length());
	}
	
	/**
	 * Inverts the characters of the input string by group of
	 * <code>number</code> characters
	 * 
	 * @param input
	 *            as string : the given string
	 * @param number
	 *            as int : the number of charaters to invert
	 */
	private static String invert(String input, int number) {
		int i = 0;
		String output = new String("");

		if (input.length() >= number) {
			for (i = 0; i <= input.length() - number; i = i + number) {
				for (int j = number; j > 0; j--) {
					output = output + input.charAt(i + j - 1);
				}
			}

			for (int j = input.length(); j > i; j--) {
				output = output + input.charAt(j - 1);
			}
		} else {
			for (int j = input.length(); j > 0; j--) {
				output = output + input.charAt(j - 1);
			}
		}

		return output;
	}

	/**
	 * Hide any vowel in a string
	 * 
	 * @param input
	 *            as string : the given string
	 */	
	public static String deleteVowels(String input) {
		int ASCII = 0;
		String output = new String("");

		for (int i = 0; i < input.length(); i++) {
			ASCII = input.codePointAt(i);
			if (ASCII == 97 || ASCII == 65 || /* 'a' & 'A' */
			ASCII == 101 || ASCII == 69 || /* 'e' & 'E' */
			ASCII == 105 || ASCII == 73 || /* 'i' & 'I' */
			ASCII == 111 || ASCII == 79 || /* 'o' & 'O' */
			ASCII == 117 || ASCII == 85 || /* 'u' & 'U' */
			ASCII == 121 || ASCII == 89 || /* 'y' & 'Y' */
			(ASCII >= 192 && ASCII <= 207) || (ASCII >= 210 && ASCII <= 214)
					|| (ASCII >= 217 && ASCII <= 221)
					|| (ASCII >= 224 && ASCII <= 230)
					|| (ASCII >= 232 && ASCII <= 239)
					|| (ASCII >= 242 && ASCII <= 246)
					|| (ASCII >= 249 && ASCII <= 253) || ASCII == 255) {
				output = output + " ";
			} else
				output = output + input.charAt(i);
		}
		return output;
	}

	/**
	 * Deletes each consonant in a string
	 * 
	 * @param input
	 *            as string : the given string
	 */
	public static String deleteConsonants(String input) {
		int ASCII = 0;
		String output = new String("");

		for (int i = 0; i < input.length(); i++) {
			ASCII = input.codePointAt(i);
			if (ASCII == 97 || ASCII == 65 || /* 'a' & 'A' */
			ASCII == 101 || ASCII == 69 || /* 'e' & 'E' */
			ASCII == 105 || ASCII == 73 || /* 'i' & 'I' */
			ASCII == 111 || ASCII == 79 || /* 'o' & 'O' */
			ASCII == 117 || ASCII == 85 || /* 'u' & 'U' */
			ASCII == 121 || ASCII == 89 || /* 'y' & 'Y' */
			(ASCII >= 192 && ASCII <= 207) || (ASCII >= 210 && ASCII <= 214)
					|| (ASCII >= 217 && ASCII <= 221)
					|| (ASCII >= 224 && ASCII <= 230)
					|| (ASCII >= 232 && ASCII <= 239)
					|| (ASCII >= 242 && ASCII <= 246)
					|| (ASCII >= 249 && ASCII <= 253)
					|| (ASCII >= 33 && ASCII <= 64)
					|| (ASCII >= 91 && ASCII <= 96)
					|| (ASCII >= 123 && ASCII <= 191)
					|| (ASCII >= 208 && ASCII <= 209)
					|| (ASCII >= 215 && ASCII <= 216)
					|| (ASCII >= 222 && ASCII <= 223)
					|| (ASCII >= 240 && ASCII <= 241)
					|| (ASCII >= 247 && ASCII <= 248)
					|| (ASCII >= 254 && ASCII <= 255)) {
				output = output + input.charAt(i);
			} else
				output = output + " ";
		}
		return output;
	}

	/**
	 * Encrypts a string
	 * 
	 * @param input
	 *            as string : the given string
	 */
	public static String encrypt(String input) {
		String output = new String("");

		for (int i = 0; i < input.length(); i++) {
			output = output + (char) ((input.charAt(i) + 5) % 256);
		}
		return output;
	}

	/**
	 * Decrypts an encrypted string
	 * 
	 * @param input
	 *            as string : the given string
	 */
	public static String decrypt(String input) {
		String output = new String("");

		for (int i = 0; i < input.length(); i++) {
			output = output + (char) ((input.charAt(i) - 5) % 256);
		}
		return output;
	}
}