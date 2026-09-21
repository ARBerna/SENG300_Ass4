import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Task2
{
    public static void run()
    {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        System.out.println("Enter numbers (-1 to stop):");
        int num;
        while((num = sc.nextInt()) != -1)
        {
            queue.add(num);
        }

        System.out.println("Original order:");
        while(!queue.isEmpty())
        {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }
}