import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int st = in.nextInt();
			int end = in.nextInt();
			int big = 1, j = 0;
			if(st > end)	
			{
				int sa = st;
				st = end;
				end = sa;
				j = 1;
			}
			for(int i = st; i <= end; i++)
			{	
				int now = i;
				int times = 1;
				while(now != 1)		
				{
					if(now % 2 == 1)
						now = now * 3 + 1;
					else
						now /= 2;
					times++;
				}
				if(times > big)
					big = times;
			}
			if(j == 1)		
				System.out.println(end + " " + st + " " + big);
			else
				System.out.println(st + " " + end + " " + big);
		}
	}
}