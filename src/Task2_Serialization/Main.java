package Task2_Serialization;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Головний клас програми.
 * Демонструє роботу перетворення та серіалізації.
 *
 */
public class Main {
    /** Об'єкт для виконання обчислень */
    private ConverterCalc calc = new ConverterCalc();
    /**
     * Меню програми
     */
    private void menu() {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        String command;
        do {
            System.out.println("\nКоманди:");
            System.out.println("g - ввести число");
            System.out.println("v - переглянути результат");
            System.out.println("s - зберегти");
            System.out.println("r - відновити");
            System.out.println("q - вихід");
            System.out.print("Введіть команду: ");
            try {
                command = reader.readLine();
            } catch (IOException e) {
                System.out.println("Помилка вводу!");
                return;
            }
            switch (command) {
                case "g":
                    try {
                        System.out.print("Введіть ціле число: ");
                        int number = Integer.parseInt(reader.readLine());
                        calc.convert(number);
                        System.out.println("Перетворення виконано.");
                    } catch (Exception e) {
                        System.out.println("Невірне число!");
                    }
                    break;

                case "v":
                    System.out.println(calc.getData());
                    break;

                case "s":
                    try {
                        calc.save();
                        System.out.println("Збережено.");
                    } catch (IOException e) {
                        System.out.println("Помилка серіалізації!");
                    }
                    break;

                case "r":
                    try {
                        calc.restore();
                        System.out.println("Відновлено.");
                    } catch (Exception e) {
                        System.out.println("Помилка відновлення!");
                    }
                    break;

                case "q":
                    System.out.println("Вихід...");
                    break;

                default:
                    System.out.println("Невідома команда!");
            }

        } while (!command.equals("q"));
    }
    /**
     * Точка входу в програму
     */
    public static void main(String[] args) {
        Main main = new Main();
        main.menu();
    }
}