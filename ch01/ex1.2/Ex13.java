//javac -cp C:\Users\MarkChern\algs4\algs4.jar
//javac -cp C:\Users\Administrator\algs4\algs4.jar
//java -cp C:\Users\MarkChern\algs4\algs4.jar;
//java -cp C:\Users\Administrator\algs4\algs4.jar;
// import edu.princeton.cs.algs4.StdIn;
// import edu.princeton.cs.algs4.In;
// import edu.princeton.cs.algs4.StdOut;
// import edu.princeton.cs.algs4.StdRandom;
// import edu.princeton.cs.algs4.StdDraw;
package ex1_1;
public class Ex13
{	
	public static void main(String[] args)
	{
		SmartDate date1 = new SmartDate(2020, 6, 18);
		SmartDate date2 = new SmartDate(2020, 6, 19);
		Transaction t1 = new Transaction("mark", date1, 2200);
		Transaction t2 = new Transaction("mark", date2, 2200);
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}
}
