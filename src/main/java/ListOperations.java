import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListOperations {

    /**
     * Measures the time taken to iterate over a list using a for-each loop.
     * @param list The list to be iterated over.
     * @return The time taken in milliseconds.
     */
    public long measureForEachLoop(List<Integer> list) {
        Timer timer = new Timer();
        timer.start();

        for (Integer item : list) {
            int temp = item;
        }

        timer.stop();
        return timer.getElapsedTime();
    }

    /**
     * Measures the time taken to iterate over a list using a classic for loop
     * where list.size() is called in each iteration.
     * @param list The list to be iterated over.
     * @return The time taken in milliseconds.
     */
    public long measureClassicForLoopWithSizeCall(List<Integer> list) {
        Timer timer = new Timer();
        timer.start();

        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
        }

        timer.stop();
        return timer.getElapsedTime();
    }

    /**
     * Measures the time taken to iterate over a list using a classic for loop
     * where list.size() is stored in a variable before the loop.
     * @param list The list to be iterated over.
     * @return The time taken in milliseconds.
     */
    public long measureClassicForLoopWithSizeInVariable(List<Integer> list) {
        Timer timer = new Timer();
        timer.start();

        int size = list.size();
        for (int i = 0; i < size; i++) {
            int temp = list.get(i);
        }

        timer.stop();
        return timer.getElapsedTime();
    }

    /**
     * Measures the time taken to iterate over a list in reverse order using a classic for loop.
     * @param list The list to be iterated over.
     * @return The time taken in milliseconds.
     */
    public long measureClassicForLoopReverse(List<Integer> list) {
        Timer timer = new Timer();
        timer.start();

        int size = list.size();
        for (int i = size - 1; i >= 0; i--) {
            int temp = list.get(i);
        }

        timer.stop();
        return timer.getElapsedTime();
    }

    /**
     * Measures the time taken to iterate over a list using an Iterator.
     * @param list The list to be iterated over.
     * @return The time taken in milliseconds.
     */
    public long measureIterator(List<Integer> list) {
        Timer timer = new Timer();
        timer.start();

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int temp = iterator.next();
        }

        timer.stop();
        return timer.getElapsedTime();
    }

    /**
     * Measures the time taken to iterate over a list using a ListIterator.
     * @param list The list to be iterated over.
     * @return The time taken in milliseconds.
     */
    public long measureListIterator(List<Integer> list) {
        Timer timer = new Timer();
        timer.start();

        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            int temp = listIterator.next();
        }

        timer.stop();
        return timer.getElapsedTime();
    }
}
