import java.util.*;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		for(int i = 1; i < times + 1; i++)
		{
			int mid = 0;
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			if((a > b && a < c) || (a < b && a > c))
				mid = a;
			else if((b > a && b < c) || (b < a && b > c))
				mid = b;
			else
				mid = c;
			System.out.println("Case " + i +": " + mid);
		}
	}
}
