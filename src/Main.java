import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String multiWordString = "Это строка из нескольких слов";

        final int num = 42;

        String word = "Пример";

        String result = num + word;

        System.out.println("Значение multiWordString: " + multiWordString);
        System.out.println("Значение num: " + num);
        System.out.println("Значение word: " + word);
        System.out.println("Результат конкатенации num и word: " + result);

        if (num < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (num > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили нуль");
        }

        System.out.println("Введите ваше имя:");
        Scanner scanner = new Scanner(System.in);
        String use = scanner.nextLine();
        System.out.println("Привет, " + use + "!");

        System.out.println("Введите ваше фамилию:");
        Scanner scanner1 = new Scanner(System.in);
        String user = scanner1.nextLine();
        System.out.println("Wellcom " + use + " " + user + "!");

    }
}
