package taskOne;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println( "Type your word" );
		
		String text = sc.nextLine();
		char[] letterArr = text.toCharArray();
		int counter = 0;
		
		for( char letter : letterArr ) {
			if ( letter == 'b' ) {
				counter++;
			}
		}
		
		
		System.out.println( "You have input symbol 'b' "  + counter + " times");
		
	}

}
