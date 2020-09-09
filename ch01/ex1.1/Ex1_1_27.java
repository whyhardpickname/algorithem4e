//javac -cp C:\Users\MarkChern\algs4\algs4.jar
//javac -cp C:\Users\Administrator\algs4\algs4.jar
//java -cp C:\Users\MarkChern\algs4\algs4.jar;
//java -cp C:\Users\Administrator\algs4\algs4.jar;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;
import java.util.ArrayList;

public class Ex1_1_27
{
	private static int depth  = 0;
	private static ArrayList<ArrayList<Integer>> ranges = new ArrayList<>();
	private static ArrayList<Integer> range = new ArrayList<>();
	
	public static double binomial(int N, int k, double p)
	{
		depth++;
		if (N == 0 && k == 0)
		{
			return 1.0;
		}
		if (N < 0 || k < 0)
		{
			return 0.0;
		}
		return (1 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
	}
	
	public static void main(String[] args)
	{
		for (int i = 1; i <= 20; i++)
		{
			
			binomial(i, i / 2, 0.5);
			StdOut.println("N = " + i + ", depth = " + depth + ", 2^" + i + " = " 
				 + (Math.pow(2, i + 2) - 2));
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