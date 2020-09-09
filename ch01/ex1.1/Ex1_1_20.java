//javac -cp C:\Users\MarkChern\algs4\algs4.jar
//java -cp C:\Users\MarkChern\algs4\algs4.jar;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_20
{
	public static void main(String[] args)
	{
		int N = 10;
		System.out.println(Math.log(factorial(N)));
	}
	
	public static long factorial(int N)
	{
		if (N == 0)
		{
			return 1;
		}
		return factorial(N - 1) * N;
	}
}
