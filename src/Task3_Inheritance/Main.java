package Task3_Inheritance;

public class Main {

    public static void main(String[] args) {

        ResultFactory factory = new SimpleResultFactory();
        ResultCollection collection = new ResultCollection();

        CalcResult r1 = factory.createResult(10.5);
        CalcResult r2 = factory.createResult(25.7);

        collection.add(r1);
        collection.add(r2);

        for (CalcResult r : collection.getResults()) {
            r.display();
        }
    }
}