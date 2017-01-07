import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(true)
		{
			double hour = 0, min = 0, angle = 0;
			String input = in.next();
			if(input.charAt(2) == ':')
			{
				hour = Integer.parseInt(input.substring(0, 2));
				min = Integer.parseInt(input.substring(3));
			}
			else if(input.charAt(1) == ':')
			{
				hour = Integer.parseInt(input.substring(0, 1));
				min = Integer.parseInt(input.substring(2));
			}
			if(hour == 0 && min == 0)
				break;
			hour *= 30;
			hour += (0.5 * min);
			min *= 6;
			if(min > hour)
				angle = min - hour;
			else 
				angle = hour - min;
			if(angle < 0)
				angle *= -1;
			if(angle > 180)
				angle = 360 - angle;
			System.out.printf("%.3f\n", angle);
		}
	}
}