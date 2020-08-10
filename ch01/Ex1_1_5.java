import edu.princeton.cs.algs4.StdIn;

public class Ex1_1_5
{
	public static void main(String[] args)
	{
		double x = StdIn.readDouble();
		double y = StdIn.readDouble();
		
		if (0 < x && x < 1 &&
			0 < y && y < 1)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}
}