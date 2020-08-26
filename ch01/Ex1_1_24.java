//javac -cp C:\Users\MarkChern\algs4\algs4.jar
//javac -cp C:\Users\Administrator\algs4\algs4.jar
//java -cp C:\Users\MarkChern\algs4\algs4.jar;
//java -cp C:\Users\Administrator\algs4\algs4.jar;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;
import java.util.ArrayList;

public class Ex1_1_24
{
	private static int depth  = 0;
	private static ArrayList<ArrayList<Integer>> ranges = new ArrayList<>();
	private static ArrayList<Integer> range = new ArrayList<>();
	
	public static int gcd(int a, int b)
	{
		depth++;
		range = new ArrayList<>();
		range.add(a);
		range.add(b);
		ranges.add(range);
		if ( a % b == 0)
		{
			return b;
		}
		return gcd(b, a % b);
	}
	
	public static void main(String[] args)
	{
		System.out.println("gcd(105, 24) = " + gcd(105, 24));
		printArgs();
		System.out.println("gcd(1111111, 1234567) = " + gcd(1111111, 1234567));
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