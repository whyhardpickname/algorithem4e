//javac -cp C:\Users\MarkChern\algs4\algs4.jar
//java -cp C:\Users\MarkChern\algs4\algs4.jar;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_17
{
	public static void main(String[] args)
	{
		/*
			stack over flow error
		*/
		System.out.println(exR1(6));
	}
	
	public static String exR1(int n)
	{
		String s = exR1(n - 3) + n + exR1(n - 2) + n;
		if (n <= 0) 
		{
			return "";
		}
		return s;
	}
}