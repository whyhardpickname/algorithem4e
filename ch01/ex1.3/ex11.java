public class ex11
{
    public static void main(String[] args)
    {
        String s = "1 2 +  3 4 -  5 6 -  *  * ";
        System.out.println(evaluatePostfix(s));
    }

    public static double evaluatePostfix(String s)
    {
        ListStack<Double> operands = new ListStack<>();
        String[] postfix = s.split("\\s+");
        int i = 0;
        while (i < postfix.length)
        {
            if (postfix[i].compareTo("+") == 0)
            {
                operands.push(operands.pop() +
                        operands.pop());
            }
            else if (postfix[i].compareTo("-") == 0)
            {
                operands.push(operands.pop() -
                        operands.pop());
            }
            else if (postfix[i].compareTo("*") == 0)
            {
                operands.push(operands.pop() *
                        operands.pop());
            }
            else if (postfix[i].compareTo("/") == 0)
            {
                operands.push(1 / operands.pop() *
                        operands.pop());
            }
            else
            {
                operands.push(Double.parseDouble(postfix[i]));
            }
            i++;
        }
        return operands.pop();
    }
}
