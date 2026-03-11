package Task2_Serialization;
/**
 * Клас для тестування коректності обчислень
 * та серіалізації/десеріалізації.
 */
public class TestCalc {
    public static void main(String[] args) {
        ConverterCalc calc = new ConverterCalc();
        try {
            // тест обчислення
            calc.convert(10);
            System.out.println("Тест обчислення:");
            System.out.println(calc.getData());
            // тест збереження
            calc.save();
            System.out.println("Збереження успішне.");
            // тест відновлення
            calc.restore();
            System.out.println("Відновлення успішне.");
            System.out.println(calc.getData());
        } catch (Exception e) {
            System.out.println("ПОМИЛКА ТЕСТУВАННЯ");
            e.printStackTrace();
        }
    }
}