package codingbat.warmup2;

public class FrontTimes {
    public String frontTimes(String str, int n) {
    String front;

    // Если длина строки больше или равна 3, берем первые 3 символа
    if (str.length() >= 3) {
        front = str.substring(0, 3);
    } else {
        // Если строка короче 3 символов, берем всю строку
        front = str;
    }
    StringBuilder result = new StringBuilder();

    // Цикл для добавления front n раз
    for (int i = 0; i < n; i++) {
        result.append(front);
    }

    // Преобразуем StringBuilder в строку и возвращаем результат
    return result.toString();
}
}
