//javac -cp C:\Users\MarkChern\algs4\algs4.jar
//javac -cp C:\Users\Administrator\algs4\algs4.jar
//java -cp C:\Users\MarkChern\algs4\algs4.jar;
//java -cp C:\Users\Administrator\algs4\algs4.jar;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_30
{
	public static int gcd(int a, int b)
	{
		if (b == 0)
		{
			return a;
		}
		return gcd(b, a % b);
	}
	
	public static void main(String[] args)
	{
		boolean [][] a = new boolean[10][10];
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[0].length; j++)
			{
				if (i == 0 || j == 0)
				{
					a[i][j] = false;
				}
				else if (gcd(i, j) == 1)
				{
					a[i][j] = true;
				}
				else
				{
					a[i][j] = false;
				}
			}
		}
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[0].length; j++)
			{
				StdOut.print("a[" + i + "][" + j + "] = " + a[i][j] + " ");
			}
			StdOut.println();
		}
	}
	
	
}