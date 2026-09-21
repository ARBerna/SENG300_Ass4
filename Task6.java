public class Task6
{
    private int[] data;
    private int front;
    private int rear;
    private int size;

    public Task6(int capacity)
    {
        data = new int[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public boolean isFull()
    {
        return size == data.length;
    }

    public void enqueue(int x)
    {
        if(isFull())
        {
            System.out.println("Queue is full!");
            return;
        }
        data[rear] = x;
        rear = (rear + 1) % data.length;
        size++;
    }

    public int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty!");
            return -1;
        }
        int value = data[front];
        front = (front + 1) % data.length;
        size--;
        return value;
    }
}