import java.util.List;
import java.util.stream.Collectors;

public class MinimizeStringLength {
    public int minimizedStringLength(String s) {

        List<Character> charList = s.chars()
                .mapToObj(c -> (char) c)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Список символов после удаления дубликатов: " + charList);
        int count = charList.size();
        System.out.println("Количество символов в строке после обработки = " + count);
        return count;
    }
}