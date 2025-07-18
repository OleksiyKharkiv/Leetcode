import java.util.*;

public class All0TripletsInArr {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);  // Сортировка массива для упрощения дальнейшего перебора
        for (int i = 0; i < nums.length - 2; i++) {
            // Пропускаем одинаковые элементы для предотвращения дублирования
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    // Добавляем найденную тройку в Set (она уже будет уникальной)
                    set.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    // Пропускаем одинаковые элементы на левой и правой стороне
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        // Преобразуем Set в List и возвращаем
        return new ArrayList<>(set);
    }
}