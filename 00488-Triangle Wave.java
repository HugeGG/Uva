import java.util.*;

public class Main		
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		for(int i = 0; i < times; i++)
		{
			String blank = in.nextLine();
			int wave = in.nextInt();
			int freq = in.nextInt();
			Boolean up = false;
			int high = 1;
			for(int j = 0; j < freq; j++)
			{
				for(int z = 0; z < (wave - 1) * 2 + 1; z++)
				{
					int now = high;
					while(true)
					{
						System.out.print(high);
						now--;
						if(now <= 0)
							break;
					}
					System.out.println("");
					if(high == wave)
						up = true;
					if(!up)
						high++;
					if(up)
						high--;
				}
				up = false;
				if(j != freq - 1)
					System.out.println("");
				high = 1;
			}
		}
	}
}