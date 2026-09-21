import java.util.LinkedList;

public class Task4
{
    private LinkedList<Character> data;

    public Task4()
    {
        data = new LinkedList<>();
    }

    public void push(Character x)
    {
        data.addLast(x);
    }

    public Character pop()
    {
        if(isEmpty())
        {
            return null;
        }
        return data.removeLast();
    }

    public Character top()
    {
        if(isEmpty())
        {
            return null;
        }
        return data.getLast();
    }

    public boolean isEmpty()
    {
        return data.isEmpty();
    }
}