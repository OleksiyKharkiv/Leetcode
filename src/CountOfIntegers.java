public class CountOfIntegers {
    public int countGoodIntegers(String num1, String num2, int min_sum, int max_sum) {
        int MOD = 1000000007;

        // Преобразуем строковые числа в числовой формат
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);

        int count = 0;

        // Перебираем все числа от n1 до n2
        for (int num = n1; num <= n2; num++) {
            int digitSum = calculateDigitSum(num);

            // Проверяем, выполняются ли условия min_sum <= digitSum <= max_sum
            if (digitSum >= min_sum && digitSum <= max_sum) {
                count++;
                count %= MOD; // Применяем модуло для избегания переполнения
            }
        }

        return count;
    }

    // Метод для вычисления суммы цифр числа
    private int calculateDigitSum(int num) {
        int sum = 0;

        // Извлекаем каждую цифру числа и добавляем её к сумме
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}