package model;

import java.util.Scanner;
import java.util.regex.Pattern;

import custonException.LetterFormatException;

public final class RomanNumberValidPatterns {
	
	public static String inputValidRomanNumbers() {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		String letters = null;
		boolean loop = true;
		
		do {
			try {
				
				System.out.println("Enter with a valid roman number");
				letters = input.nextLine().toUpperCase();
				
				verifyingIfRomanPatternIsCorrect(letters);
				break;
			} catch(final LetterFormatException exception) {
				System.err.println(exception.getMessage());
			}
		} while(loop == true);
		
		System.out.printf("\n%s is a valid roman pattern !", letters);

		return letters;
	}
	
	public static boolean verifyingIfRomanPatternIsCorrect(String letters) throws LetterFormatException {
		 
		boolean verification = Pattern.matches("^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$", letters);
		
		if(!verification == true) {
			throw new LetterFormatException("Please, use only letters of this group -> I V X C L D M. "
								+ "And just valid ");
		} else {
			return false;
		}
	}
	
}
