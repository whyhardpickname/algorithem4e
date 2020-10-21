//javac -cp C:\Users\MarkChern\algs4\algs4.jar
//javac -cp C:\Users\Administrator\algs4\algs4.jar
//java -cp C:\Users\MarkChern\algs4\algs4.jar;
//java -cp C:\Users\Administrator\algs4\algs4.jar;
// import edu.princeton.cs.algs4.StdIn;
// import edu.princeton.cs.algs4.In;
// import edu.princeton.cs.algs4.StdOut;
// import edu.princeton.cs.algs4.StdRandom;
// import edu.princeton.cs.algs4.StdDraw;

public class Accumulator
{	
	private double m;
	private int n;
	private double s;
	
	public Accumulator()
	{
		n = 0;
		m = 0;
		s = 0;
	}
	public void add(double x)
	{
		n++;
		s = s + 1.0 * (n - 1) / n * (x - m) * (x - m);
		m = m + (x - m) / n;

	}
	
	public double mean()
	{
		return m;
	}
	
	public double var()
	{
		return s / (n - 1);
	}
	
	public double std()
	{
		return Math.sqrt(var());
	}
}
