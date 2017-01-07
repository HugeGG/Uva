import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		System.out.println("Lumberjacks:");
		for(int i = 0; i < times; i++)
		{
			int[] input = new int[10];
			int test = 0;
			for(int j = 0; j < 10; j++)
			{
				input[j] = in.nextInt();
			}
			
			if(input[1] > input[0])	{
				for(int j = 1; j < 10; j++)
				{
					if(input[j] < input[j-1])
						test++;
				}}
			
			else if(input[1] < input[0])	{
				for(int j = 1; j < 10; j++)
				{
					if(input[j] > input[j-1])
						test++;
				}}
			
			if(test > 0)
				System.out.println("Unordered");
			else 
				System.out.println("Ordered");
		}
	}
}