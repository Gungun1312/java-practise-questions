// Java program to check if a number is Palindrome
// using command line arguments

class GFG {

    // Function to reverse the number
    public static int reverseNumber(int num)
    {

        // Variable to store the
        // resultant reverse number
        int rev_num = 0;

        // Traverse through the number digit by digit
        while (num > 0) {

            // Append the last digit of num
            // as the next digit of rev_num
            rev_num = rev_num * 10 + num % 10;

            // Remove the last digit from the num
            num = num / 10;
        }

        // Return the reversed number
        return rev_num;
    }

    // Function to reverse a string
    public static int isPalindrome(int num)
    {
        int rev_num = reverseNumber(num);

        if (num == rev_num)
            return 1;
        else
            return 0;
    }

    // Driver code
    public static void main(String[] args)
    {

        // Check if length of args array is
        // greater than 0
        if (args.length > 0) {

            // Get the command line argument and
            // Convert it from string type to integer type
            int num = Integer.parseInt(args[0]);

            // Get the command line argument
            // and check if it is Palindrome
            int res = isPalindrome(num);

            // Check if res is 0 or 1
            if (res == 0)
                // Print No
                System.out.println("No\n");
            else
                // Print Yes
                System.out.println("Yes\n");
        }
        else
            System.out.println("No command line "
                               + "arguments found.");
    }
}