//javac -cp C:\Users\MarkChern\algs4\algs4.jar
//javac -cp C:\Users\Administrator\algs4\algs4.jar
//java -cp C:\Users\MarkChern\algs4\algs4.jar;
//java -cp C:\Users\Administrator\algs4\algs4.jar;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ex6
{	
	public static void main(String[] args)
	{
		int m = 10;
		int n = 10000;
		shuffleTest(m, n);
	}
	
	public static void shuffle(int[] a)
	{
		int tmp = 0;
		int random = 0;
		for (int i = 0; i < a.length; i++)
		{
			random = StdRandom.uniform(0, a.length);
			tmp = a[i];
			a[i] = a[random];
			a[random] = tmp;
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
				counter[a[i]][i]++;
			}
		}
		printTable(counter);
	}
	
	public static void printTable(int[][] table) 
	{
		for (int i = 0; i < table.length; i++)
		{
			for (int j = 0; j < table.length; j++)
			{
				StdOut.printf("%5d ", table[i][j]);
			}
			StdOut.println();
		}
	}
}