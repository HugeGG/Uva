import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int num = 0, test = 0;
			String input = in.nextLine();			
			input = input.toUpperCase();			
			for(int i = 0; i < input.length(); i++)
			{
				if(input.charAt(i) >='A' && input.charAt(i) <= 'Z')	
				{	test = 1;		}
				else if(input.charAt(i) > 'Z' || input.charAt(i) < 'A')	
				{	num += test; 
					test = 0;	}
			}
			System.out.println(num + test);					
		}
	}
}