import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		for(int i = 0; i < times; i++)
		{
			int middle = 0, total = 0;
			int num = in.nextInt();
			int[] dis = new int[num];
			for(int j = 0; j < num; j++)
			{
				dis[j] = in.nextInt();
			}
			Sort(dis, 0, num - 1);
			middle = dis[num / 2];
			for(int j = 0; j < num; j++)
			{
				total += Math.abs(middle - dis[j]);
			}
			System.out.println(total);
		}
	}
	
	public static void Sort(int[] array, int left, int right)
	{
		if (right <= left)
			return;
		int pivotIndex = (left + right) / 2;
		int pivot = array[pivotIndex];
		Swap(array, pivotIndex, right);
		int swapIndex = left;
		for (int i = left; i < right; ++i)
		{
			if (array[i] <= pivot)
			{
            Swap(array, i, swapIndex);
            ++swapIndex;
			}
		}
		Swap(array, swapIndex, right);

		Sort(array, left, swapIndex - 1);
		Sort(array, swapIndex + 1, right);
	}

	private static void Swap(int[] array, int indexA, int indexB)
	{
		int tmp = array[indexA];
		array[indexA] = array[indexB];
		array[indexB] = tmp;
	}
}