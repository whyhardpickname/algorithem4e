//C:\Users\MarkChern\algs4\algs4.jar
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_15
{
	public static void main(String[] args)
	{
		int[] a = {1, 1, 2, 2, 3, 3};
		int[] b = histogram(a, a.length);
		for(int e: b)
		{
			System.out.print(e + " ");
		}	
	}
	
	public static int[] histogram(int[] a, int M)
	{
		int[] histogram = new int[M];
		
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] < M)
			{
				histogram[a[i]]++;
			}
		}
		return histogram;
	}
}