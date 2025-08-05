public class CheckPerfectSquare {
    public static void main(String[] args) {
        int number = 16; 
        if (isPerfectSquare(number)) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }
    }

    public static boolean isPerfectSquare(int num) {
        if (num < 0) return false; 
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}