import java.util.*;

public class mymain
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int min = 500001;
			int people = in.nextInt();
			int money = in.nextInt();
			int hotels = in.nextInt();
			int weeks = in.nextInt();
			for(int i = 0; i < hotels; i++)
			{
				int cost = in.nextInt();
				for(int j = 0; j < weeks; j++)
				{
					int rooms = in.nextInt();
					if(rooms >= people && min > cost * people)
						min = cost * people;
				}
			}
			if(min > money)
				System.out.println("stay home");
			else
				System.out.println(min);
		}
	}
}
