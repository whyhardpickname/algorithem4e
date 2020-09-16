//javac -cp C:\Users\MarkChern\algs4\algs4.jar
//javac -cp C:\Users\Administrator\algs4\algs4.jar
//java -cp C:\Users\MarkChern\algs4\algs4.jar;
//java -cp C:\Users\Administrator\algs4\algs4.jar;
// import edu.princeton.cs.algs4.StdIn;
// import edu.princeton.cs.algs4.In;
// import edu.princeton.cs.algs4.StdOut;
// import edu.princeton.cs.algs4.StdRandom;
// import edu.princeton.cs.algs4.StdDraw;

public class Ex15
{	
	public static void main(String[] args)
	{
		String name = args[0];
		int[] a = readIns(name);
		for (int i: a)
		{
			System.out.println(i);
		}
	}
	
	public static int[] readIns(String name)
	{
		String[] intString = name.split("[^0123456789]");
		int[] ints = new int[intString.length];
		for (int i = 0; i < ints.length; i++)
		{
			ints[i] = Integer.parseInt(intString[i]);
		}
		return ints;
	}
}
