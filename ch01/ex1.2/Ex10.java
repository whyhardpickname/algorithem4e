//javac -cp C:\Users\MarkChern\algs4\algs4.jar
//javac -cp C:\Users\Administrator\algs4\algs4.jar
//java -cp C:\Users\MarkChern\algs4\algs4.jar;
//java -cp C:\Users\Administrator\algs4\algs4.jar;
// import edu.princeton.cs.algs4.StdIn;
// import edu.princeton.cs.algs4.In;
// import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdDraw;

public class Ex10
{	
	public static void main(String[] args)
	{
		VisualCounter distance = new VisualCounter(10, 100);
		for (int i = 0; i < 100; i++)
		{
			if (StdRandom.bernoulli(0.5))
			{
				distance.increase();
			}
			else
			{
				distance.decrease();
			}
			distance.draw();
		}
	}
}

class VisualCounter 
{
	private int increasement;
	private int decreasement;
	
	public VisualCounter(int max, int n)
	{
		increasement = 0;
		decreasement = 0;
		StdDraw.setXscale(0, n);
		StdDraw.setYscale(-max, max);
		StdDraw.setPenRadius(0.005);
	}
	
	public void increase()
	{
		increasement++;
	}
	
	public void decrease()
	{
		decreasement--;
	}
	
	public void draw()
	{
		StdDraw.setPenColor(StdDraw.DARK_GRAY);
		StdDraw.point(opretions(), tally());
	}
	public int tally()
	{
		return increasement + decreasement;
	}
	
	public int opretions()
	{
		return increasement + Math.abs(decreasement);
	}
	public String toString()
	{
		return "count " + tally(); 
	}
}