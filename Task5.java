public class Task5
{
    public static boolean isPalindrome(String s)
    {
        Task3 stack = new Task3();

        String cleaned = s.replaceAll("[^A-Za-z]", "").toLowerCase();

        for(char c : cleaned.toCharArray())
        {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while(!stack.isEmpty())
        {
            reversed.append(stack.pop());
        }

        return cleaned.equals(reversed.toString());
    }
}