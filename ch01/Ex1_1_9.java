//C:\Users\MarkChern\algs4\algs4.jar
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_9
{
	public static void main(String[] args)
	{
		int n = StdIn.readInt();
		String s = "";
		while (n != 0)
		{
			s += n % 2;
			n /= 2;
		}
		StdOut.println(s);
	}
}