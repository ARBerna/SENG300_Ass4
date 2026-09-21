import java.util.LinkedList;

public class Task8
{
    public static LinkedList<Integer> convert(int n)
    {
        LinkedList<Integer> list = new LinkedList<>();

        while(n > 0)
        {
            list.add(n % 10);
            n /= 10;
        }
        return list;
    }
}