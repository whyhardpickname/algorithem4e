import java.util.Scanner;

public class ex15
{
    public static void main(String[] args)
    {
        Queue<String> queue = new Queue<>();
        Scanner in = new Scanner(System.in);
        String s = "";
        while ("#".compareTo(s) != 0)
        {
            s = in.next();
            if ("#".compareTo(s) != 0)
            {
                queue.enqueue(s);
            }
        }
        int k = Integer.parseInt(args[0]);
        int len = queue.size();
        for (int i = 0; i < len - k; i++)
        {
            queue.dequeue();
        }
        System.out.println(queue.dequeue());
    }
}
