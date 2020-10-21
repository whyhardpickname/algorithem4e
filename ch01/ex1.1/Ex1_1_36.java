//javac -cp C:\Users\MarkChern\algs4\algs4.jar
//javac -cp C:\Users\Administrator\algs4\algs4.jar
//java -cp C:\Users\MarkChern\algs4\algs4.jar;
//java -cp C:\Users\Administrator\algs4\algs4.jar;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ex1_1_36
{	
	public static void main(String[] args)
	{

	}
	
	public static void shuffle(int[] a)
	{
		int tmp = 0;
		int random = 0;
		for (int i = 0; i < a.length; i++)
		{
			random = StdRandom.uniform(i, a.length);
			tmp = a[i];
			a[i] = a[random];
			a[random] = a[i];
		}
	}	
	
	public static void shuffleTest(int m, int n)
	{
		int[][] counter = new int[m][m];
		int[] a = new int[m];
		for (int j = 0; j < n; j++)
		{
			for (int i = 0; i < m; i++)
			{
				a[i] = i;
			}
			shuffle(a);
			for (int i = 0; i < m; i++)
			{
				for (int k = 0; k < m; k++)
				{
					counter[a[i]][i]++;
				}
			}
		}
		printTable(counter);
	}
	
	public static void printTable(int[][] t) 
	{

	}
}