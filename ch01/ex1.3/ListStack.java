import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.awt.event.ItemEvent;
import java.util.Iterator;

public class ListStack<Item> implements Iterable<Item>
{
    private int n;
    private Node first;
    private class Node
    {
        Item item;
        Node next;
    }

    public void push(Item item)
    {
        Node oldfirt = first;
        first = new Node();
        first.item = item;
        first.next = oldfirt;
        n++;
    }

    public Item pop()
    {
        Item item = first.item;
        first = first.next;
        n--;
        return item;
    }
    public Item peek()
    {
        return first.item;
    }
    public boolean isEmpty()
    {
        return n == 0;
    }

    public int size()
    {
        return n;
    }

    public Iterator<Item> iterator()
    {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item>
    {
        private Node iter = first;
        public boolean hasNext()
        {
            return first.next != null;
        }

        public Item next()
        {
            return first.next.item;
        }

        public void remove()
        {

        }
    }

    public static void main(String[] args)
    {
        ListStack<String> s;
        s = new ListStack<String>();
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
