public class MaxOfThree {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 15; // Example values
        int max = maxOfThree(a, b, c);
        System.out.println("The maximum of " + a + ", " + b + ", and " + c + " is: " + max);
    }

    public static int maxOfThree(int x, int y, int z) {
        return Math.max(x, Math.max(y, z));
    }   
}
