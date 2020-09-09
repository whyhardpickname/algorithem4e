//javac -cp C:\Users\MarkChern\algs4\algs4.jar
//javac -cp C:\Users\Administrator\algs4\algs4.jar
//java -cp C:\Users\MarkChern\algs4\algs4.jar;
//java -cp C:\Users\Administrator\algs4\algs4.jar;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;
import java.util.ArrayList;

public class Ex1_1_29
{
	public static int rank(int key, int[] a)
	{
		int index = rank(a, key);
		if (index < 0)
		{
			return -index - 1;
		}
		while (index >= 0 && a[index] == key)
		{
			index--;
		}
		return index + 1;
	}
	
	public static int count(int key, int[] a)
	{
		int index = rank(a, key);
		if (index < 0)
		{
			return 0;
		}
		int l = index - 1;
		int r = index + 1;
		int counter = 1;
		while (l >= 0 &&a[l] == key)
		{
			counter++;
			l--;
		}
		while (r < a.length && a[r] == key)
		{
			counter++;
			r++;
		}
		
		return counter;
	}
	
	public static int rank(int[] a, int key)
	{
		int lo = 0;
		int hi = a.length - 1;
		int mid = 0;
		while (lo <= hi)
		{
			mid = lo + (hi - lo) / 2;
			
			if (a[mid] > key)
			{
				hi = mid -  1;
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
		return -mid - 1;
	}
	
	public static void main(String[] args)
	{
		In in = new In(args[0]);
		int[] whiteList = in.readAllInts();
		Arrays.sort(whiteList);
		
		for (int i : whiteList)
		{
			StdOut.print(i + " ");
		}
		StdOut.println();
		while (!StdIn.isEmpty())
		{
			int key = StdIn.readInt();
			StdOut.print("key = " + key + ", rank = ");
			StdOut.println("rank(key, a) = " + rank(key, whiteList)
					+ ", count(key, a) = " + count(key, whiteList));
		}
	}
}