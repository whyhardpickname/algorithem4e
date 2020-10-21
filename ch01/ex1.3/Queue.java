import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class Queue<Item> implements Iterable<Item>
{
    private int n;
    private Node first;
    private Node last;

    private class Node
    {
        Item item;
        Node next;
    }

    public void enqueue(Item item)
    {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        if (isEmpty())
        {
            first = last;
        }
        else
        {
            oldLast.next = last;
        }
        n++;
    }

    public Item dequeue()
    {
        Item item = first.item;
        first = first.next;
        if (isEmpty())
        {
            last = null;
        }
        n--;
        return item;
    }

    public int size()
    {
        return n;
    }

    public boolean isEmpty()
    {
        return first == null;
    }

    public Iterator<Item> iterator()
    {
        return new QueueIterator();
    }

    private class QueueIterator implements Iterator<Item>
    {
        private Node iter = first;

        public boolean hasNext()
        {
            return iter.next != null;
        }

        public Item next()
        {
            return iter.next.item;
        }

        public void remove(){}
    }

    public static void main(String[] args)
    {
        Queue<String> queue = new Queue<>();
        while (!StdIn.isEmpty())
        {
            String item = StdIn.readString();
            if (!item.equals("-"))
            {
                queue.enqueue(item);
            }
            else if (!queue.isEmpty()) {
                StdOut.print(queue.dequeue() + " ");
            }
        }
        StdOut.println("(" + queue.size() + "left on stack)");
    }
}
