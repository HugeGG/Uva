import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int test = 0;
		while(in.hasNext())
		{
			if(test == 1)
				System.out.println("");
			String input = in.nextLine();
			int freq = 1;
			int[] ASC = new int[128];
			for(int i = 0; i < input.length(); i++)
			{
				int now =(int)(input.charAt(i));
				ASC[now]++;
			}
			while(freq < 1000)
			{
				for(int i = 127; i >= 0; i--)
				{
					if(ASC[i] == freq)
						System.out.println(i + " " + ASC[i]);
				}
				freq++;
			}
			test = 1;
		}
	}
}