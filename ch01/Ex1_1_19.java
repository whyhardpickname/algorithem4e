//javac -cp C:\Users\MarkChern\algs4\algs4.jar
//java -cp C:\Users\MarkChern\algs4\algs4.jar;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_19
{
	public static void main(String[] args)
	{
		for (int N = 0; N < 100; N++)
		{
			StdOut.println(N + " " + Fibonacci.F(N));
		}
	}
}

class Fibonacci
{
	public static long[] fib = new long[200];
	fib[0] = 0;
	fib[1] = 1;
	public static long F(int N)
	{
		if (N == 0 || N == 1)
		{
			return fib[N];
		}
		if (fib[N] != 0)
		{
			return fib[N];
		}
		else
		{
			fib[N] = F(N);
			return F(N - 1) + F(N - 2);
		}
	}
}