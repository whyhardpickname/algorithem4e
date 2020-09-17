//javac -cp C:\Users\MarkChern\algs4\algs4.jar
//javac -cp C:\Users\Administrator\algs4\algs4.jar
//java -cp C:\Users\MarkChern\algs4\algs4.jar;
//java -cp C:\Users\Administrator\algs4\algs4.jar;
// import edu.princeton.cs.algs4.StdIn;
// import edu.princeton.cs.algs4.In;
// import edu.princeton.cs.algs4.StdOut;
// import edu.princeton.cs.algs4.StdRandom;
// import edu.princeton.cs.algs4.StdDraw;

public class Ex18
{	
	public static void main(String[] args)
	{
		Accumulator a = new Accumulator();
		a.add(600);
		a.add(470);
		a.add(170);
		a.add(430);
		a.add(300);
		System.out.println(a.mean());
		System.out.println(a.var());
		System.out.println(a.std());
	}
}
