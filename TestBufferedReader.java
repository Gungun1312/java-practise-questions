import java.io.*;

public class TestBufferedReader {
    // public static void main(String args[]) throws IOException {
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // System.out.println("Enter your name:");
    // String name = br.readLine();
    // System.out.println("hello " + name);




    // public static void main(String args[] ) throws IOException{
    //     int a,b,sum;
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     System.out.println("Enter the first number");
    //     a =Integer.parseInt(br.readLine());
    //     System.out.println("Enter second number");
    //     b = Integer.parseInt(br.readLine());
    //     sum = a+b;
    //     System.out.println("Sum of "+ a +" and "+ b+" is: " + sum);
    // }


    //Multiline  input using bufferedReader
    public static void main( String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter test(type 'exit' to quit):");
        String line;
        while(!(line = br.readLine()).equalsIgnoreCase("exit")){
            System.out.println( "you entered: " + line);
        }
    }
}

