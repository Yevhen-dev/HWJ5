package taskTwo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println( "Type your word" );
		
		String text = sc.nextLine();
		
		String[] words = text.split("[ ]");
		String word = words[0];
		int index = 0;
		
		for( int i = 0; i < words.length; i++  ) {
			if( words[i].length() > word.length() ) {
				word = words[i];
				index = i;
			}
		}
		
		System.out.println("The longest word is " + word);
	}

}
