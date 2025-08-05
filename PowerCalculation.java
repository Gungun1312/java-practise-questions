import java.util.Scanner;
public class PowerCalculation {
    public static void main(String[] args) {
        System.out.println("enter a base number:");
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        System.out.println("enter a power number:");
        int power = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= base;
        }
        System.out.println(base + " raised to the power of " + power + " is: " + result);
    }
}