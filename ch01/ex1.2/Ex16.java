//javac -cp C:\Users\MarkChern\algs4\algs4.jar
//javac -cp C:\Users\Administrator\algs4\algs4.jar
//java -cp C:\Users\MarkChern\algs4\algs4.jar;
//java -cp C:\Users\Administrator\algs4\algs4.jar;
// import edu.princeton.cs.algs4.StdIn;
// import edu.princeton.cs.algs4.In;
// import edu.princeton.cs.algs4.StdOut;
// import edu.princeton.cs.algs4.StdRandom;
// import edu.princeton.cs.algs4.StdDraw;

public class Ex16
{	
	public static void main(String[] args)
	{
		Rational r1 = new Rational(1, 3);
		Rational r2 = new Rational(1, 2);
		System.out.println(r1.plus(r2));
		System.out.println(r1.minus(r2));
		System.out.println(r1.times(r2));
		System.out.println(r1.divides(r2));
		System.out.println(r1.equals(r2));
	}
}
