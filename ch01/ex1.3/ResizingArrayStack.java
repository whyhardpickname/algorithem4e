import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class ResizingArrayStack<Item>
{
    private int n;
    private Item[] a;

    private void resize(int max)
    {
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < n; i++)
        {
            temp[i] = a[i];
        }
        a = temp;
    }

    public ResizingArrayStack(int cap)
    {
        a = (Item[]) new Object[cap];
    }

    public  void push(Item item)
    {
        if (n == a.length)
        {
            resize(2 * a.length);
        }
        a[n++] = item;
    }

    public Item pop()
    {
        Item item = a[--n];
        if (n > 0 && n == a.length / 4)
        a[n] = null;
        {
            resize(a.length / 2);
        }
        return item;
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
        ResizingArrayStack<String> s;
        s = new ResizingArrayStack<String>(100);
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
