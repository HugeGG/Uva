import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int now = 0;	
		while(in.hasNext())
		{
			String input = in.nextLine();    		
			for(int i = 0; i < input.length(); i++)		
			{
				if(input.charAt(i) == '"' && now == 0){		
					System.out.print("``");
					now = 1;	}			
				else if(input.charAt(i) == '"' && now == 1){
					System.out.print("''");
					now = 0;	}			
				else	{
					System.out.print(input.charAt(i));
					}
			}
			System.out.println("");
		}
	}
}