import java.util.Queue;
import java.util.Stack;

public class Task7
{
    public static void reverse(Queue<Integer> q)
    {
        Stack<Integer> s = new Stack<>();

        while(!q.isEmpty())
        {
            s.push(q.remove());
        }

        while(!s.isEmpty())
        {
            q.add(s.pop());
        }
    }
}