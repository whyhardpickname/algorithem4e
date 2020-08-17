//javac -cp C:\Users\MarkChern\algs4\algs4.jar
//java -cp C:\Users\MarkChern\algs4\algs4.jar;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_16
{
	public static void main(String[] args)
	{
		/*
			311361142246
		*/
		System.out.println(exR1(6));
	}
	
	public static String exR1(int n)
	{
		if (n <= 0) 
		{
			return "";
		}
		return exR1(n - 3) + n + exR1(n - 2) + n;
	}
}