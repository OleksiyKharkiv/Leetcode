import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Создаем отображение для подсчета количества элементов в nums1
        Map<Integer, Integer> countMap = new HashMap<>();

        // Подсчитываем количество каждого элемента в nums1
        for (int num : nums1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> intersection = new ArrayList<>();

        // Проверяем каждый элемент в nums2
        // Если элемент присутствует в отображении и его счетчик больше 0,
        // добавляем его в результат и уменьшаем счетчик
        for (int num : nums2) {
            if (countMap.containsKey(num) && countMap.get(num) > 0) {
                intersection.add(num);
                countMap.put(num, countMap.get(num) - 1);
            }
        }

        // Копируем элементы из списка в результирующий массив
        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }
        return result;
    }
}