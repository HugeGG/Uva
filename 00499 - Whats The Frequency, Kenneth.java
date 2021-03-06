import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int big = 0;
			int[] upper = new int[26];		
			int[] lower = new int[26];
			for(int i = 0; i < 26; i++)		
			{
				upper[i] = 0;
				lower[i] = 0;
			}
			String input = in.nextLine();
			for(int i = 0; i < input.length(); i++)		
			{
				if(input.charAt(i) >= 'A' && input.charAt(i) <= 'Z')
					upper[input.charAt(i) - 'A'] += 1;
				else if(input.charAt(i) >= 'a' && input.charAt(i) <= 'z')
					lower[input.charAt(i) - 'a'] += 1;
			}
			for(int i = 0; i < 26; i++)			
			{
				if(upper[i] > big)
					big = upper[i];
				if(lower[i] > big)
					big = lower[i];
			}
			for(int i = 0; i < 26; i++)			
			{
				if(upper[i] == big)
					System.out.printf("%c", i + 'A');
			}
			for(int i = 0; i < 26; i++)
			{
				if (lower[i] == big)
					System.out.printf("%c", i + 'a');
			}
			System.out.println(" " + big);
		}
	}
}