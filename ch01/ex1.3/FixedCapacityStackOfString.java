import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class FixedCapacityStackOfString {
    private int n;
    private String[] a;

    public FixedCapacityStackOfString(int cap)
    {
        a = new String[cap];
    }

    public  void push(String item)
    {
        a[n++] = item;
    }

    public String pop()
    {
        return a[--n];
    }

    public boolean isEmpty()
    {
        return n == 0;
    }

    public int size()
    {
        return n;
    }

    public static void main(String[] args)
    {
        FixedCapacityStackOfString s;
        s = new FixedCapacityStackOfString(100);
        while (!StdIn.isEmpty())
        {
            String item = StdIn.readString();
            if (!item.equals("-"))
            {
                s.push(item);
            }
            else if (!s.isEmpty()) {
                StdOut.print(s.pop() + " ");
            }
        }
        StdOut.println("(" + s.size() + "left on stack)");
    }
}
