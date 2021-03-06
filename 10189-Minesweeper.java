import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int times = 1;
		while(in.hasNext())
		{
			char[][] input = new char[101][101];
			int wide = in.nextInt();
			int lon = in.nextInt();
			if(wide == 0 && lon == 0)
				break;
			if(times > 1)				
				System.out.println("");
			for(int a = 0; a < 100; a++)		
			{
				for(int b = 0; b < 100; b++)
				{
					input[a][b] = '0';
				}
			}
			for(int i = 0; i < wide; i++)		
			{
				String mine = in.next();
				for(int j = 0; j < lon; j++)
				{
					input[i][j] = mine.charAt(j);
					if(input[i][j] == '.')
						input[i][j] = '0';
				}
			}
			for(int i = 0; i < wide; i++)		
			{
				for(int j = 0; j < lon; j++)
				{
					if(input[i][j] == '*')	{		
						for(int k = i - 1; k <= i + 1; k++)
						{
							for(int l = j - 1; l <= j + 1; l++)
							{
								if(k < 0)
									break;
								if(l < 0 || (k == i && l == j) || input[k][l] == '*')
									continue;
								input[k][l] += 1; 
							}
						}
					}
				}
			}
			System.out.println("Field #" + times + ":");
			
			for(int i = 0; i < wide; i++)				
			{
				for(int j = 0; j < lon; j++)
				{
					System.out.print(input[i][j]);
				}
				System.out.println("");
			}
			times++;
		}
	}
}