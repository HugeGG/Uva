import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String input_1 = in.next();
			String input_2 = in.next();
			long num1 = Long.parseLong(input_1);
			long num2 = Long.parseLong(input_2);
			System.out.println(Math.abs(num1 - num2));
		}
	}
}