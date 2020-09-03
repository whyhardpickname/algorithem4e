//javac -cp C:\Users\MarkChern\algs4\algs4.jar
//javac -cp C:\Users\Administrator\algs4\algs4.jar
//java -cp C:\Users\MarkChern\algs4\algs4.jar;
//java -cp C:\Users\Administrator\algs4\algs4.jar;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ex1_1_35
{	
	public static void main(String[] args)
	{
		int SIDES = 6;
		double[] dist = distribution(SIDES);
		double[] counter = new double[2 * SIDES + 1];
		double[] frequency = new double[2 * SIDES + 1];
		long N = 1;
		long trials = 0;
		do
		{
			N *= 10;
			for (int i = 0; i < N; i++)
			{
				int sum = StdRandom.uniform(1, SIDES + 1)
							+ StdRandom.uniform(1, SIDES + 1);
				counter[sum] += 1;
				
			}
			trials += N;
			for (int k = 2; k <= 2 * SIDES; k++)
			{
				frequency[k] = counter[k] / trials;
			}
			printDiff(trials, dist, frequency);
		} while (!isAccuracy(dist, frequency, 0.001));
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
		return dist;
	}
	
	public static boolean isAccuracy(double[] a, double[] b, double accuracy)
	{
		for (int i = 2; i < a.length; i++)
		{
			if (Math.abs(a[i] - b[i]) >= accuracy)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void printDiff(long N, double[] dist, double[] frequency)
	{
		StdOut.println("N = " + N);
		for(int i = 2; i < dist.length;i++)
		{
			StdOut.printf("%.4f ", dist[i]);
		}
		StdOut.println();
		for(int i = 2; i < frequency.length;i++)
		{
			StdOut.printf("%.4f ", frequency[i]);
		}
		StdOut.println();
	}


}