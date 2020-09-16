//javac -cp C:\Users\MarkChern\algs4\algs4.jar
//javac -cp C:\Users\Administrator\algs4\algs4.jar
//java -cp C:\Users\MarkChern\algs4\algs4.jar;
//java -cp C:\Users\Administrator\algs4\algs4.jar;
// import edu.princeton.cs.algs4.StdIn;
// import edu.princeton.cs.algs4.In;
// import edu.princeton.cs.algs4.StdOut;
// import edu.princeton.cs.algs4.StdRandom;
// import edu.princeton.cs.algs4.StdDraw;

public class Rational
{	
	public final long numerator;
	public final long denominator;
	
	public Rational(int numerator, int denominator)
	{
		
	}
	
	public static int gcd(int a, int b)
	{
		if (a % b == 0)
		{
			return b;
		}
		return gcd(b, a % b);
	}
}
