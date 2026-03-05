package Task4_Polymorphism;
import Task3_Inheritance.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ResultFactory factory = new ViewableTable();
        ResultCollection collection = new ResultCollection();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers (0 to stop):");
        while (true) {
            double val = scanner.nextDouble();

            if (val == 0) {
                break;
            }
            collection.add(factory.createResult(val));
        }
        ViewTable table = new ViewTable(12);
        table.displayTable(collection.getResults());
    }
}1