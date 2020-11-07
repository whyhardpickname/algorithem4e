import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import javax.sound.midi.Soundbank;

/**
 * @author MarkChern
 * date 2020/11/7 16:17
 */
public class ResizingArrayQueueOfStrings
{
    private int n = 0;
    private String[] strings = new String[1];
    private int first = 0;
    private int last = 0;

    public ResizingArrayQueueOfStrings(){}

    public boolean isEmpty()
    {
        return n == 0;
    }

    public int size()
    {
        return n;
    }

    public void enqueue(String s)
    {
        if (last == strings.length)
        {
            if (n < s.length() / 2)
            {
                inPlaceRearrange();
            }
            else
            {
                resize(strings.length * 2);
            }
        }
        strings[last++] = s;
        n++;
    }

    public String dequeue()
    {
        if (n == strings.length / 4)
        {
            resize(strings.length / 2);
        }
        String temp = strings[first];
        strings[first++] = null;
        n--;
        return temp;
    }

    private void resize(int len)
    {
        String[] temp = new String[len];
        for (int i = first; i < last; i++)
        {
            temp[i - first] = strings[i];
        }
        strings = temp;
        last -= first;
        first = 0;
    }
    private void inPlaceRearrange()
    {
        for (int i = first; i < last; i++)
        {
            strings[i - first] = strings[i];
        }
        last -= first;
        first = 0;

    }

    public static void main(String[] args)
    {
        ResizingArrayQueueOfStrings s;
        s = new ResizingArrayQueueOfStrings();
        while (!StdIn.isEmpty())
        {
            System.out.println(s.n * 1.0 / s.strings.length * 100.0 + "%");
            String item = StdIn.readString();
            if (!item.equals("-"))
            {
                s.enqueue(item);
            } else if (!s.isEmpty())
            {
                StdOut.print(s.dequeue() + " ");
            }
        }
    }
}
