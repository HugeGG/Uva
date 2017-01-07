import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		String[] input = new String[10];
		int[] lucky = new int[10];
		for(int i = 1; i <= times; i++)
		{
			int big = 0;
			for(int j = 0; j < 10; j++)
			{
				input[j] = in.next();
				lucky[j] = in.nextInt();
				if(lucky[j] > big)
					big = lucky[j];
			}
			System.out.println("Case #" + i + ":");
			for(int j = 0; j < 10; j++)
			{
				if(lucky[j] == big)
					System.out.println(input[j]);
			}
		}
	}
}