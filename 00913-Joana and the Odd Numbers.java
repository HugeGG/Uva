import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			long now = 0, sum = 0;;
			long num = in.nextInt();
			long n = (num - 1) / 2 + 1;
			now = n * (2 + (n - 1) * 2) / 2;
			sum = 1 + (now - 2) * 2;
			sum *= 3;
			System.out.println(sum);
		}
	}
}