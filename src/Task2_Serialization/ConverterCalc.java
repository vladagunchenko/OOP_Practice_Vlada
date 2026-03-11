package Task2_Serialization;
import java.io.*;
/**
 * Клас виконує перетворення числа
 * та працює з серіалізацією.
 * Використовує агрегування — містить об'єкт NumberData.
 *
 */
public class ConverterCalc {
    /** Ім'я файлу для серіалізації */
    private static final String FILE_NAME = "numberData.bin";
    /** Об'єкт, що зберігає дані (агрегування) */
    private NumberData data;
    /**
     * Конструктор
     */
    public ConverterCalc() {
        data = new NumberData();
    }
    /**
     * Виконує перетворення числа
     */
    public void convert(int number) {
        data.setNumber(number);
        data.setBinary(Integer.toBinaryString(number));
        data.setOctal(Integer.toOctalString(number));
        data.setHex(Integer.toHexString(number));
    }

    /**
     * Повертає результат
     */
    public NumberData getData() {
        return data;
    }
    /**
     * Збереження об'єкта у файл
     */
    public void save() throws IOException {
        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream(FILE_NAME));
        oos.writeObject(data);
        oos.close();
    }
    /**
     * Відновлення об'єкта з файлу
     */
    public void restore() throws IOException, ClassNotFoundException {
        ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream(FILE_NAME));
        data = (NumberData) ois.readObject();
        ois.close();
    }
}