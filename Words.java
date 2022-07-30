package game;

import java.util.Random;

public class Words {

	private String[] randomwords= {"animals","indefinite","steady","birthday","extreme","rights",
"properties","beneath","independence","students","employee","information"};
	private String Selectwords;
	private Random random=new Random();
	private char[] letters;
	public Words()
	{
	   Selectwords=randomwords[random.nextInt(randomwords.length)];
	   letters= new char[Selectwords.length()];
	}
	public String toString() {
		StringBuilder text= new StringBuilder();
for(char letter:letters)
{
	text.append(letter =='\u0000'?'-':letter);
	
	text.append(' ');
}
		return text.toString();
	}
	
public boolean isGuessRight() {
for(char letter:letters)
{
	if(letter=='\u0000')
	{
		return false;
	}
}
return true;
}

	public boolean guess(char letter) {
		
		boolean guessright=false;
		for(int i=0;i<Selectwords.length();i++)
		{
			if(letter==Selectwords.charAt(i))
			{
				letters[i]=letter;
				guessright=true;
			}
		}
	return guessright;
	}
	}
	

