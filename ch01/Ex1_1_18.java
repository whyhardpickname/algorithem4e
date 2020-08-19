//javac -cp C:\Users\MarkChern\algs4\algs4.jar
//java -cp C:\Users\MarkChern\algs4\algs4.jar;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex1_1_18
{
	public static void main(String[] args)
	{
		/*
			50
			33
			
		*/
		System.out.println("mystery(2, 25) = " + 
			mystery(2, 25));
		System.out.println("mystery(3, 11) = " + 
			mystery(3, 11));
		
		System.out.println("mystery2(2, 8) = " + 
			mystery2(2, 8));
		System.out.println("mystery2(2, 10) = " + 
			mystery2(2, 10));
		
			
	}
	
	public static int mystery(int a, int b)
	{
		if (b == 0)
		{
			return 0;
		}
		
		if (b % 2 == 0)
		{
			return mystery(a + a, b / 2);
		}
		return mystery(a + a, b / 2) + a;
	}
	
	public static int mystery2(int a, int b)
	{
		if (b == 0)
		{
			return 1;
		}
		
		if (b % 2 == 0)
		{
			return mystery(a * a, b / 2);
		}
		return mystery(a * a, b / 2) * a;
	}
}