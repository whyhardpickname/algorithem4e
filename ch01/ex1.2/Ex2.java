import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Point2D;

public class Ex2
{
	public static void main(String[] args)
	{
		int n = 0;
		try
		{
			n = Integer.parseInt(args[0]);
			System.out.println(n);
		}
		catch (NumberFormatException e)
		{
			System.out.println("Usage: java Ex2 anInteger");
		}
		
	}
}