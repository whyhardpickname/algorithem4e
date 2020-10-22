import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;
import java.util.ListIterator;

public class Bag<Item> implements Iterable<Item>
{
    private Node first;
    private class Node
    {
        Item item;
        Node next;
    }

    public void add(Item item)
    {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }

    public Iterator<Item> iterator()
    {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item>
    {
        private Node current = first;
        public boolean hasNext()
        {
            return current != null;
        }

        public Item next()
        {
            Item item = current.item;
            current = current.next;
            return item;
        }

        public void remove(){}
    }

    public static void main(String[] args)
    {
        Bag<String> bag = new Bag<>();
        bag.add("a");
        bag.add("b");
        for (String s : bag)
        {
            System.out.print(s + " ");
        }
    }
}
