public class CountOne
{
    public static void main(String[] args)
    {
        int x = 0b1101101101;
        int count = 0;
        while (x != 0)
        {
            count += (x & 1);
            x = x >> 1;
        }
        System.out.print(count);
    }
}
