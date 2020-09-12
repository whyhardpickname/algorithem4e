//javac -cp C:\Users\MarkChern\algs4\algs4.jar
//javac -cp C:\Users\Administrator\algs4\algs4.jar
//java -cp C:\Users\MarkChern\algs4\algs4.jar;
//java -cp C:\Users\Administrator\algs4\algs4.jar;
// import edu.princeton.cs.algs4.StdIn;
// import edu.princeton.cs.algs4.In;
// import edu.princeton.cs.algs4.StdOut;
// import edu.princeton.cs.algs4.StdRandom;

public class Ex7
{	
	public static void main(String[] args)
	{
		System.out.println(reverse("abc"));
	}
	
	public static String reverse(String s)
	{
		if (s == null)
		{
			return null;
		}
		int n = s.length();
		if (n <= 1)
		{
			return s;
		}
		String a = s.substring(0, n / 2);
		String b = s.substring(n / 2, n);
		return reverse(b) + reverse(a);
	}
}