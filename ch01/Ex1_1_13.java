//C:\Users\MarkChern\algs4\algs4.jar
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_13
{
	public static void main(String[] args)
	{
		System.out.println("lg(1) = " + lg(1));
		System.out.println("lg(2) = " + lg(2));
		System.out.println("lg(3) = " + lg(3));
		System.out.println("lg(4) = " + lg(4));
	}
	
	public static int lg(int N)
	{
		if (N <= 0)
		{
			return -1;
		}
		
		int prod = 1;
		int exponent = 0;
		while(prod < N)
		{
			prod *= 2;
			exponent++;
		}
		
		if (prod == N)
		{
			return exponent;
		}
		return exponent - 1;
	}
}