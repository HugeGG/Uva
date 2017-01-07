import java.util.*;
import java.util.Map.Entry;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			long num = in.nextInt();
			if(num == 0)			
				break;
			while(true)			
			{
				int sum = 0;
				while(num > 0)
				{
				sum += num % 10;
				num /= 10;
				}
				if(sum < 10)	{
					System.out.println(sum);
					break;	}
				else	{		
					num = sum;	}
			}
		}
	}
}