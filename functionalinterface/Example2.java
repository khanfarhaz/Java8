package functionalinterface;
import java.util.function.IntBinaryOperator;


public class Example2 {

   public static void main(String args[]) {
        
        IntBinaryOperator sum = (a, b) -> a + b;
        System.out.println("Result: " + sum.applyAsInt(12, 100));

    }
}
