import java.util.*;

public class Main {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		for(int i = 0; i < times; i++)
		{
			int total = 0;
			int[] position = new int[20];
			int stores = in.nextInt();
			int big = 0, small = 99;
			for(int j = 0; j < stores; j++)
			{
				position[j] = in.nextInt();
				if(position[j] > big)
					big = position[j];
				if(position[j] < small)
					small = position[j];
			}
			int ave = (big - small) * 2;
			System.out.println(ave);
		}
	}
}
