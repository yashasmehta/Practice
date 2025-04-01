package collections;

import java.util.*;

public class NumericalBlockIterator implements Iterator<List<Integer>> {

    private Iterator<Integer> inputIterator;
    private Integer blockLimit;

    public NumericalBlockIterator(Iterator<Integer> inputIterator, Integer blockLimit) {
        // TODO
        this.inputIterator = inputIterator;
        this.blockLimit = blockLimit;
    }

    /**
     * If this iterator has more elements in it, return true without advancing
     * the internal iterator pointer.
     * Otherwise return false.
     */
    @Override
    public boolean hasNext() {
        // TODO
        if(inputIterator.hasNext()) {
            return blockLimit != 0;
        }

        return false;
    }

    /**
     * Return the next block. If no more block exists, throw
     * {@link NoSuchElementException}.
     */
    @Override
    public List<Integer> next() {
        // TODO
        if(!hasNext()) {
            throw new NoSuchElementException();
        }

        List<Integer> result = new ArrayList<>();
        int sum = 0;

        if(blockLimit == 0) {
            result.add(inputIterator.next());
            return result;
        }

        while(hasNext()) {
            Integer nextElement = inputIterator.next();

            if(Objects.equals(nextElement, blockLimit) && result.isEmpty()) {
                result.add(nextElement);
                return result;
            }

            if(nextElement <= blockLimit) {
                sum += nextElement;

                if(sum > blockLimit) {
                    return result;
                } else {
                    result.add(nextElement);
                }
            } else {
                if(!result.isEmpty()) {
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Integer[] arr = {5, 1, 2, 1, -1, 0, 1, 10, 4, 1, 2};
        List<Integer> input = Arrays.asList(arr);
        Iterator<Integer> iterator = input.iterator();
        NumericalBlockIterator obj = new NumericalBlockIterator(iterator, 4);
        System.out.println(obj.next());
        System.out.println(obj.next());
        System.out.println(obj.next());
    }
}
