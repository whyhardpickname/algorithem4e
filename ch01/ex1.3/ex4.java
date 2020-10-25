import edu.princeton.cs.algs4.StdIn;

/**
 * @author MarkChern
 * date 2020/10/24 17:13
 */
public class ex4
{
    public static void main(String[] args)
    {
        ListStack<Character> myStack = new ListStack<>();
        String s = StdIn.readString();
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (Character.compare(c, '(') == 0
                    | Character.compare(c, '[') == 0
                    | Character.compare(c, '{') == 0)
            {
                myStack.push(c);
            }
            else
            {
                if (!myStack.isEmpty())
                {
                    myStack.pop();
                }
            }
        }

        System.out.print(myStack.isEmpty());
    }
}
