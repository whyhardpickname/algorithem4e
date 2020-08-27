//javac -cp C:\Users\MarkChern\algs4\algs4.jar
//javac -cp C:\Users\Administrator\algs4\algs4.jar
//java -cp C:\Users\MarkChern\algs4\algs4.jar;
//java -cp C:\Users\Administrator\algs4\algs4.jar;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;
import java.util.ArrayList;

public class Ex1_1_26
{
	public static void main(String[] args)
	{
		int[] arr = rank(3, 2, 1);
		for (int i : arr)
		{
			System.out.print(i + " ");
		}
	}
	
	public static int[] rank(int a, int b, int c)
	{
		int t;
		if (a > b)
		{
			t = a;
			a = b;
			b = t;
		}
		if (a > c)
		{
			t = a;
			a = c;
			c = t;
		}
		if (b > c)
		{
			t = b;
			b = c;
			c = t;
		}
		return new int[] {a, b, c};
	}
}