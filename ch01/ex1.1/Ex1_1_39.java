import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import java.util.Arrays;

public class Ex1_1_39
{
	public static void main(String[] args)
	{
		printTable(binarySerach(100));
	}
	
	public static int[] binarySerach(int t)
	{
		int[] result = new int[4];
		int index = 0;
		for (int i = 1000; i <= 1000000; i *= 10)
		{
			for (int l = 0; l < t; l++)
			{
				int[] a = new int[i];
				int[] b = new int[i];
				for (int j = 0; j < i; j++)
				{
					a[j] = StdRandom.uniform(100000, 1000000);
					b[j] = StdRandom.uniform(100000, 1000000);
				}
				for (int k = 0; k < a.length; k++)
				{
					if (rank(b, a[k]) >= 0)
					{
						result[index]++;
					}
				}
			}
			result[index] /= t;
			index++;
 		}
		return result;
	}
	
	public static int rank(int[] a, int key)
	{
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi)
		{
			int mid = lo + (hi - lo) / 2;
			if (a[mid] > key)
			{
				hi = mid - 1;
			}
			else if (a[mid] < key)
			{
				lo = mid + 1;
			}
			else
			{
				return mid;
			}
		}
		return -1;
	}
	
	public static void printTable(int[] table) 
	{
		for (int i = 0; i < table.length; i++)
		{
			StdOut.printf("%5d ", table[i]);		
		}		
	}
}