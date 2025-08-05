public class pattern1 {
    public static void main(String[] args) {
        int n = 5; // You can change this value to generate a different pattern

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
