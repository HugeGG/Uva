import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(true)
		{
			int routes = in.nextInt();
			int limit = in.nextInt();
			int paid = in.nextInt();
			int total = 0, cut = 0;
			if(routes == 0 && limit == 0 && paid == 0)
				break;
			int[] morning_mile = new int[100];
			int[] afternoon_mile = new int[100];
			for(int i = 0; i < routes; i++)
			{
				morning_mile[i] = in.nextInt();
			}
			for(int i = 0; i  < routes; i++)
			{
				afternoon_mile[i] = in.nextInt();
			}
			sort(morning_mile, 0, routes - 1);
			sort(afternoon_mile, 0, routes - 1);
			for(int i = 0; i < routes; i++)
			{
				cut = morning_mile[i] + afternoon_mile[routes - 1 - i] - limit;
				if(cut > 0)
					total += cut;
			}
			if(total > 0)
				System.out.println(total * paid);
			else
				System.out.println("0");
		}
	}
	
	public static void sort(int[] input, int left, int right)
	{
		if(right <= left)
			return;
		int pivotIndex = (left + right) / 2;
		int pivot = input[pivotIndex];
		int swapIndex = left;
		swap(input, pivotIndex, right);
		for(int i = left; i < right; i++)
		{
			if(input[i] >= pivot)
			{
				swap(input, i, swapIndex);
				swapIndex++;
			}
		}
		swap(input, swapIndex, right);
		
		sort(input, left, swapIndex - 1);
		sort(input, swapIndex + 1, right);
	}
	
	public static void swap(int[] input, int A, int B)
	{
		int temp = input[A];
		input[A] = input[B];
		input[B] = temp;
	}
}