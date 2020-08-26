import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;

public class Ex1_1_22
{
	public static int rank(int[] a, int key)
	{
		return rank(a, 0, a.length - 1, key);
	}
	
	public static int rank(int[] a, int lo, int hi, int key)
	{
		while (lo > hi)
		{
			int mid = lo + (hi - lo) / 2;
			if (a[mid] > key)
			{
				return rank(a, 0, mid, key); 
			}
			else if (a[mid] < key)
			{
				return rank(a, mid, a.length - 1, key);
			}
			else
			{
				return mid;
			}
		}
		return -1;
	}
	
	public static void main(String[] args)
	{
		In in = new In(args[0]);
		int[] whiteList = in.readAllInts();
		Arrays.sort(whiteList);
		while (!StdIn.isEmpty())
		{
			int key = StdIn.readInt();
			if (rank(whiteList, key) < 0)
			{
				StdOut.println(key);
			}
		}
	}
}