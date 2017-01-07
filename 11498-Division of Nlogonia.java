import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			int times = in.nextInt();
			if(times == 0)
				break;
			int point_x = in.nextInt();	
			int point_y = in.nextInt();
			for(int i = 0; i < times; i++)
			{
				int x = in.nextInt();
				int y = in.nextInt();
				if(x - point_x > 0 && y - point_y > 0)	
					System.out.println("NE");
				else if(x - point_x > 0 && y - point_y < 0)
					System.out.println("SE");
				else if(x - point_x < 0 && y - point_y > 0)
					System.out.println("NO");
				else if(x - point_x < 0 && y - point_y < 0)
					System.out.println("SO");
				else if(x - point_x == 0 || y - point_y == 0)
					System.out.println("divisa");
			}
		}
	}
}