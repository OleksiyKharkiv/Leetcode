package FiveMinArrayMembers;

import java.util.Arrays;
import java.util.PriorityQueue;

public class FiveMinArrMembers {

    public static void main(String[] args) {
        int[] testArr = {-230000000, 2, 5, 1, 44, 4, 10, -1};

        try {
            int[] result = fiveMinVal(testArr);
            System.out.println("Result: " + Arrays.toString(result));
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static int[] fiveMinVal(int[] arr) throws CustomExceptions.ArrayIsNullException,
            CustomExceptions.InvalidElementValueException,
            CustomExceptions.ArraySizeException {
        validateArray(arr);

        int resultSize = Math.min(arr.length, 5);
        int[] result = new int[resultSize];

        if (arr.length < 10000) {
            Arrays.sort(arr);
            System.arraycopy(arr, 0, result, 0, resultSize);
        } else {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>(5, (a, b) -> Integer.compare(b, a));

            for (int num : arr) {
                minHeap.add(num);
                if (minHeap.size() > 5) {
                    minHeap.poll();
                }
            }

            for (int i = resultSize - 1; i >= 0; i--) {
                result[i] = minHeap.poll();
            }
        }

        return result;
    }

    private static void validateArray(int[] arr) throws CustomExceptions.ArrayIsNullException,
            CustomExceptions.InvalidElementValueException,
            CustomExceptions.ArraySizeException {
        if (arr == null) {
            throw new CustomExceptions.ArrayIsNullException();
        }

        for (int num : arr) {
            if (num == Integer.MAX_VALUE || num == Integer.MIN_VALUE) {
                throw new CustomExceptions.InvalidElementValueException();
            }
        }

        if (arr.length < 5) {
            throw new CustomExceptions.ArraySizeException();
        }
    }
}