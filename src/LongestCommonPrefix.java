public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        // Проверка на случаи, когда массив строк пуст или равен null.
        // В таких случаях общий префикс невозможен, возвращаем пустую строку.
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Инициализация переменной prefix значением первой строки в массиве strs.
        String prefix = strs[0];

        // Цикл для перебора остальных строк в массиве strs (начиная со второй строки).
        for (int i = 1; i < strs.length; i++) {
            // Внутренний цикл выполняется, пока текущая строка strs[i]
            // не начинается с текущего префикса prefix.
            while (!strs[i].startsWith(prefix)) {
                // Уменьшаем префикс на один символ справа.
                prefix = prefix.substring(0, prefix.length() - 1);

                // Если префикс стал пустым, это значит, что нет общего префикса.
                // Возвращаем пустую строку.
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        // После прохода всех строк, возвращаем найденный общий префикс.
        return prefix;
    }
}