import java.util.*;
import java.util.Map.Entry;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int start = in.nextInt();
			int one = in.nextInt();
			int two = in.nextInt();
			int three = in.nextInt();
			if(start == 0 && one == 0 && two == 0 && three == 0)	
				break;
			int total = 1080;				
			total += ((start - one) + 40) % 40 * 9;		
			total += ((two - one) +40) % 40 * 9;
			total += ((two - three) + 40) %40 * 9;
			System.out.println(total);
		}
	}
}