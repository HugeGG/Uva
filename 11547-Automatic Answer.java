import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		for(int i = 0; i < times; i++)
		{
			int input = in.nextInt();	
			input *= 567;			
			input /= 9;
			input += 7492;
			input *= 235;
			input /= 47;
			input -= 498;
			input = input % 100;
			input /= 10;
			if(input < 0)			
				input *= -1;
			System.out.println(input);
		}
	}
}