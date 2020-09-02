//javac -cp C:\Users\MarkChern\algs4\algs4.jar
//javac -cp C:\Users\Administrator\algs4\algs4.jar
//java -cp C:\Users\MarkChern\algs4\algs4.jar;
//java -cp C:\Users\Administrator\algs4\algs4.jar;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_33
{	
	public static void main(String[] args)
	{
		double[] x = {1, 2};
		double[] y = {3, 2};
		StdOut.println("Matrix.dot(x, y) = " + Matrix.dot(x, y));
		
		double[][] a = {
			{1, 2},
			{3, 4}
		};
		
		double[][] b = {
			{1, 2},
			{3, 4}
		};
		StdOut.println("Matrix.mult(a, b) = ");
		double[][] c = Matrix.mult(a, b);
		for (int i = 0; i < a.length; i++)
		{
			StdOut.println();
			for (int j = 0; j < b[0].length; j++)
			{
				StdOut.printf("%.2f ", c[i][j]);
			}
		}
		StdOut.println("Matrix.transpose(a) = ");
		double[][] d = Matrix.transpose(a);
		for (int i = 0; i < d.length; i++)
		{
			StdOut.println();
			for (int j = 0; j < d[0].length; j++)
			{
				StdOut.printf("%.2f ", d[i][j]);
			}
		}
		StdOut.println();
		StdOut.println("Matrix.mult(a, x) = ");
		double[] e = Matrix.mult(a, x);
		for (int i = 0; i < e.length; i++)
		{
			StdOut.printf("%.2f\n ", e[i]);
		}
		
		StdOut.println();
		StdOut.println("Matrix.mult(a, x) = ");
		double[] f = Matrix.mult(y, a);
		for (int i = 0; i < f.length; i++)
		{
			StdOut.printf("%.2f ", f[i]);
		}
	}
}

class Matrix
{
	private double[][] matrix;
	
	public Matrix(double[][] matrix)
	{
		this.matrix = matrix;
	}
	
	public static double dot(double[] x, double[] y)
	{
		double sum = 0;
		for (int i = 0; i < x.length; i++)
		{
			sum += x[i] * y [i];
		}
		return sum;
	}
	
	public static double[][] mult(double[][] a, double[][] b)
	{
		double[][] c = new double[a.length][b[0].length];
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < b[0].length; j++)
			{
				for (int k = 0; k < b.length; k++)
				{
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return c;
	}
	
	public static double[][] transpose(double[][] a)
	{
		double[][] transposed = new double[a[0].length][a.length];
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[0].length; j++)
			{
				transposed[j][i] = a[i][j];
			}
		}
		return transposed;
	}
	
	public static double[] mult(double[][] a, double[] x)
	{
		double[] c = new double[x.length];
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < x.length; j++)
			{
				c[i] += a[i][j] * x[j];
			}
		}
		return c;
	}
	
	public static double[] mult(double[] y, double[][] a)
	{
		double[] c = new double[a.length];
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < y.length; j++)
			{
				c[i] += a[i][j] * y[j];
			}
		}
		return c;
	}
}