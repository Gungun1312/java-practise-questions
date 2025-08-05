import java.util.function.Function;

public class FunctionAsArgument {
        public static void applyFunction(Function<Integer, Integer> func, int value) {
        int result = func.apply(value);
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        applyFunction(x -> x * x, 5);  
        applyFunction(x -> x + 10, 7); 
    }
}
