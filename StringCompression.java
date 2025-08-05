
public class StringCompression {
    public static String compressString(String str) {
    String newStr = "";
    int count = 1;

    for (int i = 0; i < str.length(); i++) {
        // Check if next character is same
        while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
            count++;
            i++;
        }
        newStr += str.charAt(i);
        if (count > 1) {
            newStr += Integer.toString(count);
            count = 1; // Reset count for next sequence
        }
    }
    return newStr;
}

    public static void main(String[] args) {
        String str = "abc"; // Example string
        String compressedStr = compressString(str);
        System.out.println("Compressed String: " + compressedStr);
    }
}