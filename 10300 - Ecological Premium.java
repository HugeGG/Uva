import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		for(int i = 0; i < times; i++)
		{
			long total = 0;
			int square = in.nextInt();
			for(int j = 0; j < square; j++)		
			{
				int a = in.nextInt();
				int b = in.nextInt();
				int c = in.nextInt();
				total += a * c;			
			}
			System.out.println(total);
		}
	}
}