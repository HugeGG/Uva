import java.util.*;

public class mymain
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		for(int i = 1; i <= times; i++)
		{
			int up = 0, down = 0;
			int total = in.nextInt();
			int tall = in.nextInt();
			int now = tall;
			for(int j = 1; j < total; j++)
			{
				tall = in.nextInt();
				if(tall > now)
					up++;
				else if(tall < now)
					down++;
				now = tall;
			}
			System.out.println("Case " + i + ": " + up + " " + down);
		}
	}
}
