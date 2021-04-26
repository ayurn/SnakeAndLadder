import java.util.Scanner;
import java.util.Random;

public class SnakeAndLadder 
{	
	public static final int No_Play=1;
	public static final int Ladder=2;
	public static final int Snake=3;
	public static final int Win_position=100;
	public static final int Position_check = 0;

	public static void main(String[] args) 
	{
		System.out.println("Welcome to SnakeAndLadder program");

		int position=0;
		System.out.println("Start position of player :	"+position);

		//Rolling dice to get random number
		
		Random random = new Random();
	    int droll = 0;
		while (true)
		{
    		droll = random.nextInt(7);
    		if(droll !=0) break;
		}
		System.out.println("Number of dice : "+droll);

		//options
		while (position < Win_position){
		Random ran = new Random();
	    int option = 0;
		while (true)
		{
    		option = ran.nextInt(4);
    		if(option !=0) break;
		}
		System.out.println("====OPTIONS======\nOption 1 : No Play\nOption 2 : Ladder \nOption 3 : Snake \n");
		System.out.println("Option : "+option);
		
		switch (option) {
			case No_Play:
				System.out.println("Player stays in the same position : "+position);
				break;
			
			case Ladder:
				position += droll;
				System.out.println("Player moves ahead by : "+position);
				break;
			
			case Snake:
                position -= droll;
                if ((position - droll) < Position_check){
                	position = Position_check;
                }
				System.out.println("Player moves behind by : "+position);
				break;				

			default: 
				System.out.println("Enter correct value");
				break;
			}
		}
	}

}

