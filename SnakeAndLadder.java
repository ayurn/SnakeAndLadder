import java.util.Scanner;
import java.util.Random;

public class SnakeAndLadder 
{	
	public static void main(String[] args) 
	{
		System.out.println("Welcome to SnakeAndLadder program");

		int position=0;
		System.out.println("Player is at position : "+position);

		Random random = new Random();
	    int droll = 0;
		while (true)
		{
    		droll = random.nextInt(7);
    		if(droll !=0) break;
		}
		System.out.println(droll);
	}
}