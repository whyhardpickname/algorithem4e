//javac -cp C:\Users\MarkChern\algs4\algs4.jar
//javac -cp C:\Users\Administrator\algs4\algs4.jar
//java -cp C:\Users\MarkChern\algs4\algs4.jar;
//java -cp C:\Users\Administrator\algs4\algs4.jar;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;
import java.util.ArrayList;

public class Ex1_1_28
{
	public static int[] dedupliacate(int[] sorted)
	{
		int i = 0;
		int j = 0;
		if (sorted == null)
		{
			return null;
		}
		if (sorted.length == 0)
		{
			return new int[] {};
		}
		while (j < sorted.length)
		{
			while (j < sorted.length && sorted[i] == sorted[j])
			{
				j++;
			}
			if (j < sorted.length)
			{
				sorted[++i] = sorted[j];
			}
		}
		return getArray(sorted, i + 1);
	}
	
	public static int[] getArray(int[] array, int to)
	{
		if (array == null)
		{
			return null;
		}
		int[] copied = new int[to];
		for (int i = 0; i < to; i++)
		{
			copied[i] = array[i];
		}
		return copied;
	}
	
	public static void main(String[] args)
	{
		In in = new In(args[0]);
		int[] whiteList = in.readAllInts();
		Arrays.sort(whiteList);
		for (int i : dedupliacate(whiteList))
		{
			System.out.print( i + " ");
		}
	}
}