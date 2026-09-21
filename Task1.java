import java.util.Scanner;
import java.util.Stack;

//print in reverse
public class Task1
{
    public static void run()
    {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.println("Enter numbers (-1 to stop):");
        int num;
        while((num = sc.nextInt()) != -1)
        {
            stack.push(num);
        }

        System.out.println("Reverse order:");
        while(!stack.isEmpty())
        {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}