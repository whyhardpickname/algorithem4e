//javac -cp C:\Users\MarkChern\algs4\algs4.jar
//javac -cp C:\Users\Administrator\algs4\algs4.jar
//java -cp C:\Users\MarkChern\algs4\algs4.jar;
//java -cp C:\Users\Administrator\algs4\algs4.jar;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_35
{	
	public static void main(String[] args)
	{
		double[] theory = distribution(6);
		double[] experiment = new double[2 * SIDES + 1];
		int N = 1;
		while (!isAccuracy(dist, experiment))
		{
			N *= 2;
			for (int i = 0; i < N; i++)
			{
				experiment[uniform(1, 7)] += 1;
				
			}
			
		}
	}
	
	public static double[] distribution(int SIDES)
	{
		double[] dist = new double[2 * SIDES + 1];
		for (int i = 1; i <= SIDES; i++)
		{
			for (int j = 1; j <= SIDES; j++)
			{
				dist[i + j] += 1;
			}
		}
		for (int k = 2; k <= 2 * SIDES; k++)
		{
			dist[k] /= 36;
		}
	}
	
	public static boolean isAccuracy(double[] a, double[] b, double accuracy)
	{
		for (int i = 2; i < a.length)
		{
			if (Math.abs(a[i] - b[i]) >= accuracy)
			{
				return false;
			}
		}
		return true;
	}


}