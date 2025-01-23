package FiveMinArrayMembers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class FiveMinArrMembers {
    public void fiveMinVal(int[] arr) throws CustomExceptions.ArrayIsNullExceptions, CustomExceptions.ArrayElementTypeException, CustomExceptions.ArraySizeException, CustomExceptions.InvalidElementValueException, CustomExceptions.DuplicateElementsException {
        if (arr == null) {
            throw new CustomExceptions.ArrayIsNullExceptions("Array is null");
        }
        if (arr.length < 5) {
            throw new CustomExceptions.ArraySizeException("Array has fewer then 5 elements");
        }
        for (int i : arr) {
            if (arr[i] != (int) arr[i]) {
                throw new CustomExceptions.ArrayElementTypeException("Array contains not integer values");
            }
            if (arr[i] == Integer.MAX_VALUE || arr[i] == Integer.MIN_VALUE) {
                throw new CustomExceptions.InvalidElementValueException("Array contains Integer MAX or MIN value");
            }
        }
        if (arr.length < 10000) {
            Arrays.sort(arr);
            for (int i = 0; i < 5; i++) {
                System.out.print("Min" + (i + 1) + " = " + arr[i] + " ");
            }
        }
        if (arr.length >= 10000) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.reverseOrder());
            for (int num : arr) {
                if (num <= minHeap.peek()) {
                    minHeap.add(num);
                    if (minHeap.size() > 5) {
                        minHeap.poll();
                    }
                }
            }
        }
    }
}
