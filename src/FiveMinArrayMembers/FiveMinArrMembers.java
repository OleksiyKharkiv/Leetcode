package FiveMinArrayMembers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class FiveMinArrMembers {

    public static void main(String[] args) {
        int[] testArr = {-230000000, 2, 5, 1, 44, 4, 10, -1};

        try {
            int[] res = fiveMinVal(testArr);
            System.out.println("\nResult: " + Arrays.toString(res));
        } catch (CustomExceptions.ArrayIsNullExceptions | CustomExceptions.ArrayElementTypeException |
                 CustomExceptions.InvalidElementValueException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static int[] fiveMinVal(int[] arr) throws CustomExceptions.ArrayIsNullExceptions, CustomExceptions.ArrayElementTypeException, CustomExceptions.InvalidElementValueException {
        if (arr == null) {
            throw new CustomExceptions.ArrayIsNullExceptions("Array is null");
        }

        for (int num : arr) {
            if (num == Integer.MAX_VALUE || num == Integer.MIN_VALUE) {
                throw new CustomExceptions.InvalidElementValueException("Array contains Integer.MAX_VALUE or Integer.MIN_VALUE");
            }
        }

        int[] result = new int[Math.min(arr.length, 5)];
        boolean isSizeExceptionCaught = false;
        boolean isDuplicatesExceptionCaught = false;

        try {
            if (arr.length < 5) {
                throw new CustomExceptions.ArraySizeException("Array has fewer than 5 elements");
            }

            if (arr.length < 10000) {
                Arrays.sort(arr);
                System.arraycopy(arr, 0, result, 0, result.length);
            } else {
                PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.reverseOrder());
                for (int num : arr) {
                    minHeap.add(num);
                    if (minHeap.size() > 5) {
                        minHeap.poll();
                    }
                }
                for (int i = result.length - 1; i >= 0; i--) {
                    result[i] = minHeap.poll();
                }
            }
        } catch (CustomExceptions.ArraySizeException e) {
            System.err.println("Warning: " + e.getMessage());
            isSizeExceptionCaught = true;
            Arrays.sort(arr); // Для случаев, когда элементов меньше 5
            System.arraycopy(arr, 0, result, 0, result.length);
        }

        try {
            if (hasDuplicates(result)) {
                throw new CustomExceptions.DuplicateElementsException("Array has duplicated members");
            }
        } catch (CustomExceptions.DuplicateElementsException e) {
            System.err.println("Warning: " + e.getMessage());
            isDuplicatesExceptionCaught = true;
        }

        if (isSizeExceptionCaught) {
            System.err.println("Result includes fewer than 5 elements.");
        }
        if (isDuplicatesExceptionCaught) {
            System.err.println("Result includes duplicates.");
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print("Min" + (i + 1) + " = " + result[i] + " ");
        }
        return result;
    }

    private static boolean hasDuplicates(int[] arr) {
        Arrays.sort(arr); // Ensure the array is sorted for comparison
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                return true;
            }
        }
        return false;
    }
}
