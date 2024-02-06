public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder(); // Используем StringBuilder для эффективной работы со строками

        int i = a.length() - 1; // Индекс для строки a
        int j = b.length() - 1; // Индекс для строки b
        int carry = 0; // Переменная для хранения переноса

        // Пока есть символы в строках a или b, или есть перенос
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry; // Сумма текущих символов из a, b и переноса

            // Если есть символ в строке a, добавляем его код символа - код символа '0'
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            //  Если есть символ в строке b, добавляем его код символа - код символа '0'
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }

            // Добавляем в результат текущий бит с учетом переноса
            result.insert(0, sum % 2);

            // Вычисляем перенос для следующего бита
            carry = sum / 2;
        }
        return result.toString(); // Возвращаем результат в виде строки
    }
}