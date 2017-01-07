import java.util.*;

public class mymain
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		for(int i = 1; i <= times; i++)
		{
			int big = 0;
			String scare = in.nextLine();
			int total = in.nextInt();
			for(int j = 0; j < total; j++)
			{
				int input = in.nextInt();
				if(input > big)
					big = input;
			}
			System.out.println("Case " + i + ": " + big);
		}
	}
}
