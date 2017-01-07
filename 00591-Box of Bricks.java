import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int times = 1;
		while(true)
		{
			int num = in.nextInt();
			int total = 0, average = 0, shift = 0, get = 0;
			int[] input = new int[100];
			if(num == 0)
				break;
			for(int i = 0; i < num; i++)
			{
				input[i] = in.nextInt();
				total += input[i];
			}
			average = total / num;
			for(int i = 0; i < num; i++)
			{
				get = input[i] - average;
				if(get < 0)
					get *= -1;
				shift += get;
			}
			shift /= 2;
			System.out.println("Set #" + times);
			System.out.println("The minimum number of moves is " + shift + ".");
			System.out.println("");
			times++;
		}
	}
}