public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        // Вычисляем ожидаемую сумму чисел в диапазоне [0, n]
        int expectedSum = (n * (n + 1)) / 2;

        // Вычисляем фактическую сумму чисел в массиве
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        // Пропущенное число равно разности между ожидаемой суммой и фактической суммой
        int missingNumber = expectedSum - actualSum;
        return missingNumber;
    }
}