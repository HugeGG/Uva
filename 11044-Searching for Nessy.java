import java.util.*;
import java.util.Map.Entry;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		for(int i = 0; i < times; i++)
		{
			int one = in.nextInt();
			int two = in.nextInt();
			int total = (one / 3) * (two / 3);	
			System.out.println(total);
		}
	}
}