import java.util.*;
import java.util.Map.Entry;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();	
		for(int i = 0; i < times; i++)
		{
			String name = in.next();
			String other = in.nextLine();
			if(tm.containsKey(name))			
				tm.put(name, tm.get(name) + 1);
			else
				tm.put(name, 1);			
		}
		for(Entry<String, Integer> entry : tm.entrySet())	
		{
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}