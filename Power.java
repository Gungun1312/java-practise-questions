import java.util.*;
public class Power {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();
        
        long result = power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
    public static int power(int base , int exponent){
        if (exponent == 0) {
            return 1; 
        }
        if (exponent < 0) {
            return -1; 
        }
        int halfPower = power(base, exponent / 2);
        if (exponent % 2 == 0) {
            return halfPower * halfPower; 
        } else {
            return base * halfPower * halfPower; 
        }
    }
    
}
