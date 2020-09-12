//javac -cp C:\Users\MarkChern\algs4\algs4.jar
//javac -cp C:\Users\Administrator\algs4\algs4.jar
//java -cp C:\Users\MarkChern\algs4\algs4.jar;
//java -cp C:\Users\Administrator\algs4\algs4.jar;
// import edu.princeton.cs.algs4.StdIn;
// import edu.princeton.cs.algs4.In;
// import edu.princeton.cs.algs4.StdOut;
// import edu.princeton.cs.algs4.StdRandom;
import java.util.Arrays;

public class Ex9
{	
	public static void main(String[] args)
	{
		Counter checks = new Counter("checks");
		int[] a = {3, 5, 1, 5, 0, 7, 2, 7};
		System.out.println(binarySearch(a, 0, checks));
		System.out.println(checks);
	}
	
	public static int binarySearch(int[] a, int key, Counter checks)
	{
		Arrays.sort(a);
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi)
		{
			checks.increasement();
			int mi = (lo + hi) / 2;
			System.out.printf("%d %d %d\n", lo, mi, hi);
			if (a[mi] > key)
			{
				hi = mi - 1;
			}
			else if (a[mi] < key)
			{
				lo = mi + 1;
			}
			else
			{
				return mi;
			}
		}
		return -1;
	}
}

class Counter 
{
	private int count;
	private String id;
	
	public Counter(String id)
	{
		count = 0;
		this.id = id;
	}
	
	public void increasement()
	{
		count++;
	}
	
	public int tally()
	{
		return count;
	}
	
	public String toString()
	{
		return id + " " + count;
	}
}