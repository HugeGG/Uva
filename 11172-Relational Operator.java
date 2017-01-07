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
			if(one > two)
				System.out.println(">");
			else if(one == two)
				System.out.println("=");
			else
				System.out.println("<");
		}
	}
}