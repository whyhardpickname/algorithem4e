//javac -cp C:\Users\MarkChern\algs4\algs4.jar
//javac -cp C:\Users\Administrator\algs4\algs4.jar
//java -cp C:\Users\MarkChern\algs4\algs4.jar;
//java -cp C:\Users\Administrator\algs4\algs4.jar;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;
import java.util.ArrayList;

public class Ex1_1_23
{
	private static int depth  = 0;
	private static ArrayList<ArrayList<Integer>> ranges = new ArrayList<>();
	private static ArrayList<Integer> range = new ArrayList<>();
	
	public static int rank(int[] a, int key)
	{
		depth = 0;
		ranges = new ArrayList<>();
		return rank(a, 0, a.length - 1, key);
	}
	
	public static int rank(int[] a, int lo, int hi, int key)
	{
		depth++;
		range = new ArrayList<>();
		range.add(lo);
		range.add(hi);
		ranges.add(range);
		while (lo <= hi)
		{
			int mid = lo + (hi - lo) / 2;
			if (a[mid] > key)
			{
				return rank(a, lo, mid - 1, key); 
			}
			else if (a[mid] < key)
			{
				return rank(a, mid + 1, hi, key);
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
		int sign = 1;
		if (args[0].compareTo("-") == 0)
		{
			sign = -1;
		}
		In in = new In(args[1]);
		int[] whiteList = in.readAllInts();
		Arrays.sort(whiteList);
		while (!StdIn.isEmpty())
		{
			int key = StdIn.readInt();
			if (sign * rank(whiteList, key) < 0)
			{
				StdOut.println(key);
				printArgs();
			}
		}
	}
	
	public static void printArgs()
	{
		System.out.println("depth = " + depth);
		for (int i = 0; i < depth; i++)
		{
			for (int j = 0; j < i + 1; j++)
			{
				System.out.print(" ");
			}
			
			System.out.println("[" + ranges.get(i).get(0) + ", " 
				+ ranges.get(i).get(1) + "]");
		}
	}
}