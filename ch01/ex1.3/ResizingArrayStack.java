import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class ResizingArrayStack<Item> implements Iterable<Item>
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

    public Iterator<Item> iterator()
    {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item>
    {
        private int i = n;

        public boolean hasNext()
        {
            return i > 0;
        }

        public Item next()
        {
            return a[--i];
        }

        public void remove()
        {

        }
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
        a[n] = null;
        if (n > 0 && n == a.length / 4)
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
