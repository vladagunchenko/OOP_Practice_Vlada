package Task2_Serialization;
import java.io.Serializable;
/**
 * Клас зберігає початкове число та його представлення
 * у двійковій, вісімковій та шістнадцятковій системах.
 * Реалізує Serializable для можливості серіалізації.
 *
 */
public class NumberData implements Serializable {
    /** Унікальний ідентифікатор версії класу */
    private static final long serialVersionUID = 1L;
    /** Початкове число */
    private int number;
    /** Двійкове представлення */
    private String binary;
    /** Вісімкове представлення */
    private String octal;
    /** Шістнадцяткове представлення (НЕ буде серіалізуватись) */
    private transient String hex;
    /**
     * Конструктор без параметрів
     */
    public NumberData() {
    }
    /**
     * Конструктор з параметрами
     */
    public NumberData(int number, String binary, String octal, String hex) {
        this.number = number;
        this.binary = binary;
        this.octal = octal;
        this.hex = hex;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getBinary() {
        return binary;
    }
    public void setBinary(String binary) {
        this.binary = binary;
    }
    public String getOctal() {
        return octal;
    }
    public void setOctal(String octal) {
        this.octal = octal;
    }
    public String getHex() {
        return hex;
    }
    public void setHex(String hex) {
        this.hex = hex;
    }
    @Override
    public String toString() {
        return "Число: " + number +
                "\nДвійкове: " + binary +
                "\nВісімкове: " + octal +
                "\nШістнадцяткове: " + hex;
    }
}