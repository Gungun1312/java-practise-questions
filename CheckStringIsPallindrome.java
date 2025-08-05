public class CheckStringIsPallindrome {
    public static void main(String[] args) {
        String str = "madam";
        String reversedStr = new StringBuilder(str).reverse().toString();

        if (str.equals(reversedStr)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
