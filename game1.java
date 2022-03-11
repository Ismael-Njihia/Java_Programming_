package game;

import java.util.Scanner;

public class game1 {

	public static void main(String[] args) {
		int  number;
		final int guess = 12/3+4;
		Scanner input = new Scanner(System.in);
		System.out.println("Guess an interger Value: ");
		number = input.nextInt();
		
		if(number < guess) {
			System.out.println("You failed!! Our guess number was "+ (guess*3+1));
			
		
		}
		else if(number == guess) {
			System.out.println("Congratulations!! you won " + (guess));
		}
		else 
			System.out.println("You failed!! Our guess was " + (guess/2+5));
		
		
		

	}
	System.out.println(guess)
}
