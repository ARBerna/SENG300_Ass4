import java.util.ArrayList;

public class Task3
{
    private ArrayList<Character> data;
    private int top;

    public Task3()
    {
        data = new ArrayList<>();
        top = -1;
    }

    public void push(Character x)
    {
        data.add(x);
        top++;
    }

    public Character pop()
    {
        if(isEmpty())
        {
            return null;
        }
        return data.remove(top--);
    }

    public Character top()
    {
        if(isEmpty())
        {
            return null;
        }
        return data.get(top);
    }

    public boolean isEmpty()
    {
        return top == 1;
    }
}