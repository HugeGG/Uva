import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		for(int i = 0; i < times; i++)
		{
			long use = 0, total = 0;
			String input = in.next();
			while(true)
			{
			String inverse = new StringBuffer(input).reverse().toString();
			long now = Long.parseLong(input);
			long change = Long.parseLong(inverse);
			
				if(now == change && use != 0)
				{
					System.out.println(use + " " + total);
					break;
				}
				else if(now != change || use == 0)
				{
					total = now + change;
					input = "" + total;
					use++;
				}
			}
			
		}
	}
}