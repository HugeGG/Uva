import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(true)
		{
			long carry = 0, first = 0, second = 0, now = 0;
			long input_1 = in.nextInt();
			long input_2 = in.nextInt();
			Boolean test = false;
			if(input_1 == 0 && input_2 == 0)
				break;
			while(true)
			{
				if((input_1 == 0 || input_2 == 0) && !test)
					break;
				first = input_1 % 10;
				second = input_2 % 10;
				now = first + second;
				if(test)
					now++;
				input_1 /= 10;
				input_2 /= 10;
				if(now >= 10)
				{
					carry++;
					test = true;
				}
				else
					test = false;
			}
			if(carry > 1)
				System.out.println(carry + " carry operations.");
			else if(carry == 1)
				System.out.println(carry + " carry operation.");
			else if(carry == 0)
				System.out.println("No carry operation.");
		}
	}
}