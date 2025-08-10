import java.util.*;
public class SmallestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int smallest = findSmallest(arr, n);
        System.out.println("The smallest element in the array is: " + smallest);   
        }
    public static int findSmallest(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        int smallest = findSmallest(arr, n - 1);
        return Math.min(smallest, arr[n - 1]);
    }
}