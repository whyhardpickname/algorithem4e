public class ResizingArrayQueueOfStrings
{
    private String[] strings;
    private int n;
    private int first;
    private int last;

    public ResizingArrayQueueOfStrings()
    {
        strings = new String[2];
        n = 0;
    }

    private void lengthen(int max)
    {
        String[] temp = new String[max];
        for (int i= 0; i < strings.length; i++)
        {
            temp[i] = strings[i];
        }
        strings = temp;
    }

    private void shorten(int min)
    {
        String[] temp = new String[min];
        for (int i= 0; i < last; i++)
        {
            temp[i] = strings[i + first];
        }
        strings = temp;
    }

    public void enqueue(String s)
    {
        if (n == strings.length)
        {
            resize(2 * strings.length);
        }
        strings[n++] = s;
    }

    public String dequeue()
    {
        String temp = strings[]
    }
}
