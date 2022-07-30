package game;

import java.util.Scanner;

public class GuessTheWord {

	private Scanner scanner = new Scanner(System.in);
	private boolean play = true;
	private Words randomword = new Words();
	private int rounds = 10;
	private char lastround;

	public void start() {
		do {
			showword();
			getinput();
			checkinput();

		} while (play);

	}

	public void showword() {
System.out.println("you have "+rounds+"tries left: ");
System.out.println(randomword);
	}

	public void getinput() {
		System.out.println("enter a letter to guess a word ");
		String userguess = scanner.nextLine();
		lastround = userguess.charAt(0);

	}

	public void checkinput() {
		boolean isguessrifght = randomword.guess(lastround);
		if (isguessrifght) {
			if (randomword.isGuessRight()) {
				System.out.println("congrats you won ");
				System.out.println("the word is " + randomword);
				play = false;
			}
		}
		else
		{
			rounds--;
			if(rounds==0)
			{
				System.out.println("game over!");
				play=false;
			}
		}
	}

	public void end() {
		scanner.close();

	}
}
