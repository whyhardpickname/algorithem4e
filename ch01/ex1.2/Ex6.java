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
		String a = "actgacg";
		String b = "tgacgac";
		StdOut.println("isCircularRotation(String a, String b) = " + isCircularRotation(a, b));
	}
	
	public static boolean isCircularRotation(String a, String b)
	{
		if (a == null || b == null)
		{
			return false;
		}
		return a.length() == b.length() && (a + a).indexOf(b) != -1;
	}
}