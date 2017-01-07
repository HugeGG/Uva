import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Boolean change = false;
		int times = 1;
		while(true)
		{
			int to = 0;	
			float now, met = 0, big = 0;
			int require = in.nextInt();
			int types = in.nextInt();
			if(require == 0 && types == 0)
				break;
			if(change)
				System.out.println("");
			in.nextLine();
			String[] category = new String[types];
			float[] price = new float[types];
			for(int i = 0; i < require; i++)
			{
				in.nextLine();
			}
			for(int i = 0; i < types; i++)
			{
				category[i] = in.nextLine();
				price[i] = in.nextFloat();
				met = in.nextFloat();
				in.nextLine();
				now = met / require;
				if(now > big)
				{
					big = now;
					to = i;
				}
				else if(now == big)
				{
					if(price[to] > price[i])
						to = i;
				}
				for(int j = 0; j < met; j++)
				{
					in.nextLine();
				}
			}
			
			System.out.println("RFP #" + times);
			System.out.println(category[to]);
			times++;
			change = true;
		}
	}
}