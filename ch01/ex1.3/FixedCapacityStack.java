import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class FixedCapacityStack<Item>
{
    private int n;
    private Item[] a;

    public FixedCapacityStack(int cap)
    {
        a = (Item[]) new Object[cap];
    }

    public  void push(Item item)
    {
        a[n++] = item;
    }

    public Item pop()
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
        FixedCapacityStack<String> s;
        s = new FixedCapacityStack<String>(100);
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
