import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;

public class Ex1_1_38
{
	public static int rank(int[] a, int key)
	{
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] == key)
			{
				return i;
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
				//StdOut.println(key);
			}
		}
		time = System.currentTimeMillis() - time;
		System.out.println("time: " + time);
	}
}