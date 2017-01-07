import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(true)
		{
			int inverse = 0;
			double total = 0;
			int Day_num = 0, Evcning_num = 0, Night_num = 0, change = 0; 
			char type = in.next().charAt(0);
			if(type == '#')
				break;
			String number = in.next();
			int[] input = new int[4];
			for(int i = 0; i < 4; i++)
			{
				input[i] = in.nextInt();
			}
			int start_time = input[0] * 60 + input[1];
			int end_time = input[2] * 60 + input[3];
			
			if(start_time > end_time)					
			{
				change = end_time;
				end_time = start_time;
				start_time = change;
				inverse = 1;
			}
			
			if(start_time == end_time)
			{
				Day_num = 600;
				Evcning_num = 240;
				Night_num = 600;
			}
			
			if(start_time < end_time)
			{
				if(start_time < 480)
				{
					if(end_time <= 480)
					{
						Night_num = end_time - start_time;
					}
					else if(end_time > 480 && end_time <= 1080)
					{
						Night_num = 480 - start_time;
						Day_num = end_time - 480;
					}
					else if(end_time > 1080 && end_time <= 1320)
					{
						Night_num = 480 - start_time;
						Day_num = 600;
						Evcning_num = end_time - 1080;
					}
					else if(end_time > 1320 && end_time <= 1440)
					{
						Night_num = 480 - start_time;
						Day_num = 600;
						Evcning_num = 240;
						Night_num += end_time - 1320;
					}
				}
				else if(start_time >= 480 && start_time < 1080)
				{
					if(end_time <= 1080)
					{
						Day_num = end_time - start_time;
					}
					else if(end_time > 1080 && end_time <= 1320)
					{
						Day_num = 1080 - start_time;
						Evcning_num = end_time - 1080;
					}
					else if(end_time > 1320 && end_time <= 1440)
					{
						Day_num = 1080 - start_time;
						Evcning_num = 240;
						Night_num = end_time - 1320;
					}
				}
				else if(start_time >= 1080 && start_time < 1320)
				{
					if(end_time <= 1320)
					{
						Evcning_num = end_time - start_time;
					}
					else if(end_time > 1320 && end_time <= 1440)
					{
						Evcning_num = 240;
						Night_num = end_time - 1320;
					}
				}
				else if(start_time >= 1320 && start_time < 1440)
				{
					Night_num = end_time - start_time;
				}
			}
			if(inverse == 1)
			{
				Day_num -= 600;
				Day_num *= -1;
				Evcning_num -= 240;
				Evcning_num *= -1;
				Night_num -= 600;
				Night_num *= -1;
			}
			if(type == 'A')
				total = Day_num * 0.10 + Evcning_num * 0.06 + Night_num * 0.02;
			else if(type == 'B')
				total = Day_num * 0.25 + Evcning_num * 0.15 + Night_num * 0.05;
			else if(type == 'C')
				total = Day_num * 0.53 + Evcning_num * 0.33 + Night_num * 0.13;
			else if(type == 'D')
				total = Day_num * 0.87 + Evcning_num * 0.47 + Night_num * 0.17;
			else if(type == 'E')
				total = Day_num * 1.44 + Evcning_num * 0.80 + Night_num * 0.30;
			
			System.out.printf("%10s", number);
			System.out.printf("%6d%6d%6d", Day_num, Evcning_num, Night_num);
			System.out.printf("%3c%8.2f\n", type, total);
		}
	}
}