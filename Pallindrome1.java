import java.util.Scanner;

class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.nextLine();  // Read input as a string

        // Reverse the string and compare
        String rev = new StringBuilder(num).reverse().toString();

        if (num.equals(rev)) {
            System.out.println("Yes, it is a palindrome!");
        } else {
            System.out.println("No, it is not a palindrome.");
        }

        sc.close();
    }
}
