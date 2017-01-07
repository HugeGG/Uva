import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int i = 1;
		int[] input = new int[10001];
		while(in.hasNext())
		{
			int now = 1 / 2;
			int test = i % 2;
			input[i] = in.nextInt();
			Sort(input, 1, i);
			long cut = input[i / 2] + input[(i / 2) + 1];
			if(test == 1)
				System.out.println(input[(i / 2) + 1]);
			else if(test == 0)
				System.out.println(cut / 2);
			i++;
		}
	}
	
	public static void Sort(int[] array, int left, int right)
    	{
        if (right <= left)
            return;
 
        // middle pivot
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