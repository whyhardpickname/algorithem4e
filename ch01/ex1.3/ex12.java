public class ex12
{
    public static void main(String[] args)
    {
        ListStack<String> listStack = new ListStack<>();
        listStack.push("a");
        listStack.push("b");
        listStack.push("c");
        ListStack<String> stack = copy(listStack);

        for (String s : stack)
        {
            System.out.println(s);
        }

    }

    public static ListStack<String> copy(ListStack<String> listStack)
    {
        ListStack<String> temp = new ListStack<>();
        for (String s : listStack)
        {
            temp.push(listStack.pop());
        }

        ListStack<String> newListStack = new ListStack<>();
        for (String s : temp)
        {
            newListStack.push(temp.pop());
        }
        return newListStack;
    }
}
