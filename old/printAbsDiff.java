package old;
public class printAbsDiff {
    public static void main(String args[]) {
        int l = 100, r = 200;
        int n1 = 0, n2 = 0;

        for (int i = l; i <= r; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                n1 = i;
                break;
            }
        }

        for (int i = r; i >= l; i--) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                n2 = i;
                break;
            }
        }

        System.out.println("The absolute value between the highest and lowest prime number between 100 and 200 is " + Math.abs(n2 - n1));
    }
}



