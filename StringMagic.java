import java.util.Scanner;

class StrinngMagic {

    // Method to reverse a string
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Method to check if a string is palindrome
    public static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("\\s+", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    // Method to extract substring
    public static String substringExtract(String str, int start, int end) {
        if (start < 0 || end > str.length() || start >= end) {
            return "Invalid indices!";
        }
        return str.substring(start, end);
    }

    // Method to find a substring
    public static int findSubstring(String str, String sub) {
        return str.indexOf(sub);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Reverse the string");
            System.out.println("2. Convert to lowercase");
            System.out.println("3. Convert to uppercase");
            System.out.println("4. Check if palindrome");
            System.out.println("5. Extract substring");
            System.out.println("6. Find substring position");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume the newline

            switch (choice) {
                case 1:
                    System.out.println("Reversed string: " + reverseString(input));
                    break;
                case 2:
                    System.out.println("Lowercase string: " + input.toLowerCase());
                    break;
                case 3:
                    System.out.println("Uppercase string: " + input.toUpperCase());
                    break;
                case 4:
                    System.out.println(isPalindrome(input) ? "Yes, it is a palindrome!" : "No, it is not a palindrome.");
                    break;
                case 5:
                    System.out.print("Enter start index: ");
                    int start = sc.nextInt();
                    System.out.print("Enter end index: ");
                    int end = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Substring: " + substringExtract(input, start, end));
                    break;
                case 6:
                    System.out.print("Enter substring to find: ");
                    String sub = sc.nextLine();
                    int pos = findSubstring(input, sub);
                    if (pos == -1) {
                        System.out.println("Substring not found!");
                    } else {
                        System.out.println("Substring found at index: " + pos);
                    }
                    break;
                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
