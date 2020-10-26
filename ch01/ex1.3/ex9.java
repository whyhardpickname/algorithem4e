public class ex9
{
    public static void main(String[] args)
    {
        String expresstion = "1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )";
        System.out.println(parenthesesCompletion(expresstion));
    }

    public static String parenthesesCompletion(String s)
    {
        ListStack<String> operands = new ListStack<>();
        ListStack<String> operators = new ListStack<>();

        int i = 0;
        while (i < s.length())
        {
            if (Character.compare(s.charAt(i), ')') == 0)
            {
                String temp = operands.pop();
                operands.push("("
                        + operands.pop()
                        + " "
                        + operators.pop()
                        + " "
                        + temp
                        + ")");
            } else if (Character.isDigit(s.charAt(i)))
            {
                operands.push(String.valueOf(s.charAt(i)));
            } else if (Character.compare(s.charAt(i), '+') == 0
                    || Character.compare(s.charAt(i), '-') == 0
                    || Character.compare(s.charAt(i), '*') == 0
                    || Character.compare(s.charAt(i), '/') == 0)
            {
                operators.push(String.valueOf(s.charAt(i)));
            }
            i++;
        }

        return operands.pop();
    }
}
