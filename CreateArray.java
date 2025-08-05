package old;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreateArray {
    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(reader.readLine());
        String[] arrInput = reader.readLine().split(" ");
        
        int[] nos = new int[n];
        for (int i = 0; i < n; i++) {
            nos[i] = Integer.parseInt(arrInput[i]);
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(nos[i] + " ");
        }
    }
}
