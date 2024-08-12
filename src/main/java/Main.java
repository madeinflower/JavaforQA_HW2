import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // I create a list and fill it with 10 million elements
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            list.add(i);
        }

        // I measure the execution time of various operations on the list.
        ListOperations operations = new ListOperations();

        System.out.println("For-each loop: " + operations.measureForEachLoop(list) + " ms");
        System.out.println("Classic for loop (size() in each iteration): " + operations.measureClassicForLoopWithSizeCall(list) + " ms");
        System.out.println("Classic for loop (size() in variable): " + operations.measureClassicForLoopWithSizeInVariable(list) + " ms");
        System.out.println("Classic for loop (reverse iteration): " + operations.measureClassicForLoopReverse(list) + " ms");
        System.out.println("Iterator: " + operations.measureIterator(list) + " ms");
        System.out.println("ListIterator: " + operations.measureListIterator(list) + " ms");
    }
}
