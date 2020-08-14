//C:\Users\MarkChern\algs4\algs4.jar
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_13
{
	public static void main(String[] args)
	{
		int[][] a = {
			{1, 2},
			{3, 4},
			{5, 6}
		};
		int[][] b = transpose(a);
		for (int i = 0; i < b.length; i++)
		{
			for (int j = 0; j <b[0].length ; j++)
			{
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	}
	
	public static int[][] transpose(int[][] a)
	{
		if (a == null || a.length == 0)
		{
			return null;
		}
		
		int rows = a.length;
		int columns = a[0].length;
		int[][] transposed = new int[columns][rows];
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < columns; j++)
			{
				transposed[j][i] = a[i][j];
			}
		}
		return transposed;
	}
	
}