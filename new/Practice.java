import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if (n1 >= n2 && n1 >= n3) {
            System.out.println(n1 + " is largest");
            if (n2 >= n3) {
                System.out.println(n2 + " is second largest");
                System.out.println(n3 + " is smallest");
            } else {
                System.out.println(n3 + " is second largest");
                System.out.println(n2 + " is smallest");
            }
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println(n2 + " is largest");
            if (n1 >= n3) {
                System.out.println(n1 + " is second largest");
                System.out.println(n3 + " is smallest");
            } else {
                System.out.println(n3 + " is second largest");
                System.out.println(n1 + " is smallest");
            }
        } else {
            System.out.println(n3 + " is largest");
            if (n1 >= n2) {
                System.out.println(n1 + " is second largest");
                System.out.println(n2 + " is smallest");
            } else {
                System.out.println(n2 + " is second largest");
                System.out.println(n1 + " is smallest");
            }
        }

        
    }
}
