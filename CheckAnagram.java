public class CheckAnagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        if(str1.toLowerCase()==str2.toLowerCase()) {
            System.out.println("Both strings are anagrams.");
        } else {
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            java.util.Arrays.sort(charArray1);
            java.util.Arrays.sort(charArray2);
            if(java.util.Arrays.equals(charArray1, charArray2)) {
                System.out.println("Both strings are anagrams.");
            } else {
                System.out.println("Both strings are not anagrams.");
            }
        }
    }
}
