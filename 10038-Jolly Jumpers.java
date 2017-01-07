import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int num = in.nextInt();
			int should = (num - 1) * (2 + num - 2) / 2, now = 0, cut, all = 0;
			int[] total = new int[3000];
			int[] input = new int[3000];
			boolean test = true;
			for(int i = 0; i < num; i++)
			{
				input[i] = in.nextInt();
			}
			now = input[0];
			for(int i = 1; i < num; i++)
			{
				cut = now - input[i];
				if(cut < 0)
					cut *= -1;
				total[cut]++;
				all += cut;
				now = input[i];
			}
			for(int i = 0; i < num; i++)
			{
				if(total[i] > 1)
					test = false;
			}
			if(all == should && test)
				System.out.println("Jolly");
			else
				System.out.println("Not jolly");
		}
	}
}