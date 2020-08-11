import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_7
{
	public static void main(String[] args)
	{
		double t = 9.0;
		while(Math.abs(t - 9.0 / t) > .0001)
		{
			t = (9.0 / t - t) / 2.0;
		}
		//t = 5.00000
		StdOut.printf("%f\n", t);
		
		int sum = 0;
		for (int i = 1; i < 1000; i++)
		{
			for (int j = 0; j < i; j++)
			{
				sum++;
			}
		}
		//sum = 1 + 2 + ... + 999 
		//    = 999 * (1 + 999) / 2
		//    = (1000 - 1) * 500
		//	  = 500000 - 500
		//    = 499500
		StdOut.println(sum);
		
		sum = 0;
		for (int i = 1; i < 1000; i *= 2)
		{
			for (int j = 0; j < i; j++)
			{
				sum++;
			}
		}
		//sum = 2^0 + 2^1 + ... + 2^9 = 1023
		StdOut.println(sum);
		
		
	}
}