//C:\Users\MarkChern\algs4\algs4.jar
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_11
{
	public static void main(String[] args)
	{
		char[][] arr = 
		{
			{'*', ' ', ' '},
			{' ', '*', ' '},
			{'*', '*', '*'}
		};
		
		StdOut.print(' ');
		for (int i = 0; i < arr.length; i++)
		{
			StdOut.print(' ');
			StdOut.print(i + 1);
		}
		StdOut.println();
		
		for (int i = 0; i < arr.length; i++)
		{
			StdOut.print(i + 1);
			StdOut.print(' ');
			for (int j = 0; j < arr[i].length; j++)
			{
				StdOut.print(arr[i][j]);
				StdOut.print(' ');
			}
			StdOut.println();
		}
	}
}