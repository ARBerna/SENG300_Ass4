import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;

        System.out.println("\n=== Assignment Menu ===\n"
                            + "1 - Task 1: Stack Reverse\n"
                            + "2 - Task 2: Queue Order\n"
                            + "3 - Task 3: Test CharStack (Array List)\n"
                            + "4 - Task 4: Test CharStacklinked (LinkedList)\n"
                            + "5 - Task 5: Palindrome Check\n"
                            + "6 - Task 6: Test IntQueue\n"
                            + "7 - Task 7: Reverse Queue\n"
                            + "8 - Task 8: Digit -> LinkedList\n"
                            + "9 - Exit");
        
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();
        sc.nextLine();

        while(isRunning)
        {
            switch(choice)
            {
                case 1:
                    Task1.run();
                    isRunning = false;
                    break;
                case 2:
                    Task2.run();
                    isRunning = false;
                    break;
                case 3:
                    Task3 cs = new Task3();
                    cs.push('A');
                    cs.push('B');
                    cs.push('C');
                    System.out.println("Top: " + cs.top());
                    System.out.println("Pop: " + cs.pop());
                    System.out.println("Pop: " + cs.pop());
                    isRunning = false;
                    break;
                case 4:
                    Task4 cs2 = new Task4();
                    cs2.push('X');
                    cs2.push('Y');
                    cs2.push('Z');
                    System.out.println("Top: " + cs2.top());
                    System.out.println("Pop: " + cs2.pop());
                    System.out.println("Pop: " + cs2.pop());
                    isRunning = false;
                    break;
                case 5:
                    System.out.print("Enter a word: ");
                    String word = sc.nextLine();
                    System.out.println("Palindrome? " + Task5.isPalindrome(word));
                    isRunning = false;
                    break;
                case 6:
                    Task6 q = new Task6(5);
                    q.enqueue(10);
                    q.enqueue(20);
                    q.enqueue(30);
                    System.out.println("Dequeued: " + q.dequeue());
                    System.out.println("Dequeued: " + q.dequeue());
                    isRunning = false;
                    break;
                case 7:
                    Queue<Integer> q2 = new LinkedList<>();
                    q2.add(1);
                    q2.add(2);
                    q2.add(3);
                    q2.add(4);
                    System.out.println("Original queue: " + q2);
                    Task7.reverse(q2);
                    System.out.println("Reversed queue: " + q2);
                    isRunning = false;
                    break;
                case 8:
                    System.out.print("Enter a number: ");
                    int n = sc.nextInt();
                    System.out.println("Digit list: " + Task8.convert(n));
                    isRunning = false;
                    break;
                case 9:
                    System.out.println("Goodbye!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("That is not an option, try again.");
            }
        }
    }
}