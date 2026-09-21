import java.util.Scanner;

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
                default:
                    System.out.println("That is not an option, try again.");
            }
        }
    }
}