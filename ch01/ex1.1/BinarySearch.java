import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;

public class BinarySearch
{
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
	
	public static void main(String[] args)
	{
		In in = new In(args[0]);
		int[] whiteList = in.readAllInts();
		Arrays.sort(whiteList);
		long time = System.currentTimeMillis();
		while (!StdIn.isEmpty())
		{
			int key = StdIn.readInt();
			if (rank(whiteList, key) < 0)
			{
				StdOut.println(key);
			}
		}
		time = System.currentTimeMillis() - time;
		System.out.println("time: " + time);
	}
}