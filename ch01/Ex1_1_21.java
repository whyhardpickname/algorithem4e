//javac -cp C:\Users\MarkChern\algs4\algs4.jar
//java -cp C:\Users\MarkChern\algs4\algs4.jar;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.util.*;

public class Ex1_1_21
{
	public static void main(String[] args)
	{
		ArrayList<String> names = new ArrayList<>();
		ArrayList<ArrayList<Integer>> datas = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> data;
		while (!StdIn.isEmpty())
		{
			data = new ArrayList<>();
			names.add(StdIn.readString());
			data.add(StdIn.readInt());
			data.add(StdIn.readInt());
			datas.add(data);
		}
		print(names, datas);
	}
	
	public static void print(ArrayList<String> names, ArrayList<ArrayList<Integer>> datas)
	{
		for (int i = 0; i < names.size(); i++)
		{
			StdOut.printf("%6s %3d %3d %6.3f\n", names.get(i), 
				datas.get(i).get(0), datas.get(i).get(1), 
				datas.get(i).get(0) * 1.0 / datas.get(i).get(1));
		}
	}
}

