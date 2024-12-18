import java.util.Scanner;

public class MyStringAnalyzer {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введи строку:");
            String input = scanner.nextLine();

            int vowelsCount = 0; // Количество гласных букв
            int consonantsCount = 0; // Количество согласных букв
            int digitsCount = 0; // Количество цифр

            // Приводим строку к нижнему регистру для упрощения проверки
            input = input.toLowerCase();

            // Проходим по каждому символу строки
            for (char ch : input.toCharArray()) {
                if (Character.isLetter(ch)) { // Проверяем, является ли символ буквой
                    if (isVowel(ch)) {
                        vowelsCount++;
                    } else {
                        consonantsCount++;
                    }
                } else if (Character.isDigit(ch)) { // Проверяем, является ли символ цифрой
                    digitsCount++;
                }
            }

            // Выводим результаты
            System.out.println("Количество гласных букв: " + vowelsCount);
            System.out.println("Количество согласных букв: " + consonantsCount);
            System.out.println("Количество цифр: " + digitsCount);

            scanner.close();
        }

        // Метод для проверки, является ли символ гласной буквой
        public static boolean isVowel(char ch) {
            return "aeiouаеёиоуыэюя".indexOf(ch) != -1;
        }
}
